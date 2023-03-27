package com.vivek.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super("Record not found on Server!!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
