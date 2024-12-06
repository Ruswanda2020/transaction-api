package com.Onedev.transaksiku.service;

import com.Onedev.transaksiku.dto.LoginRequest;
import com.Onedev.transaksiku.dto.RegisterRequest;

public interface AuthService {

    String login(LoginRequest loginRequest);
    String Register(RegisterRequest registerDto);
}
