package com.javalord;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilTest {

    @Test
    public void testAddTwoPositiveNumbers() {
        MathUtil mathUtil = new MathUtil();
        int result = mathUtil.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        MathUtil mathUtil = new MathUtil();
        int result = mathUtil.add(5, -3);
        assertEquals(2, result);
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        MathUtil mathUtil = new MathUtil();
        int result = mathUtil.add(-4, -6);
        assertEquals(-10, result);
    }

    @Test
    public void testAddZeroToNumber() {
        MathUtil mathUtil = new MathUtil();
        int result = mathUtil.add(0, 7);
        assertEquals(7, result);
    }
}
