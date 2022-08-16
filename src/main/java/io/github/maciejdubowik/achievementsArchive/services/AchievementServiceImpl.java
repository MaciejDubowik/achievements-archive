package io.github.maciejdubowik.achievementsArchive.services;

import io.github.maciejdubowik.achievementsArchive.controllers.AchievementController;
import io.github.maciejdubowik.achievementsArchive.dtos.AchievementAddDto;
import io.github.maciejdubowik.achievementsArchive.model.Achievement;
import io.github.maciejdubowik.achievementsArchive.repositories.AchivementRepository;
import org.springframework.stereotype.Service;
import java.sql.Date;

@Service
public class AchievementServiceImpl implements AchievementService {

    private AchivementRepository achivementRepository;
    private AchievementController achievementController;

    public AchievementServiceImpl(AchivementRepository achivementRepository, AchievementController achievementController) {
        this.achivementRepository = achivementRepository;
        this.achievementController = achievementController;
    }

    @Override
    public Achievement saveAchievement(AchievementAddDto addDto) {
        Achievement achievement = new Achievement(
                Date.valueOf(addDto.getDate()),
                addDto.getName(),
                addDto.getInfo(),
                addDto.getCategory());
        return achivementRepository.save(achievement);
    }
}
