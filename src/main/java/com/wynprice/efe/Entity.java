package com.wynprice.efe;

import com.wynprice.efe.components.SaveComponent;
import com.wynprice.efe.traits.SavedTrait;

public class Entity {
    public boolean isDead;

    public int blueprintID;
    public boolean isStatic;

    public int id;

    public SaveComponent[] components = new SaveComponent[0];
}
