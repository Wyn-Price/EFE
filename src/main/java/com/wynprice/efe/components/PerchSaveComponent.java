package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class PerchSaveComponent extends SaveComponent {
    public boolean hasSlots;
    public Slot[] slots = new Slot[0];

    public PerchSaveComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hasSlots = dis.readBoolean();
        if(this.hasSlots) {
            this.slots = new Slot[dis.readInt()];
            for (int i = 0; i < this.slots.length; i++) {
                Slot slot = new Slot();
                slot.slotID = dis.readInt();
                slot.percherID = dis.readInt();
                this.slots[i] = slot;
            }
        }
    }

    public static class Slot {
        public int slotID;
        public int percherID;
    }

}
