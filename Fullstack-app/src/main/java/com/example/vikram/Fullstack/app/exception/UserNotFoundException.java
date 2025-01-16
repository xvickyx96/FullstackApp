package com.example.vikram.Fullstack.app.exception;


public class UserNotFoundException extends Exception {
    public UserNotFoundException(Long id) {
        super("User with id " + id + " not found");
    }
}
