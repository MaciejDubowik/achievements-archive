package io.github.maciejdubowik.achievementsArchive.repositories;

import io.github.maciejdubowik.achievementsArchive.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchivementRepository extends JpaRepository<Achievement, Integer> {
}
