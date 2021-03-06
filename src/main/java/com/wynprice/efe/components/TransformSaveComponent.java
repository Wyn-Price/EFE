package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TransformSaveComponent extends SaveComponent {
    public float posX;
    public float posY;
    public float posZ;

    public float rotX;
    public float rotY;
    public float rotZ;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.posX = dis.readFloat();
        this.posY = dis.readFloat();
        this.posZ = dis.readFloat();

        this.rotX = dis.readFloat();
        this.rotY = dis.readFloat();
        this.rotZ = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.posX);
        dos.writeFloat(this.posY);
        dos.writeFloat(this.posZ);

        dos.writeFloat(this.rotX);
        dos.writeFloat(this.rotY);
        dos.writeFloat(this.rotZ);
    }
}
