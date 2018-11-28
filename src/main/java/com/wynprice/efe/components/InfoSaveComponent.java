package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class InfoSaveComponent extends SaveComponent {
    public float posX;
    public float posY;
    public float posZ;

    public int parent;

    public InfoSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.posX = dis.readFloat();
        this.posY = dis.readFloat();
        this.posZ = dis.readFloat();

        this.parent = dis.readInt();
    }
}
