package com.stackroute.exception;

public class ProductAlreadyExistsException extends Exception{
    //Shows the respective exception message 
    private String message;
    //If a product already exists then this exception is thrown
    public ProductAlreadyExistsException(String message){
        super(message);
        this.message=message;
    }
    public ProductAlreadyExistsException(){

    }
}
