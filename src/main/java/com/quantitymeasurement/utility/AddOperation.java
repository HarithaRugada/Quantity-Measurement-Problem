package com.quantitymeasurement.utility;

import com.quantitymeasurement.service.QuantityMeasurement;

public class AddOperation {
    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        double q=q1.value+q2.value;
        return q;
    }
}
