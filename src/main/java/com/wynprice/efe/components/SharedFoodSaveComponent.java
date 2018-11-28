package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class SharedFoodSaveComponent extends SaveComponent {

    private int remaningPortions;

    public SharedFoodSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.remaningPortions = dis.readInt();
    }
}
