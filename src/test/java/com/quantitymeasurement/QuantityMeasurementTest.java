package com.quantitymeasurement;

import com.quantitymeasurement.service.QuantityMeasurement;
import com.quantitymeasurement.utility.UnitConversion;
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
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedWithNullValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByAnotherValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenZeroInch_WhenComparedWithAnotherZeroInch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedWithNullValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByAnotherValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenZeroFeet_WhenComparedByZeroInch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneFeet_WhenComparedByOneInch_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneInch_WhenComparedByOneFeet_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneFeet_WhenComparedByInch_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(12, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByFeet_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(12, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }
}
