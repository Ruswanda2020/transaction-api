package com.Onedev.transaksiku.service;

import com.Onedev.transaksiku.dto.ProfileResponse;

public interface ProfileService {
    ProfileResponse getProfileByEmail(String email);
}
