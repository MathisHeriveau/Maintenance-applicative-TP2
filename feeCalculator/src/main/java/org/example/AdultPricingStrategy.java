package org.example;
public class AdultPricingStrategy implements PricingStrategy {
    private static final double ADULT_PRICE_BASE = 100;
    private static final double HALF_DAY_SURCHARGE = 0.6;
    private static final double FULL_DAY_SURCHARGE = 1.2;

    @Override
    public double calculateFee(Visitor visitor) {
        if (visitor.getAge() > 14) {
            return ADULT_PRICE_BASE * (visitor.getTicketType() == TicketType.HALF_DAY ? HALF_DAY_SURCHARGE : FULL_DAY_SURCHARGE);
        } else {
            throw new IllegalArgumentException("Visitor is not eligible for adult pricing");
        }
    }
}
