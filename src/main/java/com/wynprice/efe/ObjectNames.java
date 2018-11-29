package com.wynprice.efe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public enum ObjectNames {

    BLUEPRINTS,
    COMPONENTS,
    TASKS,
    TASKREQUIREMENTS;

    private Map<Integer, String> map = new HashMap<>();

    public String getName(int id) {
        if (this.map.isEmpty()) {
            generate();
        }
        return this.map.getOrDefault(id, "ERROR - NAME");
    }

    private Map<Integer, String> generate() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(ObjectNames.class.getResourceAsStream("/names/" + this.name().toLowerCase() + ".txt")))) {
            for(;;) {
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                String[] split = line.split(" -> ");
                if(split.length != 2) {
                    System.err.println("Error reading line " + line + ", split had a value of " + split.length);
                }
                this.map.put(Integer.valueOf(split[0]), split[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.map;
    }
}
