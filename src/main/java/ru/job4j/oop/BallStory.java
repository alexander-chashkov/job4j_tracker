package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 06/06/2022 - 20:04
 * @project job4j
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        hare.tryEat(ball);
        Wolf wolf = new Wolf();
        wolf.tryEat(ball);
        Fox fox = new Fox();
        fox.tryEat(ball);
    }
}
