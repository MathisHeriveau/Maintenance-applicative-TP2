package org.example;
public class ChildPricingStrategy implements PricingStrategy {
    private static final double CHILD_PRICE_BASE = 100;
    private static final double HALF_DAY_DISCOUNT = 0.2;
    private static final double FULL_DAY_DISCOUNT = 0.5;

    @Override
    public double calculateFee(Visitor visitor) {
        if (visitor.getAge() <= 14) {
            return CHILD_PRICE_BASE * (visitor.getTicketType() == TicketType.HALF_DAY ? HALF_DAY_DISCOUNT : FULL_DAY_DISCOUNT);
        } else {
            throw new IllegalArgumentException("Visitor is not eligible for child pricing");
        }
    }
}
