package com.jad.simfactory.data;

import com.jad.simfactory.structure.*;

import java.util.ArrayList;

public class SimFactoryData {
    private final Actions actions;
    private final MachineTools machineTools;
    private final Products products;
    private final Recipes recipes;
    private final Works works;

    public SimFactoryData() {
        this.actions = new Actions();
        this.actions.generateDataSet();
        this.machineTools = new MachineTools();
        this.machineTools.generateDataSet();
        this.products = new Products();
        this.products.generateDataSet();
        this.recipes = new Recipes(this.actions.getDataSet(), this.products.getDataSet());
        this.recipes.generateDataSet();
        this.works = new Works(this.recipes.getDataSet(), this.machineTools.getDataSet());
        this.works.generateDataSet();
    }

    public ArrayList<Action> getActions() {
        return this.actions.getDataSet();
    }

    public ArrayList<MachineTool> getMachineTools() {
        return this.machineTools.getDataSet();
    }

    public ArrayList<Product> getProducts() {
        return this.products.getDataSet();
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes.getDataSet();
    }

    public ArrayList<Work> getWorks() {
        return this.works.getDataSet();
    }
}
