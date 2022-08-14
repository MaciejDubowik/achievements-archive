package io.github.maciejdubowik.achievementsArchive.repositories;

import io.github.maciejdubowik.achievementsArchive.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchivementRepository extends JpaRepository<Achievement, Integer> {
}
