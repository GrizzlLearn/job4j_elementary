package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert600RblThen10Dollars() {
        float in = 600;
        float expected = 10;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenTestValueEqual140AndCurrencyEqualEuroThenResultIsTrue() {
        float in = 140;
        String currency = "euro";
        boolean expected = true;
        boolean out = Converter.test(in, currency);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTestValueEqual1400AndCurrencyEqualEuroThenResultIsFalse() {
        float in = 1400;
        String currency = "euro";
        boolean expected = false;
        boolean out = Converter.test(in, currency);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTestValueEqual600AndCurrencyEqualDollarThenResultIsTrue() {
        float in = 600;
        String currency = "dollar";
        boolean expected = true;
        boolean out = Converter.test(in, currency);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenTestValueEqual6000AndCurrencyEqualDollarThenResultIsFalse() {
        float in = 6000;
        String currency = "dollar";
        boolean expected = false;
        boolean out = Converter.test(in, currency);
        Assert.assertEquals(expected, out);
    }
}
