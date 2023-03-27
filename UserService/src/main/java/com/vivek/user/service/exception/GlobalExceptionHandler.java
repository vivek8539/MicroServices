package com.vivek.user.service.exception;

import com.vivek.user.service.payload.ApiResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(@NotNull ResourceNotFoundException exception){

        String message = exception.getMessage();
        ApiResponse body = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<>(body , HttpStatus.NOT_FOUND);
    }
}
