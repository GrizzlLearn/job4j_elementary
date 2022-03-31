package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when02to00then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to08then2() {
        double expected = 8.24;
        int x1 = 4;
        int x2 = 2;
        int y1 = 0;
        int y2 = 8;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when64to00then2() {
        double expected = 2;
        int x1 = 6;
        int x2 = 4;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when81to61then2() {
        double expected = 8.6;
        int x1 = 8;
        int x2 = 1;
        int y1 = 6;
        int y2 = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
