package com.test.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler(value = NullPriceException.class)
    public ResponseEntity handleNullPriceException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("You need to pass 'price' param"));
    }

    @ExceptionHandler(PriceLessOrEqualZeroException.class)
    public ResponseEntity handlePriceLessOrEqualZeroException(PriceLessOrEqualZeroException ex){
        return ResponseEntity.badRequest().body(new ExceptionMessage("Price can't be less or equal than 0"));
    }
}