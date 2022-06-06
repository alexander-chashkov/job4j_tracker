package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 06/06/2022 - 20:30
 * @project job4j
 */
public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sumAllOperation(2));
        System.out.println(sum(4));
        System.out.println(calc.multiply(2));
        System.out.println(minus(2));
        System.out.println(calc.divide(2));
    }

}

