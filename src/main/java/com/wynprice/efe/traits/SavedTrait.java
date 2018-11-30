package com.wynprice.efe.traits;

import com.google.gson.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class SavedTrait {

    public static Map<Integer, Supplier<SavedTrait>> mode2SavedTrait = new HashMap<>();
    public static Map<Integer, Map<Integer, List<TraitType>>> blueprintId2ComponentId2TraitType = new HashMap<>();

    public String name;
    public int mode;

    public void read(DataInputStream dis) throws IOException {
    }

    public void write(DataOutputStream dos) throws IOException {

    }

    public static void init() {
        //Code generated code.

        //yikes

        Map<Integer, List<TraitType>> componentId2TraitType = new HashMap<>();

        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(1, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(2, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(3, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(4, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(5, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(6, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(7, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(8, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(9, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(10, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(11, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(12, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(13, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(14, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(15, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(16, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(17, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(18, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(19, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(20, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(21, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(23, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(25, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(26, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(27, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(28, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(30, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(31, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(32, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(33, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(35, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(36, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(37, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(38, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(39, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(40, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(41, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(42, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(43, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(44, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(45, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(46, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(47, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(48, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(49, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(50, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Arrays.asList(new TraitType("Edibility", 0), new TraitType("Yield", 0)));
        blueprintId2ComponentId2TraitType.put(51, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(52, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(53, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(54, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        blueprintId2ComponentId2TraitType.put(55, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(43, Collections.singletonList(new TraitType("Honey Production", 0)));
        blueprintId2ComponentId2TraitType.put(56, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(57, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(58, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(59, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(60, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(62, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        blueprintId2ComponentId2TraitType.put(63, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        blueprintId2ComponentId2TraitType.put(64, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(65, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(66, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(67, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(68, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(69, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(70, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(71, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(72, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(73, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(74, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(75, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(76, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(78, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(79, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(80, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(81, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(83, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(84, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(89, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(92, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(94, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Arrays.asList(new TraitType("Speed", 0), new TraitType("Bounce Power", 0)));
        blueprintId2ComponentId2TraitType.put(99, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(100, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(101, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(102, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(103, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(104, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(105, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(106, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(107, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(108, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(109, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(110, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(111, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(112, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(113, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(114, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(115, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(116, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(117, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(118, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(119, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(120, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(121, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(122, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(123, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(124, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(125, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(126, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(127, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(128, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(129, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(130, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(131, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(132, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(133, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(134, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(135, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(136, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(137, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(138, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(139, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(140, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(141, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(142, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(143, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(144, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        componentId2TraitType.put(11, Collections.singletonList(new TraitType("Speed", 0)));
        blueprintId2ComponentId2TraitType.put(145, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(146, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(148, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(149, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(150, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(151, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(152, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(153, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(154, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(155, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        blueprintId2ComponentId2TraitType.put(156, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(157, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(158, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(20, Collections.singletonList(new TraitType("Productivity", 0)));
        blueprintId2ComponentId2TraitType.put(159, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(14, Collections.singletonList(new TraitType("Edibility", 0)));
        blueprintId2ComponentId2TraitType.put(160, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        componentId2TraitType.put(2, Collections.singletonList(new TraitType("Colour", 1)));
        componentId2TraitType.put(6, Collections.singletonList(new TraitType("Disease Resist", 0)));
        blueprintId2ComponentId2TraitType.put(161, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(162, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(163, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(1000, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(1001, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(1002, componentId2TraitType);

        componentId2TraitType = new HashMap<>();
        componentId2TraitType.put(0, Collections.singletonList(new TraitType("Size", 0)));
        blueprintId2ComponentId2TraitType.put(1003, componentId2TraitType);


        mode2SavedTrait.put(0, FloatSavedTrait::new);
        mode2SavedTrait.put(1, ColourSavedTrait::new);
    }

    public static class TraitType {
        public String name;
        public int mode;

        public TraitType(String name, int mode) {
            this.name = name;
            this.mode = mode;
        }

        public SavedTrait create() {
            SavedTrait trait = mode2SavedTrait.get(this.mode).get();

            trait.name = this.name;
            trait.mode = this.mode;

            return trait;
        }
    }
}
