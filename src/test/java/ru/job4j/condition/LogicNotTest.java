package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void whenIsEven10ThenTrue() {
        int in = 10;
        boolean out = LogicNot.isEven(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenIsEven11ThenFalse() {
        int in = 11;
        boolean out = LogicNot.isEven(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenIsPositive10ThenTrue() {
        int in = 10;
        boolean out = LogicNot.isPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenIsPositiveMinus10ThenFalse() {
        int in = -10;
        boolean out = LogicNot.isPositive(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenNotEven10ThenTrue() {
        int in = 10;
        boolean out = LogicNot.notEven(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenNotEven11ThenTrue() {
        int in = 11;
        boolean out = LogicNot.notEven(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotPositive10ThenFalse() {
        int in = 10;
        boolean out = LogicNot.notPositive(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenNotPositiveMinus10ThenFalse() {
        int in = -10;
        boolean out = LogicNot.notPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotEvenAndPositive11ThenTrue() {
        int in = 11;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenNotEvenAndPositive10ThenFalse() {
        int in = 10;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenNotEvenAndPositiveMinus10ThenFalse() {
        int in = -10;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenNotEvenAndPositiveMinus11ThenFalse() {
        int in = -11;
        boolean out = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(out);
    }

    @Test
    public void whenEvenOrNotPositiveMinus10ThenTrue() {
        int in = -10;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenEvenOrNotPositive10ThenFalse() {
        int in = 10;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenEvenOrNotPositiveMinus11ThenTrue() {
        int in = -11;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(out);
    }

    @Test
    public void whenEvenOrNotPositive11ThenFalse() {
        int in = 11;
        boolean out = LogicNot.evenOrNotPositive(in);
        Assert.assertFalse(out);
    }
}
