package com.quantitymeasurement.service;

import com.quantitymeasurement.utility.UnitConversion;

import java.util.Objects;

public class QuantityMeasurement {
    public double value;
    public Unit unitType;

    public QuantityMeasurement() {
    }

    public enum Unit {FEET, INCH}

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

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
