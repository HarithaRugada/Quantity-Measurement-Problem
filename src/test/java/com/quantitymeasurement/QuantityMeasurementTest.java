package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetInInteger_ReturnInches() {
        int value = quantityMeasurement.feetToInch(3);
        Assert.assertEquals(36, value);
    }
}
