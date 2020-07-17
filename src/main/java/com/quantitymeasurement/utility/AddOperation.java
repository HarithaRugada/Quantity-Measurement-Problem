package com.quantitymeasurement.utility;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurement;

public class AddOperation {
    public double addition(QuantityMeasurement value1, QuantityMeasurement value2) throws QuantityMeasurementException {
        new CheckCompatibility().checkCompatibility(value1, value2);
        double sum = value1.value + value2.value;
        return sum;
    }
}
