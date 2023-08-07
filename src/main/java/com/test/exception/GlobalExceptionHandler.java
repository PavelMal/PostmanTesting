package com.test.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(value = NullPriceException.class)
    public ResponseEntity<ExceptionMessage> handleNullPriceException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("You need to pass a 'price' param"));
    }

    @ExceptionHandler(PriceLessOrEqualZeroException.class)
    public ResponseEntity<ExceptionMessage> handlePriceLessOrEqualZeroException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("Price can't be less or equal than 0"));
    }

    @ExceptionHandler(NullNameException.class)
    public ResponseEntity<ExceptionMessage> handleNullNameException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("You need to pass a 'name' param"));
    }

    @ExceptionHandler(EmptyNameException.class)
    public ResponseEntity<ExceptionMessage> handleEmptyNameException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("Param 'name' shouldn't be empty"));
    }
}