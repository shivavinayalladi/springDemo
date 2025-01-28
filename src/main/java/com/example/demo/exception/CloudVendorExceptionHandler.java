package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {CloudVendorNotFound.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CloudVendorNotFound cloudvendornotfound){
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudvendornotfound.getMessage(),
                HttpStatus.NOT_FOUND,
                cloudvendornotfound.getCause()
        );

        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
}
