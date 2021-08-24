package com.wowowin.chingqueue.exception;

public class UserNotFound extends RuntimeException{
    String message;
    public UserNotFound(String message) {
        super(message);
    }
}
