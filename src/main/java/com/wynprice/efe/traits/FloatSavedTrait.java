package com.wynprice.efe.traits;

import java.io.DataInputStream;
import java.io.IOException;

public class FloatSavedTrait extends SavedTrait {

    public float value;
    public float base;
    public int modifier;

    public FloatSavedTrait(String name) {
        super(name);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.value = dis.readFloat();
        this.base = dis.readFloat();
        this.modifier = dis.readInt();
    }
}
