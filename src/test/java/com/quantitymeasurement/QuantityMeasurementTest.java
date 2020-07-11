package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetInInteger_ReturnInches() {
        double value = quantityMeasurement.feetToInch(3);
        Assert.assertEquals(36, value, 0.0);
    }

    @Test
    public void givenFeetInDouble_ReturnInches() {
        double value = quantityMeasurement.feetToInch(5.5);
        Assert.assertEquals(66, value, 0.0);
    }
}
