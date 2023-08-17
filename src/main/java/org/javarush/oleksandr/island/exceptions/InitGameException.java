package org.javarush.oleksandr.island.exceptions;

public class InitGameException extends RuntimeException {
    public InitGameException(String message, Throwable cause) {
        super(message, cause);
    }
    public InitGameException(String message) {
        super(message);
    }
}
