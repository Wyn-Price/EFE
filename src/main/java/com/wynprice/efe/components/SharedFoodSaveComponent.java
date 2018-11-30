package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class SharedFoodSaveComponent extends SaveComponent {

    private int remaningPortions;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.remaningPortions = dis.readInt();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeInt(this.remaningPortions);
    }

    @Override
    public boolean isValid() {
        return sharedFoods.contains(this.blueprintID);
    }
}
