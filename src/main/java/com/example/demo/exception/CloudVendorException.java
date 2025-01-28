package com.example.demo.exception;

import org.springframework.http.HttpStatus;


public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus status;

    public CloudVendorException(String message, HttpStatus status, Throwable throwable) {
        this.message = message;
        this.status = status;
        this.throwable = throwable;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
