package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurement;
import com.quantitymeasurement.utility.AddOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantitymeasurement.enums.UnitConversion.*;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    AddOperation addOperation;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
        addOperation = new AddOperation();
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_AndUnitTypeFeet_ShouldThrowException() {
        try {
            quantityMeasurement = new QuantityMeasurement(null, FEET);
        } catch (QuantityMeasurementException quantityMeasurementException) {
            System.out.println(quantityMeasurementException.getMessage());
        }
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, FEET);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, FEET);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, FEET);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement1.getClass());
    }

    @Test
    public void givenFeetValue_WhenComparedByAnotherFeetValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1.0, FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByNegativeValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(-2.0, FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_AndUnitTypeInch_ShouldThrowException() {
        try {
            quantityMeasurement = new QuantityMeasurement(null, INCH);
        } catch (QuantityMeasurementException quantityMeasurementException) {
            System.out.println(quantityMeasurementException.getMessage());
        }
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, INCH);
        QuantityMeasurement quantityMeasurement1 = quantityMeasurement;
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, INCH);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, INCH);
        Assert.assertEquals(quantityMeasurement.getClass(), quantityMeasurement1.getClass());
    }

    @Test
    public void givenInchValue_WhenComparedByAnotherInchValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(1.0, INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByNegativeValue_ShouldReturnFalse() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(-2.0, INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, INCH);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, FEET);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(12.0, INCH);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(12.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, FEET);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Feet_WhenComparedBy1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(3.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, YARD);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, YARD);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Yard_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, YARD);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard_WhenComparedBy36Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, YARD);
        QuantityMeasurement q2 = new QuantityMeasurement(36.0, INCH);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inch_WhenComparedBy1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(36.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, YARD);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard_WhenComparedBy3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, YARD);
        QuantityMeasurement q2 = new QuantityMeasurement(3.0, FEET);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch_WhenComparedBy5Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(5.0, CENTIMETER);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Centimeter_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, CENTIMETER);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Centimeter_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, CENTIMETER);
        boolean result = q1.compare(q2);
        Assert.assertFalse(result);
    }

    @Test
    public void given5Centimeter_WhenComparedBy2Inch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(5.0, CENTIMETER);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, INCH);
        boolean result = q1.compare(q2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn4Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, INCH);
        Assert.assertEquals(4.0, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn14Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(2.0, INCH);
        Assert.assertEquals(14, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn24Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
        QuantityMeasurement q2 = new QuantityMeasurement(1.0, FEET);
        Assert.assertEquals(24, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn3Inch() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(2.0, INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.5, CENTIMETER);
        Assert.assertEquals(3, Math.round(new AddOperation().addition(q1, q2)), 0.0);
    }

    @Test
    public void given1Gallon_WhenComparedBy3Litre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, GALLON);
        boolean result = q1.equals(new QuantityMeasurement(3.78, LITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedBy1000MilliLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, LITRE);
        boolean result = q1.equals(new QuantityMeasurement(1000.0, MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn7Litre() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, GALLON);
        QuantityMeasurement q2 = new QuantityMeasurement(3.78, LITRE);
        Assert.assertEquals(7.56, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn2Litre() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, LITRE);
        QuantityMeasurement q2 = new QuantityMeasurement(1000.0, MILLILITRE);
        Assert.assertEquals(2, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void givenTwoWeights_WhenAdded_ShouldReturn1001Kilogram() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, TONNE);
        QuantityMeasurement q2 = new QuantityMeasurement(1000.0, GRAM);
        Assert.assertEquals(1001, new AddOperation().addition(q1, q2), 0.0);
    }

    @Test
    public void given100Celsius_WhenComparedBy212Fahrenheit_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value = new QuantityMeasurement(100.0, CELSIUS);
        Assert.assertEquals(212.0, value.value, 0.0);
    }

    @Test
    public void given212Fahrenheit_WhenComparedBy100Celsius_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement value = new QuantityMeasurement(212.0, FAHRENHEIT);
        Assert.assertEquals(100.0, value.value, 0.0);
    }

    @Test
    public void given1Feet_WhenComparedBy1Kilogram_ShouldThrowException() {
        try {
            QuantityMeasurement q1 = new QuantityMeasurement(1.0, FEET);
            QuantityMeasurement q2 = new QuantityMeasurement(1.0, KILOGRAM);
            boolean result = q1.compare(q2);
            Assert.assertFalse(result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenTwoIncompatibleValues_WhenAdded_ShouldThrowException() {
        try {
            QuantityMeasurement q1 = new QuantityMeasurement(1.0, LITRE);
            QuantityMeasurement q2 = new QuantityMeasurement(1000.0, CELSIUS);
            Assert.assertEquals(2, new AddOperation().addition(q1, q2), 0.0);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }
}