package com.api.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg) {
        super(msg); // this is the one that will help us send the error message back when the resource is not found
    }
}
