package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to02then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 4;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to08then10() {
        int expected = 10;
        int x1 = 8;
        int y1 = 2;
        int x2 = 0;
        int y2 = 8;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when250to450then2() {
        int expected = 2;
        int x1 = 2;
        int y1 = 50;
        int x2 = 4;
        int y2 = 50;

        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}