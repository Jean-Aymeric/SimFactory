package com.jad.simfactory.data;

import com.jad.simfactory.structure.Action;

class Actions extends FactoryData<Action> {
    @Override
    protected void generateDataSet() {
        this.addData(new Action("Perçage", 1, 2));
        this.addData(new Action("Polissage", 1, 3));
        this.addData(new Action("Vernissage", 1, 2));
        this.addData(new Action("Collage", 2, 5));
        this.addData(new Action("Vissage", 2, 4));
        this.addData(new Action("Assemblage", 2, 6));
        this.addData(new Action("Pliage", 1, 4));
        this.addData(new Action("Sertissage", 2, 4));
    }
}
