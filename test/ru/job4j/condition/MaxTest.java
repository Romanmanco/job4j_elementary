package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax223To2Then223() {
        int left = 223;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 223;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax14To14Then2() {
        int left = 14;
        int right = 14;
        int result = Max.max(left, right);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }
}