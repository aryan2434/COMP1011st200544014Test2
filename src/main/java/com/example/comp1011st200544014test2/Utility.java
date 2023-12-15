package com.example.comp1011st200544014test2;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Utility {
    public static List<Business> getBusinessData(String fileName) {
        Gson gson = new Gson();
        try (
                FileReader fileReader = new FileReader(fileName);
        ) {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(fileReader).getAsJsonObject();

            Business business = gson.fromJson(jsonObject, Business.class);
            return Arrays.asList(business);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
