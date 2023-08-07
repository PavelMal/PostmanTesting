package com.test.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = NullPriceException.class)
    public ResponseEntity<ExceptionMessage> handleNullPriceException(){
        return ResponseEntity.badRequest().body(new ExceptionMessage("You need to pass 'price' param"));
    }

    @ExceptionHandler(PriceLessOrEqualZeroException.class)
    public ResponseEntity<ExceptionMessage> handlePriceLessOrEqualZeroException(PriceLessOrEqualZeroException ex){
        return ResponseEntity.badRequest().body(new ExceptionMessage("Price can't be less or equal than 0"));
    }
}