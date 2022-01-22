//package com.cullymw.RecipeApp.Controller;
//
//import com.cullymw.RecipeApp.Model.Recipe;
//import com.cullymw.RecipeApp.Service.RecipeService;
//import org.junit.jupiter.api.Test;
//import org.junit.platform.engine.TestExecutionResult;
//import org.mockito.Mockito;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@WebMvcTest(RecipeController.class)
//public class RecipeControllerTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private RecipeService mockRecipeService;
//
//    Recipe mockRecipe = new Recipe("testRecipe", "testAuthor", "testIngredients", "hard", "testCategory", true, true, true, true);
//    Recipe mockRecipe2 = new Recipe("testRecipe2", "testAuthor2", "testIngredients2", "easy", "testCategory2", false, false, false, false);
//
//    String mockRecipeString = "{name:testRecipe,author:testAuthor,ingredients:testIngredients,difficulty:hard,category:testCategory,vegan:true,vegetarian:true,peanutFree:true,glutenFree:true}";
//    String mockRecipe2String = "{name:testRecipe2,author:testAuthor2,ingredients:testIngredients2,difficulty:easy,category:testCategory2,vegan:false,vegetarian:false,peanutFree:false,glutenFree:false}";
//
//    @Test
//    public void getRecipesShouldReturnAllRecipes() throws Exception {
//        Mockito.when(mockRecipeService.getAllRecipes()).thenReturn(Arrays.asList(mockRecipe, mockRecipe2));
//
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/all")
//                .accept(MediaType.APPLICATION_JSON);
//
//        mockMvc.perform(requestBuilder)
//                .andExpect(TestExecutionResult.status().isOk)
//                .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
//
//    }
//}
