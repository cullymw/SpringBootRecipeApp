package com.cullymw.RecipeApp.Controller;

import com.cullymw.RecipeApp.Service.StepService;
import com.cullymw.RecipeApp.Model.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "step")
public class StepController {
    private final StepService stepService;

    @Autowired
    StepController(StepService stepService) {
        this.stepService = stepService;
    }

    @GetMapping
    public List<Step> getSteps() {
        return stepService.getSteps();
    }

//    @PostMapping
//    public void addStep() {
//        stepService.addStep();
//    }
//
//    @PutMapping(path = "/{id}")
//    public void updateStep() {
//        stepService.updateStep();
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public void deleteStep() {
//        stepService.deleteStep();
//    }
}
