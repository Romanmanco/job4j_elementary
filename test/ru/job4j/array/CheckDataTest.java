package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckDataTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = CheckData.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[] {true, false, true};
        boolean result = CheckData.mono(data);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[] {false, false, false};
        boolean result = CheckData.mono(data);
        Assert.assertTrue(result);
    }
}
