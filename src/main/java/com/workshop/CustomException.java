package com.workshop;

public class CustomException extends Exception {

    public enum Exception {
        FIRST_NAME_INCORRECT,LAST_NAME_INCORRECT
    }

    public Exception type;

    public CustomException(Exception type) {
        this.type = type;
    }
}
