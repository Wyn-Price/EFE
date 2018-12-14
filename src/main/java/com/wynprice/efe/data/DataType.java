package com.wynprice.efe.data;

import java.util.Map;

public enum DataType {
    SAVE,
    JSON,
    UNKNOWN;

    public static DataType inferDataType(String extension) {
        switch (extension) {
            case ".dat":
                return DataType.SAVE;
            case ".json":
                return DataType.JSON;
            default:
                return DataType.UNKNOWN;
        }
    }
}