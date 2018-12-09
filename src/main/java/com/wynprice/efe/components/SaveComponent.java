package com.wynprice.efe.components;

import com.wynprice.efe.traits.SavedTrait;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.function.Supplier;

public class SaveComponent {

    public static Map<Integer, List<Integer>> blueprint2Components = new HashMap<>();
    public static Map<Integer, Supplier<SaveComponent>> componentID2componentFactory = new HashMap<>();
    public static List<Integer> animalIDs = Arrays.asList(1, 8, 12, 14, 15, 23, 38, 41, 49, 50, 52, 55, 56, 63, 64, 65, 72, 73, 74, 75, 76, 78, 79, 84, 89, 92, 99, 145, 161);
    public static List<Integer> sharedFoods = Arrays.asList(104, 139, 140);

    public SavedTrait[] traits = new SavedTrait[0];

    public String componentName;
    public int blueprintID;
    public int componentID;


    public void read(DataInputStream dis) throws IOException {
    }

    public void write(DataOutputStream dos) throws IOException {
    }

    public static void init() {

        componentID2componentFactory.put(0, TransformSaveComponent::new);
        componentID2componentFactory.put(1, MeshSaveComponent::new);
        componentID2componentFactory.put(4, NameSaveComponent::new);
        componentID2componentFactory.put(5, InfoSaveComponent::new);
        componentID2componentFactory.put(6, LifeSaveComponent::new);
        componentID2componentFactory.put(13, EatingSaveComponent::new);
        componentID2componentFactory.put(14, SharedFoodSaveComponent::new);
        componentID2componentFactory.put(15, FruiterSaveComponent::new);
        componentID2componentFactory.put(16, GrowthSaveComponent::new);
        componentID2componentFactory.put(19, ShellHideComponent::new);
        componentID2componentFactory.put(21, DecaySaveComponent::new);
        componentID2componentFactory.put(22, BuildSaveComponent::new);
        componentID2componentFactory.put(24, HiveSaveComponent::new);
        componentID2componentFactory.put(25, PerchSaveComponent::new);
        componentID2componentFactory.put(26, BeaverSaveComponent::new);
        componentID2componentFactory.put(29, SleepSaveComponent::new);
        componentID2componentFactory.put(35, ItemSaveComponent::new);
        componentID2componentFactory.put(37, DecomposeSaveComponent::new);
        componentID2componentFactory.put(42, HostileSaveComponent::new);

        //Thank god for scripting languages
        put(1, 0, 1, 2, 5, 6, 16, 11, 12, 13, 4, 3, 18, 29, 19, 34);
        put(2, 0, 1, 5, 6, 2, 16, 28);
        put(3, 0, 1, 2, 5, 6, 16, 15, 14);
        put(4, 0, 1, 2, 10, 5, 6, 16, 28);
        put(5, 0, 1, 10, 2, 5, 6, 16, 8, 28, 25);
        put(6, 0, 1, 5);
        put(7, 0, 1, 2, 10, 5, 6, 16, 14);
        put(8, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 34, 4, 3, 18);
        put(9, 0, 1, 5);
        put(10, 0, 1, 10, 2, 5, 6, 16, 14);
        put(11, 0, 1, 10, 5, 6, 16, 15, 14);
        put(12, 0, 1, 5, 6, 16, 11, 12, 4, 13, 19);
        put(13, 0, 1, 10, 2, 5, 6, 16, 14);
        put(14, 0, 1, 2, 5, 6, 16, 11, 12, 19, 14);
        put(15, 0, 1, 2, 5, 6, 16, 11, 12, 19, 14);
        put(16, 0, 1, 10, 2, 5, 6, 16, 17);
        put(17, 0, 1, 10, 2, 5, 6, 16, 14);
        put(18, 0, 1, 10, 5, 6, 16);
        put(19, 0, 1, 10, 5, 6, 16);
        put(20, 0, 1, 10, 5, 6, 2, 16, 14);
        put(21, 0, 1, 2, 10, 5, 6, 16, 14);
        put(23, 0, 1, 2, 5, 6, 16, 11, 12, 44, 13);
        put(25, 0, 1, 2, 5, 6, 16, 28, 25);
        put(26, 0, 1, 10, 2, 5, 6, 16, 28);
        put(27, 0, 1, 2, 5, 6, 16, 15, 20, 28);
        put(28, 0, 1, 10, 2, 5, 6, 16, 28);
        put(30, 0, 1, 10, 2, 5, 6, 16, 8, 25);
        put(31, 0, 1, 2, 5, 6, 16, 14);
        put(32, 0, 1, 5, 2, 6, 16, 15, 20, 28, 25);
        put(33, 0, 1, 21, 14);
        put(35, 0, 1, 5);
        put(36, 0, 1, 10, 2, 5, 6, 16);
        put(37, 0, 1, 10, 5, 6, 16, 28, 25);
        put(38, 0, 1, 2, 5, 6, 16, 11, 12, 39, 3, 18);
        put(39, 0, 1, 2, 5, 6, 16, 14);
        put(40, 0, 1, 21, 14);
        put(41, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 34, 4);
        put(42, 0, 1, 10, 2, 5, 6, 16, 8, 28, 25);
        put(43, 0, 1, 5, 6, 16, 15, 20, 28);
        put(44, 0, 1, 21, 14);
        put(45, 0, 1, 2, 5, 6, 16, 14);
        put(46, 0, 1, 2, 5, 6, 16, 28, 25);
        put(47, 0, 1, 2, 5, 6, 16, 15, 20, 28);
        put(48, 0, 1, 21, 14);
        put(49, 0, 1, 2, 5, 6, 16, 11, 12, 19, 13, 41, 34);
        put(50, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 34, 4, 3, 18);
        put(51, 0, 1, 10, 5, 6, 16, 14);
        put(52, 0, 1, 2, 5, 6, 16, 11, 12, 13, 31, 19, 34, 4, 3, 18);
        put(53, 0, 1, 21, 14);
        put(54, 0, 1, 2, 5, 6, 16, 28, 25, 8);
        put(55, 0, 1, 5, 6, 16, 11, 12, 13);
        put(56, 0, 1, 2, 5, 6, 16, 11, 12, 23, 13, 33, 42, 43);
        put(57, 0, 1, 5, 22, 24, 14, 46);
        put(58, 0, 1, 10, 2, 5, 6, 16, 28, 25);
        put(59, 0, 1, 10, 2, 5, 6, 16, 14);
        put(60, 0, 1, 10, 5, 6, 2, 16, 14);
        put(62, 0, 1, 2, 5, 6, 16, 15, 14);
        put(63, 0, 1, 5, 6, 16, 11, 38, 12, 23, 36);
        put(64, 0, 1, 2, 5, 6, 16, 11, 38, 12, 23, 36);
        put(65, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 34, 4, 3, 18);
        put(66, 0, 1, 2, 5, 6, 16, 25, 28);
        put(67, 0, 1, 2, 5, 6, 16, 25, 28, 8);
        put(68, 0, 1, 5, 38, 22);
        put(69, 0, 1, 10, 2, 5, 6, 16, 28, 25, 8);
        put(70, 0, 1, 10, 5, 6, 16);
        put(71, 0, 1, 5, 6, 16, 15, 14, 25);
        put(72, 0, 1, 5, 6, 16, 11, 27, 12, 4, 33, 32, 13, 42);
        put(73, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 4);
        put(74, 0, 1, 2, 5, 6, 16, 11, 12, 39);
        put(75, 0, 1, 5, 6, 16, 11, 12, 19);
        put(76, 0, 1, 2, 5, 6, 16, 11, 12, 19, 14);
        put(78, 0, 1, 5, 2, 6, 16, 11, 12, 13, 4, 3, 18);
        put(79, 0, 1, 2, 5, 6, 16, 11, 12, 13, 19, 34, 4);
        put(80, 0, 1, 10, 5, 6, 2, 16, 14);
        put(81, 0, 1, 10, 2, 5, 6, 16, 28);
        put(83, 0, 1, 10, 5, 6, 16, 28);
        put(84, 0, 1, 5, 6, 16, 11, 27, 12, 4, 33, 32, 13);
        put(89, 0, 1, 5, 6, 16, 11, 27, 12, 26, 13, 19, 34, 36, 4);
        put(92, 0, 1, 5, 2, 6, 16, 11, 12, 13, 29, 30, 4, 19, 33, 3, 18, 34);
        put(94, 0, 1, 2, 5, 6, 16, 15, 20, 28, 25);
        put(99, 0, 1, 5, 6, 16, 11, 12, 4, 19, 13, 34);
        put(100, 0, 1, 2, 21);
        put(101, 0, 1, 2, 21, 14);
        put(102, 0, 1, 2, 5, 22, 37);
        put(103, 0, 1, 10, 2, 5, 6, 16, 14);
        put(104, 0, 1, 5, 35, 14);
        put(105, 0, 1, 10, 5, 6, 16);
        put(106, 0, 1, 10, 2, 5, 6, 16, 14);
        put(107, 0, 1, 10, 5, 6, 16, 14);
        put(108, 0, 1, 10, 2, 5, 6, 16, 14);
        put(109, 0, 1, 2, 5, 6, 16, 28, 25);
        put(110, 0, 1, 10, 2, 5, 6, 16, 28, 25);
        put(111, 0, 1, 10, 2, 5, 6, 16, 14);
        put(112, 0, 1, 10, 2, 5, 6, 16, 28, 25);
        put(113, 0, 1, 2, 5, 6, 16, 25, 28);
        put(114, 0, 1, 10, 5, 6, 2, 16, 14);
        put(115, 0, 1, 10, 5, 6, 2, 16, 14);
        put(116, 0, 1, 10, 5, 6, 2, 16, 14);
        put(117, 0, 1, 10, 2, 5, 6, 16, 14);
        put(118, 0, 1, 10, 5, 6, 2, 16, 14);
        put(119, 0, 1, 2, 5, 6, 16, 14);
        put(120, 0, 1, 10, 5, 6, 16, 14);
        put(121, 0, 1, 10, 5, 6, 16);
        put(122, 0, 1, 2, 5, 6, 16, 28);
        put(123, 0, 1, 10, 5, 6, 16, 14);
        put(124, 0, 1, 10, 5, 6, 16, 28);
        put(125, 0, 1, 5, 6, 16, 25, 28);
        put(126, 0, 1, 2, 5, 6, 16, 14);
        put(127, 0, 1, 2, 10, 5, 6, 16, 14);
        put(128, 0, 1, 2, 10, 5, 6, 16, 14);
        put(129, 0, 1, 2, 10, 5, 6, 16, 14);
        put(130, 0, 1, 10, 5, 6, 16);
        put(131, 0, 1, 5, 6, 16, 28, 25);
        put(132, 0, 1, 10, 5, 6, 16, 28);
        put(133, 0, 1, 10, 2, 5, 6, 16, 15, 14);
        put(134, 0, 1, 5);
        put(135, 0, 1, 2, 5, 6, 16, 28);
        put(136, 0, 1, 10, 2, 5, 6, 16, 14);
        put(137, 0, 1, 2, 5, 6, 16, 15, 20, 28, 25);
        put(138, 0, 1, 21, 14);
        put(139, 0, 1, 5, 35, 14);
        put(140, 0, 1, 5, 35, 14);
        put(141, 0, 1, 21, 14);
        put(142, 0, 1, 5, 6, 16, 14);
        put(143, 0, 1, 5, 6, 16, 14);
        put(144, 0, 1, 2, 10, 5, 6, 16, 14);
        put(145, 0, 1, 5, 6, 16, 11, 12, 13, 19, 34, 45, 4);
        put(146, 0, 1, 10, 5, 6, 16, 28, 25);
        put(148, 0, 1, 5, 6, 16, 15, 14);
        put(149, 0, 1, 10, 5, 6, 16, 14);
        put(150, 0, 1, 2, 5, 6, 16, 28, 25, 8);
        put(151, 0, 1, 5, 6, 2, 16, 14);
        put(152, 0, 1, 5, 6, 2, 16, 14);
        put(153, 0, 1, 5, 6, 2, 16, 14, 47);
        put(154, 0, 1, 5, 6, 2, 16, 14);
        put(155, 0, 1, 2, 5, 6, 16, 28);
        put(156, 0, 1, 2, 5, 6, 16, 28, 25, 8);
        put(157, 0, 1, 5, 6, 2, 16, 14, 8);
        put(158, 0, 1, 21, 8, 9);
        put(159, 0, 1, 5, 6, 16, 15, 20, 28, 25);
        put(160, 0, 1, 5, 21, 14, 8, 9);
        put(161, 0, 1, 2, 5, 6, 16, 11, 38, 12, 23, 36);
        put(162, 0, 1, 5);
        put(163, 0, 1, 5);
        put(1000, 0, 1);
        put(1001, 0, 1);
        put(1002, 0, 1);
        put(1003, 0, 1);
    }


    private static void put(int id, int... components) {
        List<Integer> list = new ArrayList<>();
        for (int i : components) {
            list.add(i);
        }
        blueprint2Components.put(id, list);
    }
}
