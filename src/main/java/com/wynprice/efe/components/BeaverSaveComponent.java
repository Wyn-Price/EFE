package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BeaverSaveComponent extends SaveComponent {
    public boolean denLocationImpossible;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.denLocationImpossible = dis.readBoolean();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeBoolean(this.denLocationImpossible);
    }
}
