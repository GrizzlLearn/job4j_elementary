package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] massive = new int[5];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i * 2 + 3;
        }
        int index = 0;
        for (int num : massive) {
            System.out.println("Значение элемента " + index + ": " + num);
            index++;
        }
    }
}
