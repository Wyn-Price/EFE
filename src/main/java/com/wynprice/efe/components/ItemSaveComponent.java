package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class ItemSaveComponent extends SaveComponent {
    public float timeTillDecay;

    public ItemSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.timeTillDecay = dis.readFloat();
    }
}
