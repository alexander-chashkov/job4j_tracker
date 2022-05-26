package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 26/05/2022 - 16:58
 * @project job4j
 */
public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jkbox = new Jukebox();
        jkbox.music(1);
        jkbox.music(2);
        jkbox.music(5);
    }
}
