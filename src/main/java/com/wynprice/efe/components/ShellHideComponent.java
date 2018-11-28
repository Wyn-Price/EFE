package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class ShellHideComponent extends SaveComponent {

    public boolean hidden;

    public ShellHideComponent(int componentID) {
        super(componentID);
    }

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hidden = dis.readBoolean();
    }
}
