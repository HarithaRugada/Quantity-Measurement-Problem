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
    public void givenZeroFeet_WhenComparedWithAnotherZeroFeet_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_UnitTypeFeet_ShouldThrowException() {
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
    public void givenFeetValue_WhenComparedByAnotherValue_ShouldReturnFalse() throws QuantityMeasurementException {
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
    public void givenZeroInch_WhenComparedWithAnotherZeroInch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenNullValue_UnitTypeInch_ShouldThrowException() {
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
    public void givenInchValue_WhenComparedByAnotherValue_ShouldReturnFalse() throws QuantityMeasurementException {
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
    public void givenZeroFeet_WhenComparedByZeroInch_ShouldReturnTrue() throws QuantityMeasurementException {
        quantityMeasurement = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneFeet_WhenComparedByOneInch_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneInch_WhenComparedByOneFeet_ShouldReturnFalse() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneFeet_WhenComparedByInch_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(12.0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByFeet_ShouldReturnTrue() throws QuantityMeasurementException {
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
    public void given2Inch_WhenComparedByCentimeter_ShouldReturnTrue() throws QuantityMeasurementException {
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
    public void given1Feet_WhenComparedByCentimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.FEET);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(30.48, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given5Centimeter_WhenComparedByInch_ShouldReturnTrue() throws QuantityMeasurementException {
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
    public void given1Gallon_WhenComparedByLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        boolean result = q1.equals(new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedByMilliLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.LITRE);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.LITRE_TO_MILLILITRE);
        boolean result = q1.equals(new QuantityMeasurement(1000.0, QuantityMeasurement.Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Gallon_WhenComparedByMilliLitre_ShouldReturnTrue() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.LITRE_TO_MILLILITRE);
        boolean result = q1.equals(new QuantityMeasurement(3780.0, QuantityMeasurement.Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturnInLitre() throws QuantityMeasurementException {
        QuantityMeasurement q1 = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.GALLON);
        q1 = quantityMeasurement.convertValue(q1, UnitConversion.GALLON_TO_LITRE);
        QuantityMeasurement q2 = new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE);
        Assert.assertEquals(7.56, new AddOperation().addition(q1, q2), 0.0);
    }
}
