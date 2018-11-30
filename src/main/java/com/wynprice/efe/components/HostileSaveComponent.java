package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class HostileSaveComponent extends SaveComponent {
    public float pacifyTime;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.pacifyTime = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.pacifyTime);
    }
}
