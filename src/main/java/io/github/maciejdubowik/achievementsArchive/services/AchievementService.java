package io.github.maciejdubowik.achievementsArchive.services;

import io.github.maciejdubowik.achievementsArchive.dtos.AchievementAddDto;
import io.github.maciejdubowik.achievementsArchive.model.Achievement;

public interface AchievementService {
    Achievement saveAchievement(AchievementAddDto addDto);
}
