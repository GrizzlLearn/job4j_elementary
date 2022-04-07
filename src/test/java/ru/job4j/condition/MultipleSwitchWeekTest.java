package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenDayIsMondayRus() {
        String name = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsMondayEng() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsTuesdayRus() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsTuesdayEng() {
        String name = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsWednesdayRus() {
        String name = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsWednesdayEng() {
        String name = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsThursdayRus() {
        String name = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsThursdayEng() {
        String name = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsFridayRus() {
        String name = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsFridayEng() {
        String name = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsSaturdayRus() {
        String name = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsSaturdayEng() {
        String name = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsSundayRus() {
        String name = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsSundayEng() {
        String name = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDayIsIncorrectEng() {
        String name = "Incorrect";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
