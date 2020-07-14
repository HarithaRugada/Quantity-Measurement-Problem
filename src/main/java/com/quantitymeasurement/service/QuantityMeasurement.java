package com.quantitymeasurement.service;

import com.quantitymeasurement.utility.Unit;

public class QuantityMeasurement {
    public double value;
    public Unit unitType;

    public QuantityMeasurement() {
    }

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public QuantityMeasurement convert(QuantityMeasurement q1, Unit unitType) {
        q1.value = q1.value * unitType.unit;
        return q1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unitType == that.unitType;
    }
}
