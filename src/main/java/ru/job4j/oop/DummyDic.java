package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 26/05/2022 - 17:03
 * @project job4j
 */
public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dd = new DummyDic();
        System.out.println(dd.engToRus("Hello"));
    }
}
