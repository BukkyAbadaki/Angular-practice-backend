package com.example.angularpracticebackend.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Responder<T> {
    public static ResponseEntity<APIResponse> Successful(Object response){
        return  new  ResponseEntity<>(new APIResponse("Request Successful", true, response), HttpStatus.OK);
    }

    public static ResponseEntity<APIResponse> notFound(String message){
        return  new ResponseEntity<>(new APIResponse(message,true, null), HttpStatus.NOT_FOUND);
    }
}
