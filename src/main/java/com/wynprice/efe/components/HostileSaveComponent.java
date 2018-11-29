package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class HostileSaveComponent extends SaveComponent {
    public float pacifyTime;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.pacifyTime = dis.readFloat();
    }
}
