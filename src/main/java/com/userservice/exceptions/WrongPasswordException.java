package com.userservice.exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        super(message);
    }
}
