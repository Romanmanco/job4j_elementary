package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.Max.max;

public class MaxTest {
    @Test
    public void whenMaxFourth() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Math.max(max(first, second), max(third, fourth));
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFirst() {
        int first = 456456;
        int second = 565;
        int third = 675;
        int fourth = 8797;
        int result = Math.max(max(first, second), max(third, fourth));
        int expected = 456456;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxSecond() {
        int first = 8797;
        int second = 9999999;
        int third = 5564;
        int fourth = 13;
        int result = Math.max(max(first, second), max(third, fourth));
        int expected = 9999999;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxThird() {
        int first = 8797;
        int second = 9999999;
        int third = 766575675;
        int result = Math.max(first, max(second, third));
        int expected = 766575675;
        Assert.assertEquals(result, expected);
    }
}