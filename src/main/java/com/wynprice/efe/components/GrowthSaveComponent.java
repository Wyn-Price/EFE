package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class GrowthSaveComponent extends SaveComponent {
    public boolean fullyGrown;

    public int stageNumber;
    public float totalStageTime;
    public float currentStateTime;

    public GrowthSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.fullyGrown = dis.readBoolean();
        if(!this.fullyGrown) {
            this.stageNumber = dis.readInt();
            this.totalStageTime = dis.readFloat();
            this.currentStateTime = dis.readFloat();
        }
    }
}
