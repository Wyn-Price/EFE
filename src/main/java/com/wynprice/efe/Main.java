package com.wynprice.efe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializer;
import com.wynprice.efe.components.SaveComponent;
import com.wynprice.efe.traits.SavedTrait;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.util.EnumConverter;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;
import utils.FileUtils;

import java.io.*;
import java.nio.file.Path;

public class Main {

    public static Gson OUT_GSON = new GsonBuilder()
            .registerTypeAdapter(SaveComponent.class, (JsonDeserializer<SaveComponent>)(json, type, context) -> {
                SaveComponent comp = SaveComponent.componentID2componentFactory.get(json.getAsJsonObject().get("componentID").getAsInt()).get();
                //A little hack to allow for me to deserialize an ambiguous class to an object
                return new GsonBuilder().registerTypeAdapter(comp.getClass(), (InstanceCreator<SaveComponent>) t -> comp).create().fromJson(json, comp.getClass());
            })
            .registerTypeAdapter(SavedTrait.class, (JsonDeserializer<SavedTrait>)(json, type, context) -> {
                SavedTrait trait = SavedTrait.mode2SavedTrait.get(json.getAsJsonObject().get("mode").getAsInt()).get();
                //A little hack to allow for me to deserialize an ambiguous class to an object
                return new GsonBuilder().registerTypeAdapter(trait.getClass(), (InstanceCreator<SavedTrait>) t -> trait).create().fromJson(json, trait.getClass());
            })
            .create();

    public static void main(String[] args) {

        SaveComponent.init();
        SavedTrait.init();
        Task.init();

        OptionParser parser = new OptionParser();
        parser.allowsUnrecognizedOptions();

        OptionSpec<Path> input = parser.accepts("input", "The location of the input file").withRequiredArg().withValuesConvertedBy(new PathConverter(PathProperties.FILE_EXISTING));
        OptionSpec<Path> output = parser.accepts("output", "The location of the ouptut file").withRequiredArg().withValuesConvertedBy(new PathConverter());
        OptionSpec<Void> help = parser.accepts("help", "shows the help screen").forHelp();

        OptionSpec<Void> doForce = parser.accepts("force", "Forces the conversion to finish when things go wrong");
        OptionSpec<Void> compact = parser.accepts("compact", "If the output is a json, the json is not printed pretty. (Takes up less space)");

        OptionSpec<DataType> inData = parser.accepts("intype", "The input type. Will be automatically inferred from --input if left blank").withRequiredArg().withValuesConvertedBy(new EnumConverter<DataType>(DataType.class){});
        OptionSpec<DataType> outData = parser.accepts("outtype", "The output type. Will be automatically inferred from --output if left blank").withRequiredArg().withValuesConvertedBy(new EnumConverter<DataType>(DataType.class){});

        OptionSet set = parser.parse(args);

        if(set.has(help)) {
            try {
                parser.printHelpOn(System.out);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        DataType inDat = inData.value(set);
        DataType outDat = outData.value(set);

        Path inPath = input.value(set);
        Path outPath = output.value(set);

        if(inDat == null && inPath != null) {
            String path = inPath.toString();
            String type = path.substring(path.lastIndexOf('.'));

            switch (type) {
                case ".dat":
                    inDat = DataType.SAVE;
                    break;
                case ".json":
                    inDat = DataType.JSON;
                    break;
                default:
                    throw new IllegalArgumentException("Could not infer data type from " + type);
            }
        }

        if(outDat == null && outPath != null) {
            String path = outPath.toString();
            String type = path.substring(path.lastIndexOf('.'));

            switch (type) {
                case ".dat":
                    outDat = DataType.SAVE;
                    break;
                case ".json":
                    outDat = DataType.JSON;
                    break;
                default:
                    throw new IllegalArgumentException("Could not infer data type from " + type);
            }
        }


        if(inPath == null || outPath == null) {
            System.err.println("Invalid arguments");
            try {
                parser.printHelpOn(System.err);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        boolean allowExceptions = !set.has(doForce);

        SavedInfomation info = new SavedInfomation();

        try(DataInputStream dis = new DataInputStream(new FileInputStream(input.value(set).toFile()))) {
            try {
                if(inDat == DataType.SAVE) {
                    info.readFromSave(dis);
                } else {
                    info = OUT_GSON.fromJson(new InputStreamReader(dis), SavedInfomation.class);
                }
            } catch (Exception e) {
                if(allowExceptions) {
                    throw e;
                }
                System.err.println("Error loading data from input.");
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(output.value(set).toFile()))) {
            try {
                if(outDat == DataType.SAVE) {
                    info.exportToFile(dos);
                } else {
                    GsonBuilder gsonbuilder = new GsonBuilder();
                    if(!set.has(compact)) {
                        gsonbuilder.setPrettyPrinting();
                    }
                    String out = gsonbuilder.create().toJson(info);
                    for(char c : out.toCharArray()) {
                        dos.write(c);
                    }
                }
            } catch (Exception e) {
                if(allowExceptions) {
                    throw e;
                }
                System.err.println("Error loading data from output. ");
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public enum DataType {
        SAVE, JSON
    }
}
