package com.navigatingcancer.codingexercise.controller.advice;

import com.navigatingcancer.codingexercise.model.ErrorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class BadRequestExceptionAdvice {
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value 
      = {IllegalArgumentException.class, IllegalStateException.class })
    public ErrorMessage handleClientError(Exception ex) {
        return new ErrorMessage(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), new Date());
    }
}
