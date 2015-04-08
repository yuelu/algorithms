package org.luyue.examples.algorithms.math;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCalculate_NegativeShouldThrowException() {
        GreatestCommonDivisor.calculate(-1, 2);
    }

    @Test
    public void testCalculate_OneStep() {
        int gcd = GreatestCommonDivisor.calculate(8, 2);
        assertThat(gcd, is(2));
    }

    @Test
    public void testCalculate_MSmallerThanN() {
        int gcd = GreatestCommonDivisor.calculate(119, 544);
        assertThat(gcd, is(17));
    }
}
