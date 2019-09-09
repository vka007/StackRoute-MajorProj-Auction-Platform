package com.stackroute.auction.registrationform.exception;

public class ItemAlreadyExistsException extends Exception{
    private String message;
    public ItemAlreadyExistsException(){}
    public ItemAlreadyExistsException(String message)
    {
        super(message);
        this.message=message;
    }

}
