package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class DecaySaveComponent extends SaveComponent {

    public float hoursAlive;

    public DecaySaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hoursAlive = dis.readFloat();
    }
}