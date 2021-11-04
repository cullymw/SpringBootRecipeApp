package com.cullymw.RecipeApp.Repository;

import com.cullymw.RecipeApp.Model.Step;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends JpaRepository<Step, Long> {
}
