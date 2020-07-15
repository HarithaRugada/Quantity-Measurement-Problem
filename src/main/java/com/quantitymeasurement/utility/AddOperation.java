package com.quantitymeasurement.utility;

import com.quantitymeasurement.service.QuantityMeasurement;

public class AddOperation {
    /**
     * @param q1
     * @param q2
     * @return sum
     */
    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        double q = q1.value + q2.value;
        return Double.parseDouble(String.format("%.2f", q));
    }
}
