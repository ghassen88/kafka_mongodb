package com.ghs.kafkamongodb.Exception;





public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}