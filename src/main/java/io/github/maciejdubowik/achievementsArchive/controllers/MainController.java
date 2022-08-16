package io.github.maciejdubowik.achievementsArchive.controllers;

import io.github.maciejdubowik.achievementsArchive.dtos.AchievementAddDto;
import io.github.maciejdubowik.achievementsArchive.services.AchievementService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class MainController {
    private AchievementService achievementService;

    public MainController(AchievementService achievementService) {
        this.achievementService = achievementService;
    }

    @ModelAttribute("achievement")
    public AchievementAddDto addDto(){
        return new AchievementAddDto();
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("name", "Johny");
        return "index";
    }

    @PostMapping
    public String addAchievement(@ModelAttribute("achievement") AchievementAddDto addDto) {
        try {
            achievementService.saveAchievement(addDto);
            return "redirect:/index?success";
    }catch (DuplicateKeyException e){
            return "redirect:/index?error";
        }
    }
}
