package com.Onedev.transaksiku.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class TransactionApiException extends RuntimeException{

    @Getter
    private HttpStatus httpStatus;
    @Getter
    private String message;
    @Getter
    private int errorStatus;

    public TransactionApiException(HttpStatus httpStatus, String message, int errorStatus){
        this.httpStatus = httpStatus;
        this.message = message;
        this.errorStatus = errorStatus;
    }
}
