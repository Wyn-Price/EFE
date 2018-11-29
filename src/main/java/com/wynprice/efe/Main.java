package com.wynprice.efe;

import com.google.gson.GsonBuilder;
import com.wynprice.efe.components.SaveComponent;
import com.wynprice.efe.traits.SavedTrait;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        SaveComponent.init();
        SavedTrait.init();
        Task.init();

        OptionParser parser = new OptionParser();
        parser.allowsUnrecognizedOptions();

        OptionSpec<Path> input = parser.accepts("input", "The location of the input file").withRequiredArg().withValuesConvertedBy(new PathConverter(PathProperties.FILE_EXISTING));
        OptionSpec<Path> output = parser.accepts("output", "The location of the ouptut file").withRequiredArg().withValuesConvertedBy(new PathConverter());
        OptionSpec<Void> help = parser.accepts("help", "shows the help screen").forHelp();

        OptionSet set = parser.parse("--input", "C:\\Users\\Wyn Price\\Desktop\\Equilinox_0_Saves\\Equilinox_0-0-Save_1.dat", "--output", "C:\\Users\\Wyn Price\\Desktop\\Equilinox_0_Saves\\ttt.json");


        if(set.has(help)) {
            try {
                parser.printHelpOn(System.out);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        if(set.has("--worldsave")) {
            throw new IllegalArgumentException("not yet implimented"); //todo
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(input.value(set).toFile()))) {
            SavedInfomation info = new SavedInfomation();
            info.readFrom(dis);

            String out = new GsonBuilder().setPrettyPrinting().create().toJson(info);
            try(FileOutputStream fos = new FileOutputStream(output.value(set).toFile())) {
                for(char c : out.toCharArray()) {
                    fos.write(c);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
