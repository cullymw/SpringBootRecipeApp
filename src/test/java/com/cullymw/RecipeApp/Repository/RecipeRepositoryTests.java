package com.cullymw.RecipeApp.Repository;

import com.cullymw.RecipeApp.Model.Recipe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class RecipeRepositoryTests {
    @Autowired
    private RecipeRepository recipeRepository;

    @BeforeEach
    void initUseCase() {
        List<Recipe> recipes = Arrays.asList(
                new Recipe("testRecipe", "testAuthor", "testIngredients", "hard", "testCategory", true, true, true, true)
        );
        recipeRepository.saveAll(recipes);
    }

    @AfterEach
    public void destroyAll(){
        recipeRepository.deleteAll();
    }

    @Test
    void saveAll_success() {
        List<Recipe> recipes = Arrays.asList(
                new Recipe("testRecipe2", "testAuthor2", "testIngredients2", "hard", "testCategory2", true, true, true, true),
                new Recipe("testRecipe3", "testAuthor3", "testIngredients3", "hard", "testCategory3", true, true, true, true),
                new Recipe("testRecipe4", "testAuthor4", "testIngredients4", "hard", "testCategory4", true, true, true, true)
        );
        Iterable<Recipe> allRecipe = recipeRepository.saveAll(recipes);

        Integer validIdFound = 0;
        for (Recipe recipe : allRecipe) {
            if(recipe.getId() >0 ){
                validIdFound++;
            }
        }

        Assertions.assertEquals(3, validIdFound);
    }

    @Test
    void findAll_success() {
        List<Recipe> allRecipe = recipeRepository.findAll();
        Assertions.assertEquals(1, allRecipe.size());
    }
}
