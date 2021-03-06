package com.quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NULL_VALUE, IN_COMPATIBLE
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
