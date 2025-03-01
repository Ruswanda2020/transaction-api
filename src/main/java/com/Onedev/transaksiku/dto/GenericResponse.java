package com.Onedev.transaksiku.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericResponse<T> {

    private int status;
    private String message;
    private T data;
}
