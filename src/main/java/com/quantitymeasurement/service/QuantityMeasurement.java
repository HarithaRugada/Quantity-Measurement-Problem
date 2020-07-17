package com.quantitymeasurement.service;

import com.quantitymeasurement.enums.Type;
import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.enums.UnitConversion;

import java.util.Objects;

public class QuantityMeasurement {
    public Double value;
    public Type type;

    public QuantityMeasurement() {
    }

    public QuantityMeasurement(Double value, UnitConversion unit) throws QuantityMeasurementException {
        try {
            this.value = unit.unitConversion(value,unit);
            this.type = unit.type;
        } catch (NullPointerException nullPointerException) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value Provided");
        }
    }

    public boolean compare(QuantityMeasurement value2) throws QuantityMeasurementException {
        if (this.type != value2.type)
            throw new QuantityMeasurementException((QuantityMeasurementException.ExceptionType.IN_COMPATIBLE), "Values are of in compatible types");
        return Double.compare(this.value, value2.value) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(value, that.value) &&
                type == that.type;
    }
}
