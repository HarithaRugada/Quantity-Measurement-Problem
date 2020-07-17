package com.quantitymeasurement.utility;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurement;

public class CheckCompatibility {
    public void checkCompatibility(QuantityMeasurement value1,QuantityMeasurement value2) throws QuantityMeasurementException {
        if(value1.type!=value2.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.IN_COMPATIBLE,"Values are of incompatible types");
    }
}
