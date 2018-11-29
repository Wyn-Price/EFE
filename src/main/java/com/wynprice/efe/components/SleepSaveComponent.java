package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class SleepSaveComponent extends SaveComponent {
    public boolean asleep;


    @Override
    public void read(DataInputStream dis) throws IOException {
        this.asleep = dis.readBoolean();
    }
}
