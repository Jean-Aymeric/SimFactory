package com.jad.simfactory.structure;

import java.util.ArrayList;

public class Recipe {
    private final Product product;
    private final Action action;
    private final ArrayList<Product> products;

    public Recipe(final Product product, final Action action) {
        this.product = product;
        this.action = action;
        this.products = new ArrayList<>();
    }

    public Product getProduct() {
        return this.product;
    }

    public String getActionLabel() {
        return this.action.label();
    }

    public Action getAction() {
        return this.action;
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

    public void addProduct(final Product product) {
        if (!this.products.contains(product)) {
            this.products.add(product);
        }
    }

    public long getDuration() {
        return this.action.delay();
    }
}
