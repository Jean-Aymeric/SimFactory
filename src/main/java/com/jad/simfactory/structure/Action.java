package com.jad.simfactory.structure;

public record Action(String label, int nbProducts, int delay) {
    public static int getNbProducts(final Action action) {
        return action.nbProducts();
    }
}
