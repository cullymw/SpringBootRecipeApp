package com.cullymw.RecipeApp.Config;

import com.cullymw.RecipeApp.Model.Recipe;
import com.cullymw.RecipeApp.Model.Step;
import com.cullymw.RecipeApp.Repository.RecipeRepository;
import com.cullymw.RecipeApp.Repository.StepRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DBConfig {
    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository, StepRepository stepRepository) {
        return args -> {

            Recipe recipe1 = new Recipe(
                "RecipeOne",
                    "Me",
                    "Sugar, water, flour",
                    "Hard",
                    "BBQ",
                    true,
                    true,
                    true,
                    true
            );

            Recipe recipe2 = new Recipe(
                    "RecipeTwo",
                    "You",
                    "Pasta, sauce, meatball",
                    "Easy",
                    "Pasta",
                    false,
                    false,
                    false,
                    false
            );

            Step step1 = new Step(1, "Step 1 for recipe 1", recipe1);
            Step step2 = new Step(2, "Step 2 for recipe 1", recipe1);
            ArrayList<Step> stepArrayList1 = new ArrayList<>();
            stepArrayList1.add(step1);
            stepArrayList1.add(step2);

            Step step3 = new Step(1, "Step 1 for recipe 2", recipe2);
            Step step4 = new Step(2, "Step 2 for recipe 2", recipe2);
            ArrayList<Step> stepArrayList2 = new ArrayList<>();
            stepArrayList1.add(step3);
            stepArrayList1.add(step4);

            recipe1.setSteps(stepArrayList1);
            recipe2.setSteps(stepArrayList2);

            recipeRepository.saveAll(
                    List.of(recipe1, recipe2)
            );
        };
    }
}
