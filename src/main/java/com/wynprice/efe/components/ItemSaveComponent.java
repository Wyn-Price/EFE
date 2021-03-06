package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ItemSaveComponent extends SaveComponent {
    public float timeTillDecay;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.timeTillDecay = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.timeTillDecay);
    }
}
