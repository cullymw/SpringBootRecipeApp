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

    @GetMapping(path = "/all")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping
    public List<Recipe> getRecipes(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "") String author,
            @RequestParam(defaultValue = "") String difficulty,
            @RequestParam(defaultValue = "") String category,
            @RequestParam(defaultValue = "false") boolean veganOnly,
            @RequestParam(defaultValue = "false") boolean vegetarianOnly,
            @RequestParam(defaultValue = "false") boolean peanutFree,
            @RequestParam(defaultValue = "false") boolean glutenFree
            ) {
        return recipeService.getRecipes(name, author, difficulty, category, veganOnly, vegetarianOnly, peanutFree, glutenFree);
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
    }

    @PutMapping(path = "/{id}")
    public void updateRecipe(@RequestBody Recipe recipe) {
        recipeService.updateRecipe(recipe.getId(), recipe);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }
}
