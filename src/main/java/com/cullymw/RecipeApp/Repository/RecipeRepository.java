package com.cullymw.RecipeApp.Repository;

import com.cullymw.RecipeApp.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
