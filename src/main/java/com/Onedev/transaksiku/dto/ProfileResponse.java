package com.Onedev.transaksiku.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileResponse {

    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("last_name")
    String lastName;
    String email;

}
