package com.bineesh.makersharksassignment.handler;


import com.bineesh.makersharksassignment.exception.UserNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUnknownUser(UserNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String> handleSQLViolations(SQLIntegrityConstraintViolationException exception){
        String msg = exception.getMessage().toLowerCase().contains("duplicate") ? "mailid already exists" : exception.getMessage();
        return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDataViolations(DataIntegrityViolationException exception){
        String msg = exception.getMessage().toLowerCase().contains("duplicate") ? "mailid already exists" : exception.getMessage();
        return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
    }
}
