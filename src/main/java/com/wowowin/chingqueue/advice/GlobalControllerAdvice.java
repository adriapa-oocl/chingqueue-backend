package com.wowowin.chingqueue.advice;

import com.wowowin.chingqueue.exception.UserAlreadyExistsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler
    public ErrorResponse UserAlreadyExistsExceptionHandling(UserAlreadyExistsException userAlreadyExistsException) {
        return new ErrorResponse(userAlreadyExistsException.getMessage());
    }

}
