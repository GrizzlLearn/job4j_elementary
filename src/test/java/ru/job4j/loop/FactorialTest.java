package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       int in = 5;
       int expected = 120;
       int result = Factorial.calc(in);
       Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int result = Factorial.calc(in);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForMinusOneThenZero() {
        int in = -1;
        int expected = 0;
        int result = Factorial.calc(in);
        Assert.assertEquals(result, expected);
    }
}