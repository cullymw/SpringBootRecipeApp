package com.cullymw.RecipeApp.Repository;

import com.cullymw.RecipeApp.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Query("SELECT r FROM Recipe r WHERE UPPER(r.name) like CONCAT('%', ?1, '%') AND UPPER(r.author) LIKE CONCAT('%', ?2, '%') AND UPPER(r.difficulty) LIKE CONCAT('%', ?3, '%') AND UPPER(r.category) LIKE CONCAT('%', ?4, '%') AND r.vegan >= ?5 AND r.vegetarian >= ?6 AND r.peanutFree >= ?7 AND r.glutenFree >= ?8")
    public List<Recipe> searchRecipes(String name, String author, String difficulty, String category, boolean veganOnly, boolean vegetarianOnly, boolean peanutFree, boolean glutenFree);

}
