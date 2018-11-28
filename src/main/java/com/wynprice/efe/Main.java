package com.wynprice.efe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wynprice.efe.components.SaveComponent;
import com.wynprice.efe.traits.SavedTrait;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        SaveComponent.init();
        SavedTrait.init();
        Task.init();

        File in = new File("C:\\Users\\Wyn Price\\Desktop\\Equilinox_0_Saves\\Equilinox_0-0-Save_1.dat");

        try(DataInputStream dis = new DataInputStream(new FileInputStream(in))) {
            SavedInfomation info = new SavedInfomation();
            info.readFrom(dis);

            String out = new GsonBuilder().setPrettyPrinting().create().toJson(info);
            try(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Wyn Price\\Desktop\\Equilinox_0_Saves\\test_out.json"))) {
                for(char c : out.toCharArray()) {
                    fos.write(c);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
