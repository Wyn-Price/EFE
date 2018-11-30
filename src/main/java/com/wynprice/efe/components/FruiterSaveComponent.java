package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FruiterSaveComponent extends SaveComponent {

    public float currentFruitStage;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.currentFruitStage = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.currentFruitStage);
    }
}
