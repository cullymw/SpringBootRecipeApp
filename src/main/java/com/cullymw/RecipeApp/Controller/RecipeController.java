package com.cullymw.RecipeApp.Controller;

import com.cullymw.RecipeApp.Model.Recipe;
import com.cullymw.RecipeApp.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "recipe")
public class RecipeController {
    private final RecipeService recipeService;

    @Autowired
    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

//    @PostMapping
//    public void addRecipe() {
//        recipeService.addRecipe();
//    }
//
//    @PutMapping(path = "/{id}")
//    public void updateRecipe() {
//        recipeService.updateRecipe();
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public void deleteRecipe() {
//        recipeService.deleteRecipe();
//    }
}
