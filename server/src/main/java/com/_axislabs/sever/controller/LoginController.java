package com._axislabs.sever.controller;


import com._axislabs.sever.DTO.JWTResponse;
import com._axislabs.sever.DTO.LoginRequest;
import com._axislabs.sever.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<JWTResponse> login(@RequestBody LoginRequest loginRequest) {
        JWTResponse response = userService.authenticate(loginRequest);
        if (response.getToken() != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(new JWTResponse("Invalid credentials"));
        }
    }
}
