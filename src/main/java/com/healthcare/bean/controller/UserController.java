package com.healthcare.bean.controller;

import com.healthcare.bean.dto.LoginRequest;
import com.healthcare.bean.dto.LoginResponse;
import com.healthcare.bean.dto.SignupUserRequest;
import com.healthcare.bean.model.AppUser;
import com.healthcare.bean.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private final  UserService userService;


    // -------------Validation SignupUserResponce

    public UserController(UserService userService) {
        this.userService = userService;
    }


//   ---------------------  Signup here

    @PostMapping("/signup")
    public ResponseEntity<AppUser> signupUser(@Valid @RequestBody SignupUserRequest signupUserRequest) {
        AppUser savedUser = userService.signupUser(signupUserRequest);
        return ResponseEntity.ok(savedUser);
    }


//   -------------------------   Login here

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = userService.loginUser(loginRequest);
        return ResponseEntity.ok(response);
    }



}
