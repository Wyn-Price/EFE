package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class SleepSaveComponent extends SaveComponent {
    public boolean asleep;

    public SleepSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.asleep = dis.readBoolean();
    }
}
