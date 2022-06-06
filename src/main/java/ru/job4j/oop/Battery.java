package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 06/06/2022 - 20:20
 * @project job4j
 */
public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
