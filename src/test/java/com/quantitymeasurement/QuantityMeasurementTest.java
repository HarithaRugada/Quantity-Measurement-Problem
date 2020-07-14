package com.quantitymeasurement;

import com.quantitymeasurement.service.QuantityMeasurement;
import com.quantitymeasurement.utility.Unit;
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
    public void givenZeroFeet_WhenComparedWithAnotherZeroFeet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedWithNullValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement1));
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByAnotherValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1,Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0, Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenZeroInch_WhenComparedWithAnotherZeroInch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedWithNullValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement1));
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByAnotherValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1,Unit.INCH));
        Assert.assertFalse(result);
    }
}
