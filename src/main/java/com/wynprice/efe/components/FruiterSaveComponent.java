package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class FruiterSaveComponent extends SaveComponent {

    public float currentFruitStage;

    public FruiterSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.currentFruitStage = dis.readFloat();
    }
}
