package com.kelani.uni.v5.repository;

import java.io.IOException;

public class NumberRepositoryException extends Throwable {
    public NumberRepositoryException(Exception e, String message) {
        super(message,e);
    }
}
