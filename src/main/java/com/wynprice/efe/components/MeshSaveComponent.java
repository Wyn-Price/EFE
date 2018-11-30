package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class MeshSaveComponent extends SaveComponent {

    public int currentStage;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.currentStage = dis.readInt();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeInt(this.currentStage);
    }
}
