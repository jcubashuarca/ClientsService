package com.nttdata.bootcamp.clientservice.exception.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClientCreationException extends RuntimeException {
    public ClientCreationException(String message) {
        super(message);
    }
}
