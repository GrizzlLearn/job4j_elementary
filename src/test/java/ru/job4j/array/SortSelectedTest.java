package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf7elements() {
        int[] data = new int[] {3, 6, 4, 1, 7, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10elements() {
        int[] data = new int[] {7, 3, 6, 4, 8, 9, 1, 10, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
