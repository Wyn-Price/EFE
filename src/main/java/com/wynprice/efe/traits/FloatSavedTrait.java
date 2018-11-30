package com.wynprice.efe.traits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FloatSavedTrait extends SavedTrait {

    public float value;
    public float base;
    public int modifier;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.value = dis.readFloat();
        this.base = dis.readFloat();
        this.modifier = dis.readInt();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.value);
        dos.writeFloat(this.base);
        dos.writeInt(this.modifier);
    }
}
