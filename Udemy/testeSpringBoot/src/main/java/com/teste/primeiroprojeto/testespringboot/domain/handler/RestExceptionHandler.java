package com.teste.primeiroprojeto.testespringboot.domain.handler;

import com.teste.primeiroprojeto.testespringboot.domain.exception.ResourceNotFoundException;
import com.teste.primeiroprojeto.testespringboot.domain.model.errors.ErrorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex){
        ErrorMessage error = new ErrorMessage("NotFound", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);   
    }   
}
