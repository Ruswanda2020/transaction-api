package com.Onedev.transaksiku.dto;

import java.time.LocalDateTime;

public class ErrorDetailsResponse {
    private LocalDateTime timestamp = LocalDateTime.now();
    private String message;
    private String details;

    public ErrorDetailsResponse(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
