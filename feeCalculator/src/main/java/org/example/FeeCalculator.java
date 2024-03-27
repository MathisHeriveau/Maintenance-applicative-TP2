
package org.example;

public class FeeCalculator {
    public static double calculateFee(Visitor visitor, PricingStrategy pricingStrategy) {
        return pricingStrategy.calculateFee(visitor);
    }
}
