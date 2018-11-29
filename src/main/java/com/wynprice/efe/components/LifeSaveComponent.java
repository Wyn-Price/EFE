package com.wynprice.efe.components;

import java.io.DataInputStream;
import java.io.IOException;

public class LifeSaveComponent extends SaveComponent {

    public float enviromentSatisfaction;
    public float wellBeing;
    public float health;
    public float age;
    public short damagePoints;
    public float lifeExpectancy;
    public boolean sufferingDisease;
    public float diseaseDamage;
    public boolean breedingBoost;
    public float nextBreedTime;
    public int generation;
    public boolean evolutionCompleate;
    public int childSpeciesID;

    @Override
    public void read(DataInputStream dis) throws IOException {
        this.enviromentSatisfaction = dis.readFloat();
        this.wellBeing = dis.readFloat();
        this.health = dis.readFloat();
        this.age = dis.readFloat();
        this.damagePoints = dis.readShort();
        this.lifeExpectancy = dis.readFloat();
        if(animalIDs.contains(this.blueprintID)) {
            this.sufferingDisease = dis.readBoolean();
            this.diseaseDamage = dis.readFloat();
        }
        this.breedingBoost = dis.readBoolean();
        this.nextBreedTime = dis.readFloat();
        this.generation = dis.readInt();
        this.evolutionCompleate = dis.readBoolean();
        if(this.evolutionCompleate) {
            this.childSpeciesID = dis.readInt();
        }
    }
}
