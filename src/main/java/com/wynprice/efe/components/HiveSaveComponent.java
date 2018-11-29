package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class HiveSaveComponent extends SaveComponent {

    public int honeyCount;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.honeyCount = dis.readInt();
    }
}
