package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DecomposeSaveComponent extends SaveComponent {
    public boolean decaying;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.decaying = dis.readBoolean();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeBoolean(this.decaying);
    }
}