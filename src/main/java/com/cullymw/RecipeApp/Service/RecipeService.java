package com.cullymw.RecipeApp.Service;

import com.cullymw.RecipeApp.Model.Recipe;
import com.cullymw.RecipeApp.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }

//    public void addRecipe() {
//        recipeRepository.save();
//    }
//
//    public void updateRecipe() {
//        recipeRepository.update();
//    }
//
//    public void deleteRecipe() {
//        recipeRepository.delete();
//    }
}
