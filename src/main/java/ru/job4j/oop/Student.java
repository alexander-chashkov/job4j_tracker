package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 26/05/2022 - 16:54
 * @project job4j
 */
public class Student {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();

        petya.song();
        petya.song();
        petya.song();
    }
}
