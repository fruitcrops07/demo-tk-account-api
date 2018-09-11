package com.bfar.training.accountapi.exception;

public class ApplicationException extends RuntimeException {
    public ApplicationException(Throwable t) {
        super(t);
    }

    public ApplicationException(String message, Throwable t) {
        super(message, t);
    }

    public ApplicationException(String message) {
        super(message);
    }
}
