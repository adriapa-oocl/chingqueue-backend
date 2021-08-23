package com.wowowin.chingqueue.advices;

import com.wowowin.chingqueue.Exceptions.UserNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public ErrorResponse employeeNotFoundExceptionHandling(UserNotFound UserNotFound) {
        return new ErrorResponse(UserNotFound.getMessage(), HttpStatus.NOT_FOUND.name());
    }
}
