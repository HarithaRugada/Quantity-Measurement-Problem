package com.quantitymeasurement.utility;

public enum UnitConversion {
    INCH_TO_FEET(1 / 12.0),
    FEET_TO_INCH(1 * 12.0),
    FEET_TO_YARD(1 / 3.0),
    YARD_TO_FEET(3.0),
    INCH_TO_YARD(1 / 36.0),
    YARD_TO_INCH(36.0),
    INCH_TO_CENTIMETER(2.54),
    CENTIMETER_TO_INCH(1 / 2.54),
    FEET_TO_CENTIMETER(30.48),
    CENTIMETER_TO_FEET(1 / 30.48);

    public double unit;

    UnitConversion(double unitValue) {
        this.unit = unitValue;
    }
}
