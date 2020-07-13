package com.quantitymeasurement;

import com.quantitymeasurement.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeet_WhenComparedWithZeroFeet_ShouldReturnEqual() {
        boolean result = quantityMeasurement.compareLength(0, 0.0);
        Assert.assertTrue(result);
    }
}
