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

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public List<Recipe> getRecipes(String name, String author, String difficulty, String category, boolean veganOnly, boolean vegetarianOnly, boolean peanutFree, boolean glutenFree) {
        return recipeRepository.searchRecipes(name, author, difficulty, category, veganOnly, vegetarianOnly, peanutFree, glutenFree);
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
