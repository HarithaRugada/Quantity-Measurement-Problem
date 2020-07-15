package com.quantitymeasurement.service;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.utility.UnitConversion;

import java.util.Objects;

public class QuantityMeasurement {
    public double value;
    public Unit unitType;

    public QuantityMeasurement() {
    }

    //Units
    public enum Unit {FEET, INCH, YARD, CENTIMETER, GALLON, LITRE, MILLILITRE, KILOGRAM, GRAM, TONNE, FAHRENHEIT, CELSIUS}

    /**
     * @param value
     * @param unitType
     * @throws QuantityMeasurementException
     */
    public QuantityMeasurement(Double value, Unit unitType) throws QuantityMeasurementException {
        try {
            this.value = value;
            this.unitType = unitType;
        } catch (NullPointerException nullPointerException) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Null value Provided");
        }
    }

    /**
     * @param q1
     * @param unitType
     * @return converted value
     */
    public QuantityMeasurement convertValue(QuantityMeasurement q1, UnitConversion unitType) {
        q1.value = q1.value * unitType.unit;
        return q1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        if (Objects.equals(value, that.value))
            return true;
        return false;
    }
}
