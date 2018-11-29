package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class ShellHideComponent extends SaveComponent {

    public boolean hidden;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.hidden = dis.readBoolean();
    }

    @Override
    public boolean isValid() {
        return this.blueprintID == 12;
    }
}
