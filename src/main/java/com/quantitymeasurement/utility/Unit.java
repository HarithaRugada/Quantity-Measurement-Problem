package com.quantitymeasurement.utility;

public enum Unit {
    FEET(1 / 12.0), INCH(1 * 12.0);
    double unit;

    Unit(double unitValue) {
        this.unit = unitValue;
    }
}
