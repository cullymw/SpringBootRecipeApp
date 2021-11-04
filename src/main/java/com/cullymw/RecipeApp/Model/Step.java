package com.cullymw.RecipeApp.Model;

public class Step {
    Long id;
    int orderNumber;
    String description;

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
