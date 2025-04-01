package com.jad;

import com.jad.simfactory.data.SimFactoryData;
import com.jad.simfactory.structure.Work;

public enum Main {
    ;
    public static void main(String[] args) {
        SimFactoryData simFactoryData = new SimFactoryData();
        System.out.println("Actions : " + simFactoryData.getActions().size());
        System.out.println("Machine outils : " + simFactoryData.getMachineTools().size());
        System.out.println("Produits : " + simFactoryData.getProducts().size());
        System.out.println("Recettes : " + simFactoryData.getRecipes().size());
        int nbWorks = 0;
        for (Work work: simFactoryData.getWorks()) {
            nbWorks += work.getRecipes().size();
        }
        System.out.println("Travaux : " + nbWorks);

        for (Work work : simFactoryData.getWorks()) {
            Thread thread = new Thread(work);
            thread.start();
        }
    }
}