package com.cullymw.RecipeApp.Service;

import com.cullymw.RecipeApp.Model.Step;
import com.cullymw.RecipeApp.Repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StepService {
    private final StepRepository stepRepository;

    @Autowired
    StepService(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }

    public List<Step> getSteps() {
        return stepRepository.findAll();
    }

//    public void addStep() {
//        stepRepository.save();
//    }
//
//    public void updateStep() {
//        stepRepository.update();
//    }
//
//    public void deleteStep() {
//        stepRepository.delete();
//    }
}
