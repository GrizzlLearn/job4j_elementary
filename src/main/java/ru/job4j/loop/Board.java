package ru.job4j.loop;

public class Board {
    public static void paint(int height, int width) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (row % 2 == 0 && cell % 2 == 0) {
                    System.out.print("X");
                } else if (row % 2 == 0 || cell % 2 == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
