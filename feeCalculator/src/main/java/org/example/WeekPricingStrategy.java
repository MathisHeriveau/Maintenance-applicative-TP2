package org.example;
public class WeekPricingStrategy implements PricingStrategy {
    @Override
    public double calculateFee(Visitor visitor) {
        return 0.0; // Tarification gratuite pour les billets de semaine
    }
}
