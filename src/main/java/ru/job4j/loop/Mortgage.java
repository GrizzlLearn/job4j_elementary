package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double am = amount;

        while (am > 0) {
            am += am * (percent / 100) - salary;
            year++;
        }
        return year;
    }
}
