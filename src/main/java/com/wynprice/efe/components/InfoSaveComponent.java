package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class InfoSaveComponent extends SaveComponent {
    public float posX;
    public float posY;
    public float posZ;

    public int parent;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.posX = dis.readFloat();
        this.posY = dis.readFloat();
        this.posZ = dis.readFloat();

        this.parent = dis.readInt();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.posX);
        dos.writeFloat(this.posY);
        dos.writeFloat(this.posZ);

        dos.writeInt(this.parent);
    }
}
