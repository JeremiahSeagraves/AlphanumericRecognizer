package com.jeremiahseagraves.ai.web.rest.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;

@RestControllerAdvice
@Slf4j
public class ErrorTranslator {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public HashMap<String, String> handleNoHandlerFoundException(NoHandlerFoundException ex) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("message", "Specified path not found on this server");
        return hashMap;
    }

}
