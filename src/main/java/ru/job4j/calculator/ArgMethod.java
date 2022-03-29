package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        int result3 = ArgMethod.func1(100);
        System.out.println(result3);
    }
}
