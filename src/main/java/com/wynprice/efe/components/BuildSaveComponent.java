package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BuildSaveComponent extends SaveComponent {
    public int buildPoints;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.buildPoints = dis.readInt();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeInt(this.buildPoints);
    }
}
