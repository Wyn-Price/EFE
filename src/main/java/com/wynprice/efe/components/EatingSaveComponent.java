package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class EatingSaveComponent extends SaveComponent {

    public float hungerPoints;
    public String[] dietList = new String[0];

    public EatingSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hungerPoints = dis.readFloat();
        this.dietList = new String[dis.readInt()];
        for (int i = 0; i < this.dietList.length; i++) {
            this.dietList[i] = dis.readUTF();
        }
    }
}
