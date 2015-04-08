package org.luyue.examples.algorithms.math;

public class GreatestCommonDivisor {

    /**
     * <pre>
     * This is Euclid algorithm:
     * 1. Find remainder: Divide m by n and let r be the remainder
     * 2. Is r zero?: if r==0, the algorithm terminates; n is the answer.
     * 3. Reduce: set m <- n, n <- r, and go back to step #1.
     * 
     * Note: if originally m<n, in first iteration 1~3 will switch m with n.
     * </pre>
     * 
     * @param m
     * @param n
     * @return the greatest common divisor of m and n
     */
    public static int calculate(int m, int n) {

        if (m <= 0 || n <= 0)
            throw new IllegalArgumentException("m and n should be positive number!");

        int remainder = m % n;
        if (remainder == 0)
            return n;

        m = n;
        n = remainder;

        return calculate(m, n);
    }

}
