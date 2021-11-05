package com.cullymw.RecipeApp.Model;

import javax.persistence.*;

@Entity
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private int orderNumber;
    private String description;
    @ManyToOne()
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Step(Long id, int orderNumber, String description) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
