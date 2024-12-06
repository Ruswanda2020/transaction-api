package com.Onedev.transaksiku.service.impl;

import com.Onedev.transaksiku.dto.ProfileResponse;
import com.Onedev.transaksiku.entity.User;
import com.Onedev.transaksiku.repository.UserRepository;
import com.Onedev.transaksiku.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Override
    public ProfileResponse getProfileByEmail(String email) {
       User user  = userRepository.findByEmail(email)
               .orElseThrow(() -> new RuntimeException("Token tidak tidak valid atau kadaluwarsa"));

        return mapToDto(user);
    }

 private ProfileResponse mapToDto(User user){
  return modelMapper.map(user, ProfileResponse.class);
 }

}
