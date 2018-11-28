package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class NameSaveComponent extends SaveComponent {

    public String name;
    public boolean renamed;

    public NameSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.name = dis.readUTF();
        this.renamed = dis.readBoolean();
    }
}