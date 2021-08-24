package com.wowowin.chingqueue.exception;

public class MovieNotFound extends RuntimeException{
    String message;
    public MovieNotFound(String message) {
        super(message);
    }
}
