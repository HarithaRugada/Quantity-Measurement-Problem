package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurement;
import com.quantitymeasurement.utility.AddOperation;
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
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_AndUnitTypeFeet_ShouldThrowException() {
        try {
            quantityMeasurement = new QuantityMeasurement(null, QuantityMeasurement.Unit.FEET);
        } catch (QuantityMeasurementException quantityMeasurementException) {
            System.out.println(quantityMeasurementException.getMessage());
        }
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement1.getClass());
    }

    @Test
    public void givenFeetValue_WhenComparedByAnotherFeetValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByNegativeValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(-2.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_AndUnitTypeInch_ShouldThrowException() {
        try {
            quantityMeasurement = new QuantityMeasurement(null, QuantityMeasurement.Unit.INCH);
        } catch (QuantityMeasurementException quantityMeasurementException) {
            System.out.println(quantityMeasurementException.getMessage());
        }
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement1.getClass());
    }

    @Test
    public void givenInchValue_WhenComparedByAnotherInchValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByNegativeValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(-2.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(12.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(12.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given3Feet_WhenComparedBy1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(3.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard_WhenComparedBy36Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.YARD_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(36.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inch_WhenComparedBy1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(36.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard_WhenComparedBy3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.YARD);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.YARD_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(3.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch_WhenComparedBy5Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(5.08, QuantityMeasurement.Unit.CENTIMETER));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Centimeter_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.CENTIMETER));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Centimeter_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.CENTIMETER));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Centimeter_WhenComparedByFeet_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.CENTIMETER);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.CENTIMETER_TO_FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(0.03, QuantityMeasurement.Unit.FEET);
        Assert.assertEquals(Math.round(q1.value * 100.0) / 100.0, q2.value, 0.0);
    }

    @Test
    public void given1Feet_WhenComparedBy30Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(30.48, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given5Centimeter_WhenComparedBy2Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(5.08, QuantityMeasurement.Unit.CENTIMETER);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.CENTIMETER_TO_INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(Math.round(q1.value), q2.value, 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn4Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(4.0, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn14Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(14, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn24Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q2 = quantityMeasurement.convertValue(q2, UnitConversion.FEET_TO_INCH);
        Assert.assertEquals(24, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn3Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.5, QuantityMeasurement.Unit.CENTIMETER);
        q2 = quantityMeasurement.convertValue(q2, UnitConversion.CENTIMETER_TO_INCH);
        Assert.assertEquals(3, Math.round(new AddOperation().addition(q1, q2)), 0.0);
    }

    @Test
    public void given1Gallon_WhenComparedBy3Litre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        boolean result = q1.equals(new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedBy1000MilliLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.LITRE);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.LITRE_TO_MILLILITRE);
        boolean result = q1.equals(new QuantityMeasurement(1000.0, QuantityMeasurement.Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Gallon_WhenComparedBy3780MilliLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.LITRE_TO_MILLILITRE);
        boolean result = q1.equals(new QuantityMeasurement(3780.0, QuantityMeasurement.Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn7Litre() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        QuantityMeasurement q2 = new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE);
        Assert.assertEquals(7.56, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn2Litre() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.LITRE);
        QuantityMeasurement q2 = new QuantityMeasurement(1000.0, QuantityMeasurement.Unit.MILLILITRE);
        q2 = quantityMeasurement.convertValue(q2, UnitConversion.MILLILITRE_TO_LITRE);
        Assert.assertEquals(2, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoWeights_WhenAdded_ShouldReturn1001Kilogram() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.TONNE);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.TONNE_TO_KILOGRAM);
        QuantityMeasurement q2 = new QuantityMeasurement(1000.0, QuantityMeasurement.Unit.GRAM);
        q2 = quantityMeasurement.convertValue(q2, UnitConversion.GRAM_TO_KILOGRAM);
        Assert.assertEquals(1001, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void given100Celsius_WhenComparedBy212Fahrenheit_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(100.0, QuantityMeasurement.Unit.CELSIUS);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.CELSIUS_TO_FAHRENHEIT);
        boolean result = q1.equals(new QuantityMeasurement(212.0, QuantityMeasurement.Unit.FAHRENHEIT));
        Assert.assertTrue(result);
    }
}