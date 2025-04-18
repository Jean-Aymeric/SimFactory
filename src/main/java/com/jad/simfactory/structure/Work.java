package com.jad.simfactory.structure;

import java.util.ArrayList;

public class Work implements Runnable {
    private final MachineTool machineTool;
    private final ArrayList<Recipe> recipes;

    public Work(final MachineTool machineTool) {
        this.machineTool = machineTool;
        this.recipes = new ArrayList<>();
    }

    public MachineTool getMachineTool() {
        return this.machineTool;
    }

    public ArrayList<Recipe> getRecipes() {
        return new ArrayList<>(this.recipes);
    }

    public void addRecipe(final Recipe recipe) {
        this.recipes.add(recipe);
    }

    @Override
    public void run() {
        // todo: implement the run method
    }
}
