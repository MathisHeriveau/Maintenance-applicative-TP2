package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FeeCalculatorTest {
    @Test
    public void calculateFee_ForAgeUnder14AndHalfDay_ShouldReturn20() {
        // GIVEN
        Visitor child = new Visitor(10, TicketType.HALF_DAY);
        PricingStrategy childPricingStrategy = new ChildPricingStrategy();

        // WHEN
        double actualFee = FeeCalculator.calculateFee(child, childPricingStrategy);

        // THEN
        assertThat(actualFee).isEqualTo(20.0);
    }

    @Test
    public void calculateFee_ForAgeUnder14AndFullDay_ShouldReturn50() {
        // GIVEN
        Visitor child = new Visitor(10, TicketType.FULL_DAY);
        PricingStrategy childPricingStrategy = new ChildPricingStrategy();

        // WHEN
        double actualFee = FeeCalculator.calculateFee(child, childPricingStrategy);

        // THEN
        assertThat(actualFee).isEqualTo(50.0);
    }

    @Test
    public void calculateFee_ForAgeAbove14AndHalfDay_ShouldReturn60() {
        // GIVEN
        Visitor adult = new Visitor(20, TicketType.HALF_DAY);
        PricingStrategy adultPricingStrategy = new AdultPricingStrategy();

        // WHEN
        double actualFee = FeeCalculator.calculateFee(adult, adultPricingStrategy);

        // THEN
        assertThat(actualFee).isEqualTo(60.0);
    }

    @Test
    public void calculateFee_ForWeekTicket_ShouldReturnZero() {
        // GIVEN
        Visitor visitor = new Visitor(30, TicketType.WEEK);
        PricingStrategy weekPricingStrategy = new WeekPricingStrategy();

        // WHEN
        double actualFee = FeeCalculator.calculateFee(visitor, weekPricingStrategy);

        // THEN
        assertThat(actualFee).isEqualTo(0.0);
    }


}
