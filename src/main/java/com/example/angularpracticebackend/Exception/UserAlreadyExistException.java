package com.example.angularpracticebackend.Exception;

public class UserAlreadyExistException extends RuntimeException{
   public  UserAlreadyExistException(String message){
        super(message);
    }
}
