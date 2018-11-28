package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class DecomposeSaveComponent extends SaveComponent {
    public boolean decaying;

    public DecomposeSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.decaying = dis.readBoolean();
    }
}