package com.jad.simfactory.data;

import com.jad.simfactory.structure.MachineTool;
import com.jad.simfactory.structure.Recipe;
import com.jad.simfactory.structure.Work;

import java.util.ArrayList;
import java.util.Random;

public class Works extends FactoryData<Work> {
    private final ArrayList<Recipe> recipes;
    private final ArrayList<MachineTool> machineTools;

    public Works(final ArrayList<Recipe> recipes, final ArrayList<MachineTool> machineTools) {
        this.recipes = recipes;
        this.machineTools = machineTools;
    }

    private static final int NbRecipes = 10;

    private Recipe getRandomRecipe() {
        return this.recipes.get(new Random().nextInt(this.recipes.size()));
    }

    @Override
    protected void generateDataSet() {
        for (MachineTool machineTool : this.machineTools) {
            this.addData(new Work(machineTool));
        }
        int idMachineTool = 0;
        for (int i = 0; i < Works.NbRecipes;i++) {
            this.dataSet.get(idMachineTool).addRecipe(this.getRandomRecipe());
            idMachineTool = (idMachineTool + 1) % this.dataSet.size();
        }
    }
}
