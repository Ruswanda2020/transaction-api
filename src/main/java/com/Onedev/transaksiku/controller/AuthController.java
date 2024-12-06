package com.Onedev.transaksiku.controller;

import com.Onedev.transaksiku.dto.*;
import com.Onedev.transaksiku.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = {"/register", "/signup"})
    public ResponseEntity<GenericResponse> register(@RequestBody @Valid RegisterRequest registerRequest) {

        authService.Register(registerRequest);
        GenericResponse response = new GenericResponse<>(
                0,
                "Registrasi berhasil silahkan login",
                null
        );
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(value = {"/login","/signin"})
    public ResponseEntity<GenericResponse> login(@RequestBody @Valid  LoginRequest loginRequest){

        String token = authService.login(loginRequest);
        JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
        jwtAuthResponse.setToken(token);

        GenericResponse response = new GenericResponse<>(0, "Login Sukses", jwtAuthResponse);

        return ResponseEntity.ok(response);

    }

}
