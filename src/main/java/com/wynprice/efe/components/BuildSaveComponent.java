package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class BuildSaveComponent extends SaveComponent {
    public int buildPoints;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.buildPoints = dis.readInt();
    }
}
