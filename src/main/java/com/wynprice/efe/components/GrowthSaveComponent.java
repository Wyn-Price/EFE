package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class GrowthSaveComponent extends SaveComponent {
    public boolean fullyGrown;

    public int stageNumber;
    public float totalStageTime;
    public float currentStateTime;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.fullyGrown = dis.readBoolean();
        if(!this.fullyGrown) {
            this.stageNumber = dis.readInt();
            this.totalStageTime = dis.readFloat();
            this.currentStateTime = dis.readFloat();
        }
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        dos.writeBoolean(this.fullyGrown);
        if(!this.fullyGrown) {
            dos.writeInt(this.stageNumber);
            dos.writeFloat(this.totalStageTime);
            dos.writeFloat(this.currentStateTime);
        }
    }
}
