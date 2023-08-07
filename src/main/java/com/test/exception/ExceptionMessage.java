package com.test.exception;

import com.google.gson.Gson;

public class ExceptionMessage {

    private String message;

    public ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ExceptionMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}