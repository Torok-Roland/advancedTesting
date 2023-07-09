package com.sda.advancedTesting.calculator.exceptions;

public class TruncatedResultException extends RuntimeException {

    //unchecked exception!
    public TruncatedResultException(String message){
        super(message);
    }
}
