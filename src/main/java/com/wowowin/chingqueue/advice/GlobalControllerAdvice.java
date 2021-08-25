package com.wowowin.chingqueue.advice;

import com.wowowin.chingqueue.exception.MovieNotFound;
import com.wowowin.chingqueue.exception.MovieDetailsNotFound;
import com.wowowin.chingqueue.exception.UserNotFound;
import com.wowowin.chingqueue.exception.UserAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler
    public ErrorResponse UserAlreadyExistsExceptionHandling(UserAlreadyExistsException userAlreadyExistsException) {
        return new ErrorResponse(userAlreadyExistsException.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public ErrorResponse employeeNotFoundExceptionHandling(UserNotFound UserNotFound) {
        return new ErrorResponse(UserNotFound.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public ErrorResponse MovieNotFoud(MovieNotFound movieNotFound) {
        return new ErrorResponse(movieNotFound.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public ErrorResponse movieDetailsNotFoundExceptionHandling(MovieDetailsNotFound movieDetailsNotFound) {
        return new ErrorResponse(movieDetailsNotFound.getMessage());
    }

}
