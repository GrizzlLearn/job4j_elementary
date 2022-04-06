package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDayIs1() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs2() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs3() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs4() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs5() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs6() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs7() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIs8() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}