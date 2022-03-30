package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static boolean test(float value, String currency) {
        if (currency.equals("euro")) {
            float euro = Converter.rubleToEuro(value);
            float expected = 2;
            return expected == euro;
        }
        if (currency.equals("dollar")) {
            float dollar = Converter.rubleToDollar(value);
            float expected = 10;
            return expected == dollar;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are 2 euro. Test result : " + test(140, "euro"));
        System.out.println("600 rubles are 10 dollars. Test result : " + test(600, "dollar"));
    }
}
