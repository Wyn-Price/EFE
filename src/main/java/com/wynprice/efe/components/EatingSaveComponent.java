package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class EatingSaveComponent extends SaveComponent {

    public float hungerPoints;
    public String[] dietList = new String[0];

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hungerPoints = dis.readFloat();
        this.dietList = new String[dis.readInt()];
        for (int i = 0; i < this.dietList.length; i++) {
            this.dietList[i] = dis.readUTF();
        }
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeFloat(this.hungerPoints);
        dos.writeInt(this.dietList.length);
        for (String s : this.dietList) {
            dos.writeUTF(s);
        }
    }
}
