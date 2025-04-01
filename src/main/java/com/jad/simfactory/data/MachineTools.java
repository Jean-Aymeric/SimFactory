package com.jad.simfactory.data;

import com.jad.simfactory.structure.Action;
import com.jad.simfactory.structure.MachineTool;

import java.util.ArrayList;

class MachineTools extends FactoryData<MachineTool> {
    private final static int NbMachineTools = 20;
    @Override
    protected void generateDataSet() {
        ArrayList<Action> actions = new Actions().getDataSet();
        for (int i = 0; i < MachineTools.NbMachineTools; i++) {
            MachineTool machineTool = new MachineTool(String.valueOf((char)('A' + i)));
            for (Action action : actions) {
                machineTool.addAction(action);
            }
            this.addData(machineTool);
        }
    }
}
