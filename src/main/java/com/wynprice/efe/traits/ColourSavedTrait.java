package com.wynprice.efe.traits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ColourSavedTrait extends SavedTrait {

    public float valueR;
    public float valueG;
    public float valueB;

    public float baseColourR;
    public float baseColourG;
    public float baseColourB;

    public float modifierR;
    public float modifierG;
    public float modifierB;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.valueR = dis.readFloat();
        this.valueG = dis.readFloat();
        this.valueB = dis.readFloat();

        this.baseColourR = dis.readFloat();
        this.baseColourG = dis.readFloat();
        this.baseColourB = dis.readFloat();

        this.modifierR = dis.readFloat();
        this.modifierG = dis.readFloat();
        this.modifierB = dis.readFloat();
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.valueR);
        dos.writeFloat(this.valueG);
        dos.writeFloat(this.valueB);

        dos.writeFloat(this.baseColourR);
        dos.writeFloat(this.baseColourG);
        dos.writeFloat(this.baseColourB);

        dos.writeFloat(this.modifierR);
        dos.writeFloat(this.modifierG);
        dos.writeFloat(this.modifierB);
    }
}
