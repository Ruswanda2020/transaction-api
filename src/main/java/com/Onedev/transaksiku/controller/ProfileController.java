package com.Onedev.transaksiku.controller;

import com.Onedev.transaksiku.dto.GenericResponse;
import com.Onedev.transaksiku.dto.ProfileResponse;
import com.Onedev.transaksiku.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/profile")
    public ResponseEntity<GenericResponse> getProfile() {

        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        ProfileResponse profile = profileService.getProfileByEmail(email);
        GenericResponse response = new GenericResponse<>(
                0,
                "Sukses",
                profile
        );
        return ResponseEntity.ok(response);
    }


}
