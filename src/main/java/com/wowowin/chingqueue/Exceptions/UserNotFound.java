package com.wowowin.chingqueue.Exceptions;

public class UserNotFound extends RuntimeException{
    String message;
    public UserNotFound(String message) {
        super(message);
    }
}
