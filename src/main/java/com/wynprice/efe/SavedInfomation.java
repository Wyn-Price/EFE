package com.wynprice.efe;

import com.wynprice.efe.components.SaveComponent;
import com.wynprice.efe.traits.SavedTrait;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class SavedInfomation {
    public boolean corrupt;

    public long lastPlayed;
    public int tasksCompleated;
    public int population;
    public int dp;

    public float cameraPosX;
    public float cameraPosY;
    public float cameraPosZ;

    public float cameraYaw;
    public float cameraPitch;

    public int dp2; //The same as dp, just again
    public int dpPerMin;

    public int day;
    public float time;

    public int[] unlockedBlueprints;

    public float nextMutationTime;

    public EvolveProcess[] evolveProcesses;

    public int entityGridNextId;

    public Entity[] entities;

    public int seed;
    public float smoothness;
    public int vertexCount;
    public float waterHeight;

    public Item[] items;

    public Task[] tasks;

    public void readFromSave(DataInputStream dis) throws IOException {
        this.corrupt = dis.readBoolean();

        this.lastPlayed = dis.readLong();
        this.tasksCompleated = dis.readInt();
        this.population = dis.readInt();
        this.dp = dis.readInt();

        this.cameraPosX = dis.readFloat();
        this.cameraPosY = dis.readFloat();
        this.cameraPosZ = dis.readFloat();

        this.cameraYaw = dis.readFloat();
        this.cameraPitch = dis.readFloat();

        this.dp2 = dis.readInt();
        this.dpPerMin = dis.readInt();
        this.day = dis.readInt();
        this.time = dis.readFloat();

        int bpSize = dis.readInt();
        this.unlockedBlueprints = new int[bpSize];
        for (int i = 0; i < bpSize; i++) {
            this.unlockedBlueprints[i] = dis.readInt();
        }

        this.nextMutationTime = dis.readFloat();

        int evSize = dis.readInt();
        this.evolveProcesses = new EvolveProcess[evSize];
        for (int i = 0; i < evSize; i++) {
            EvolveProcess proc = new EvolveProcess();
            proc.childSpeciesID = dis.readInt();
            proc.evolvePoints = dis.readFloat();
            this.evolveProcesses[i] = proc;
        }

        this.entityGridNextId = dis.readInt();

        int enSize = dis.readInt();
        this.entities = new Entity[enSize];
        for (int i = 0; i < enSize; i++) {
            Entity entity = new Entity();
            int next = dis.readInt();
            entity.isDead = next == -1;
            if(!entity.isDead) {
                entity.blueprintID = next;
                entity.blueprintName = ObjectNames.BLUEPRINTS.getName(next);
                entity.isStatic = dis.readBoolean();
                entity.id = dis.readInt();


                List<SaveComponent> componentList = new ArrayList<>();
                List<Integer> components = SaveComponent.blueprint2Components.get(entity.blueprintID);
                Map<Integer, List<SavedTrait.TraitType>> ci2tt = SavedTrait.blueprintId2ComponentId2TraitType.get(entity.blueprintID);

                for (int comp : Objects.requireNonNull(components)) {
                    List<SavedTrait> savedTraits = new ArrayList<>();

                    if(ci2tt != null) { //Should always be nonnull
                        List<SavedTrait.TraitType> tt = ci2tt.get(comp);
                        if(tt != null) {
                            for (SavedTrait.TraitType type : tt) {
                                SavedTrait savedTrait = type.create();
                                savedTrait.read(dis);
                                savedTraits.add(savedTrait);
                            }
                        }
                    }
                    Supplier<SaveComponent> factory = SaveComponent.componentID2componentFactory.get(comp);
                    if(factory != null) {
                        SaveComponent saveComponent = factory.get();
                        saveComponent.blueprintID = entity.blueprintID;
                        saveComponent.componentID = comp;
                        saveComponent.componentName = ObjectNames.COMPONENTS.getName(saveComponent.componentID);
                        if(saveComponent.isValid()) {
                            saveComponent.read(dis);
                            saveComponent.traits = savedTraits.toArray(new SavedTrait[0]);
                            componentList.add(saveComponent);
                        }
                    }
                }
                entity.components = componentList.toArray(new SaveComponent[0]);
            }

            this.entities[i] = entity;
        }

        this.seed = dis.readInt();
        this.smoothness = dis.readFloat();
        this.vertexCount = dis.readInt();
        this.waterHeight = dis.readFloat();

        int itemSize = dis.readInt();
        this.items = new Item[itemSize];
        for (int i = 0; i < itemSize; i++) {
            Item item = new Item();
            item.blueprintID = dis.readInt();
            item.count = dis.readInt();
            this.items[i] = item;
        }

        int taskSize = dis.readInt();
        this.tasks = new Task[taskSize];
        for (int i = 0; i < taskSize; i++) {
            Task task = new Task();
            task.id = dis.readInt();
            task.name = ObjectNames.TASKS.getName(task.id);
            if(Task.repeatedTasks.contains(task.id)) {
                task.repeated = true;
                task.autoCollect = dis.readBoolean();
                task.notifyCollect = dis.readBoolean();
            }
            task.pinned = dis.readBoolean();
            task.complete = dis.readBoolean();
            task.locked = dis.readBoolean();
            if(!task.complete) {
                List<Task.TaskRequ> taskRequs = new ArrayList<>();
                List<Integer> list = Task.taskToRequirementType.get(task.id);
                if(list != null) { //Should always happen
                    for (Integer reqt : list) {
                        if(reqt != 0) { //0 is the only requirement that dosnt need saving
                            Task.TaskRequ ttr = new Task.TaskRequ();
                            ttr.id = reqt;
                            ttr.typeName = ObjectNames.TASKREQUIREMENTS.getName(ttr.id);
                            ttr.count = dis.readInt();
                            taskRequs.add(ttr);
                        }
                    }
                }
                task.taskRequs = taskRequs.toArray(new Task.TaskRequ[0]);
            }
            this.tasks[i] = task;
        }
    }

    public void exportToFile(DataOutputStream dos) throws IOException {
        dos.writeBoolean(this.corrupt);

        dos.writeLong(this.lastPlayed);
        dos.writeInt(this.tasksCompleated);
        dos.writeInt(this.population);
        dos.writeInt(this.dp);

        dos.writeFloat(this.cameraPosX);
        dos.writeFloat(this.cameraPosY);
        dos.writeFloat(this.cameraPosZ);

        dos.writeFloat(this.cameraYaw);
        dos.writeFloat(this.cameraPitch);

        dos.writeInt(this.dp2);
        dos.writeInt(this.dpPerMin);
        dos.writeInt(this.day);
        dos.writeFloat(this.time);

        dos.writeInt(this.unlockedBlueprints.length);
        for (int blueprint : this.unlockedBlueprints) {
            dos.writeInt(blueprint);
        }

        dos.writeFloat(this.nextMutationTime);

        dos.writeInt(this.evolveProcesses.length);
        for (EvolveProcess process : this.evolveProcesses) {
            dos.writeInt(process.childSpeciesID);
            dos.writeFloat(process.evolvePoints);
        }

        dos.writeFloat(this.entityGridNextId);

        dos.writeInt(this.entities.length);
        for (Entity entity : this.entities) {
            if(entity.isDead) {
                dos.writeInt(-1);
            } else {
                dos.writeInt(entity.blueprintID);
                dos.writeBoolean(entity.isStatic);
                dos.writeInt(entity.id);

                for (SaveComponent component : entity.components) {
                    for (SavedTrait trait : component.traits) {
                        trait.write(dos);
                    }
                    component.write(dos);
                }
            }
        }

        dos.writeInt(this.seed);
        dos.writeFloat(this.smoothness);
        dos.writeInt(this.vertexCount);
        dos.writeFloat(this.waterHeight);

        dos.writeInt(this.items.length);
        for (Item item : this.items) {
            dos.writeInt(item.blueprintID);
            dos.writeInt(item.count);
        }

        dos.writeInt(this.tasks.length);
        for (Task task : this.tasks) {
            dos.writeInt(task.id);
            if(Task.repeatedTasks.contains(task.id)) {
                dos.writeBoolean(task.autoCollect);
                dos.writeBoolean(task.notifyCollect);
            }
            dos.writeBoolean(task.pinned);
            dos.writeBoolean(task.complete);
            dos.writeBoolean(task.locked);
            if(!task.complete) {
                for (Task.TaskRequ requs : task.taskRequs) {
                    dos.writeInt(requs.count);
                }
            }
        }
    }
}
