package com._axislabs.sever.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonFileReader {
    private static final String FILE_PATH = "src/main/resources/users.json";

    public static Map<String, String> readUsers() {
        Map<String, String> users = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(new File(FILE_PATH));
            for (JsonNode userNode : rootNode) {
                String username = userNode.get("username").asText();
                String password = userNode.get("password").asText();
                users.put(username, password);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
}
