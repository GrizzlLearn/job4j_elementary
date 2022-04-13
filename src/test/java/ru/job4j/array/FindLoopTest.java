package ru.job4j.array;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {1, 6, 18, 84, 22, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {4, 8, 3, 7, 12, 54, 33, 23, 55};
        int el = 8;
        int start = 2;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas8Then2() {
        int[] data = {1, 4, 8, 15, 16, 23, 42, 1};
        int el = 8;
        int start = 1;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}
