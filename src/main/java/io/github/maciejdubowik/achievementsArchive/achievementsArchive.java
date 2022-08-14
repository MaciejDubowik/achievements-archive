package io.github.maciejdubowik.achievementsArchive;

import io.github.maciejdubowik.achievementsArchive.model.Achievement;
import io.github.maciejdubowik.achievementsArchive.repositories.AchivementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class achievementsArchive implements CommandLineRunner {
	@Autowired
	private AchivementRepository achivementRepository;
	public static void main(String[] args) {
		SpringApplication.run(achievementsArchive.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Achievement> achievementList = achivementRepository.findAll();
		achievementList.forEach(System.out::println);
	}
}
