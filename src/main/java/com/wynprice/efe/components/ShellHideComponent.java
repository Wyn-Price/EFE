package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ShellHideComponent extends SaveComponent {

    public boolean hidden;

    @Override
    public void read(DataInputStream dis) throws IOException {
        if(this.blueprintID == 12) {
            this.hidden = dis.readBoolean();
        }
    }

    @Override
    public void write(DataOutputStream dos) throws IOException {
        if(this.blueprintID == 12) {
            dos.writeBoolean(this.hidden);
        }
    }
}
