package com.cullymw.RecipeApp.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String name;
    private String author;
    private String ingredients;
    private String difficulty;
//    private Boolean favorite;
    private String category;
    private Boolean vegan;
    private Boolean vegetarian;
    private Boolean peanutFree;
    private Boolean glutenFree;
    @JsonManagedReference
    @OneToMany(targetEntity = Step.class, mappedBy = "recipe", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Step> steps = new ArrayList<>();

    public Recipe() {
        super();
    }

    public Recipe(String name, String author, String ingredients, String difficulty, String category, Boolean vegan, Boolean vegetarian, Boolean peanutFree, Boolean glutenFree) {
        this.name = name;
        this.author = author;
        this.ingredients = ingredients;
        this.difficulty = difficulty;
        this.category = category;
        this.vegan = vegan;
        this.vegetarian = vegetarian;
        this.peanutFree = peanutFree;
        this.glutenFree = glutenFree;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Boolean getPeanutFree() {
        return peanutFree;
    }

    public void setPeanutFree(Boolean peanutFree) {
        this.peanutFree = peanutFree;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
