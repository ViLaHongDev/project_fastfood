package com.example.fastfood_be.exception;

import lombok.Data;

@Data
public class ApplicationRuntimeException extends RuntimeException{
    private ErrorCode errorCode;
    public ApplicationRuntimeException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
