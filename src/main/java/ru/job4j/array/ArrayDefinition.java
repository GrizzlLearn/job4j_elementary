package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Евдоким";
        names[1] = "Корнелий";
        names[2] = "Людовик";
        names[3] = "Франц";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println("----");
        System.out.println("Имя в ячейке 0: " + names[0]);
        System.out.println("Имя в ячейке 1: " + names[1]);
        System.out.println("Имя в ячейке 2: " + names[2]);
        System.out.println("Имя в ячейке 3: " + names[3]);
    }
}
