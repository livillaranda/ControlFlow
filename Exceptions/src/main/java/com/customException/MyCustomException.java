package com.customException;

public class MyCustomException extends Exception {

    public MyCustomException() {}

    public MyCustomException(String message) {
        super(message);
        // System.out.println(message);
    }

}