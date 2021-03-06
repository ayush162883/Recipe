package com.ayush.recipeproject.controller;

import com.ayush.recipeproject.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    private String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.recipes());
        return "index";
    }

}
