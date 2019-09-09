package com.stackroute.auction.registrationform.exception;

public class UserAlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    public UserAlreadyExistsException(){}
    public UserAlreadyExistsException(String message)
    {
        super(message);
        this.message=message;
    }


}
