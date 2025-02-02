package com.example.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> customResponseBuilder(String message, HttpStatus status,Object responseObj) {

        Map<String, Object> customResponse = new HashMap<>();
        customResponse.put("message", message);
        customResponse.put("httpStatus", status);
        customResponse.put("data", responseObj);

        return new ResponseEntity<>(customResponse, status);
    }
}
