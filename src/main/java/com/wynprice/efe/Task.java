package com.wynprice.efe;

import java.util.*;

public class Task {

    public static List<Integer> repeatedTasks = Arrays.asList(16, 25, 47, 48, 49, 50, 51, 52, 56);

    public static Map<Integer, List<Integer>> taskToRequirementType = new HashMap<>();

    public int id;
    public boolean repeated;
    public boolean autoCollect;
    public boolean notifyCollect;
    public boolean pinned;
    public boolean complete;
    public boolean locked;

    public TaskRequ[] taskRequs = new TaskRequ[0];

    public static void init() {
        taskToRequirementType.put(1, Collections.singletonList(0));
        taskToRequirementType.put(2, Arrays.asList(0, 0));
        taskToRequirementType.put(3, Arrays.asList(0, 2));
        taskToRequirementType.put(4, Collections.singletonList(1));
        taskToRequirementType.put(5, Collections.singletonList(2));
        taskToRequirementType.put(6, Collections.singletonList(1));
        taskToRequirementType.put(7, Collections.singletonList(1));
        taskToRequirementType.put(10, Collections.singletonList(2));
        taskToRequirementType.put(11, Collections.singletonList(2));
        taskToRequirementType.put(12, Collections.singletonList(1));
        taskToRequirementType.put(13, Arrays.asList(1, 1, 1, 1));
        taskToRequirementType.put(14, Arrays.asList(1, 1));
        taskToRequirementType.put(15, Collections.singletonList(1));
        taskToRequirementType.put(16, Collections.singletonList(1));
        taskToRequirementType.put(17, Collections.singletonList(3));
        taskToRequirementType.put(18, Collections.singletonList(1));
        taskToRequirementType.put(19, Collections.singletonList(2));
        taskToRequirementType.put(20, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(21, Collections.singletonList(1));
        taskToRequirementType.put(22, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(23, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(24, Collections.singletonList(1));
        taskToRequirementType.put(25, Collections.singletonList(1));
        taskToRequirementType.put(26, Arrays.asList(1, 1, 1, 1));
        taskToRequirementType.put(27, Collections.singletonList(1));
        taskToRequirementType.put(28, Arrays.asList(1, 1));
        taskToRequirementType.put(29, Collections.singletonList(2));
        taskToRequirementType.put(30, Arrays.asList(1, 1));
        taskToRequirementType.put(31, Collections.singletonList(1));
        taskToRequirementType.put(32, Arrays.asList(1, 1));
        taskToRequirementType.put(33, Collections.singletonList(1));
        taskToRequirementType.put(34, Arrays.asList(1, 1));
        taskToRequirementType.put(35, Collections.singletonList(1));
        taskToRequirementType.put(36, Arrays.asList(1, 1));
        taskToRequirementType.put(37, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(38, Collections.singletonList(1));
        taskToRequirementType.put(39, Collections.singletonList(1));
        taskToRequirementType.put(40, Collections.singletonList(1));
        taskToRequirementType.put(41, Collections.singletonList(1));
        taskToRequirementType.put(42, Collections.singletonList(1));
        taskToRequirementType.put(43, Arrays.asList(1, 1));
        taskToRequirementType.put(44, Arrays.asList(1, 1, 1, 1));
        taskToRequirementType.put(45, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(46, Arrays.asList(1, 1));
        taskToRequirementType.put(47, Collections.singletonList(1));
        taskToRequirementType.put(48, Arrays.asList(1, 1, 1));
        taskToRequirementType.put(49, Collections.singletonList(1));
        taskToRequirementType.put(50, Collections.singletonList(1));
        taskToRequirementType.put(51, Collections.singletonList(1));
        taskToRequirementType.put(52, Collections.singletonList(1));
        taskToRequirementType.put(53, Collections.singletonList(1));
        taskToRequirementType.put(54, Collections.singletonList(1));
        taskToRequirementType.put(55, Collections.singletonList(0));
        taskToRequirementType.put(56, Collections.singletonList(1));
    }

    public static class TaskRequ {
        public int id;
        public int count;
    }

}
