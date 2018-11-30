package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DecaySaveComponent extends SaveComponent {

    public float hoursAlive;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hoursAlive = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.hoursAlive);
    }
}
