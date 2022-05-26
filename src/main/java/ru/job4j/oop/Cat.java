package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 26/05/2022 - 17:32
 * @project job4j
 */
public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " : " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Tom");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Blackie");
        black.eat("fish");
        black.show();
    }
}
