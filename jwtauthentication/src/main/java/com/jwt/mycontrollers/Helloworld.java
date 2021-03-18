package com.jwt.mycontrollers;

public class Helloworld {
    private final String message;

    @Override
    public String toString() {
        return String.format("hey this bean[message=%s]",message);
    }

    public String getMessage() {
        return message;
    }

    public Helloworld(String message) {
        this.message=message;
    }
}
