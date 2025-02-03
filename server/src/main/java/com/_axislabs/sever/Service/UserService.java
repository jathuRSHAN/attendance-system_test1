package com._axislabs.sever.Service;

import com._axislabs.sever.DTO.JWTResponse;
import com._axislabs.sever.DTO.LoginRequest;
import com._axislabs.sever.utils.JsonFileReader;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    public JWTResponse authenticate(LoginRequest loginRequest) {
        Map<String, String> users = JsonFileReader.readUsers();

        String storedPassword = users.get(loginRequest.getUsername());
        if (storedPassword != null && storedPassword.equals(loginRequest.getPassword())) {
            String token = JWTUtils.generateToken(loginRequest.getUsername());
            return new JWTResponse(token);
        }

        return new JWTResponse(null); // Return null if authentication fails
    }
}

