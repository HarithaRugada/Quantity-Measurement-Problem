package com.quantitymeasurement.enums;

import static com.quantitymeasurement.enums.Type.*;

public enum UnitConversion {

    FEET(12.0, LENGTH),
    INCH(1.0, LENGTH),
    YARD(36.0, LENGTH),
    CENTIMETER(1 / 2.5, LENGTH),

    GALLON(3.78, VOLUME),
    LITRE(1.0, VOLUME),
    MILLILITRE(0.001, VOLUME),

    KILOGRAM(1.0, WEIGHT),
    GRAM(0.001, WEIGHT),
    TONNE(1000.0, WEIGHT),

    CELSIUS(5.0 / 9.0, TEMPERATURE),
    FAHRENHEIT(9.0 / 5.0, TEMPERATURE);

    public Type type;
    public Double value;
    private static final int TEMPERATURE_CONSTANT = 32;

    UnitConversion(Double value, Type type) {
        this.value = value;
        this.type = type;
    }

    public Double unitConversion(double value, UnitConversion unit) {
        switch (unit) {
            case FAHRENHEIT:
                return (value - TEMPERATURE_CONSTANT) * CELSIUS.value;
            case CELSIUS:
                return (value * FAHRENHEIT.value) + TEMPERATURE_CONSTANT;
            default:
                return value * unit.value;
        }
    }
}