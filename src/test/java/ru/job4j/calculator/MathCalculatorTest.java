package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathCalculatorTest {

    @Test
    public void sumAndMultiply() {
        double first = 30;
        double second = 40;
        double expected = 1270;
        double out = MathCalculator.sumAndMultiply(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void subAndMultiply() {
        double first = 30;
        double second = 40;
        double expected = -9.25;
        double out = MathCalculator.subAndMultiply(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void sumAllOperations() {
        double first = 30;
        double second = 40;
        double expected = 1260.75;
        double out = MathCalculator.sumAllOperations(first, second);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}
