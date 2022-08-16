package io.github.maciejdubowik.achievementsArchive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AchievementController {

    @GetMapping("/add")
    public String get(Model model){
        model.addAttribute("test", "swag");
        return "add";
    }

}
