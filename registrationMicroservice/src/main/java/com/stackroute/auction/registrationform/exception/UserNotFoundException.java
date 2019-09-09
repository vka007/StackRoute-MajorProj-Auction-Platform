package com.stackroute.auction.registrationform.exception;



public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;
    private String message;
    public UserNotFoundException() {
    }
    public UserNotFoundException(String message)
    {
        super(message);
        this.message=message;
    }
}
