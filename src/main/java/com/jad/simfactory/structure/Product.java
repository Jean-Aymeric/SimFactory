package com.jad.simfactory.structure;

public class Product {
    private final String label;
    private Recipe recipe;

    public Product(final String label) {
        this.label = label;
        this.recipe = null;
    }

    public String getLabel() {
        return this.label;
    }

    public Recipe getRecipe() {
        return this.recipe;
    }

    public void setRecipe(final Recipe recipe) {
        if (this.recipe == null) {
            this.recipe = recipe;
        }
    }
}
