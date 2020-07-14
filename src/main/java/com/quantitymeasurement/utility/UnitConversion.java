package com.quantitymeasurement.utility;

public enum UnitConversion {
    INCH_TO_FEET(1 / 12.0), FEET_TO_INCH(1 * 12.0);
    public double unit;

    UnitConversion(double unitValue) {
        this.unit = unitValue;
    }
}
