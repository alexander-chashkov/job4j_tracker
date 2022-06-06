package ru.job4j.oop;

/**
 * @author alex_chashkov
 * @created 06/06/2022 - 20:13
 * @project job4j
 */
public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Активна: " + this.active);
        System.out.println("Статус: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }

    public static void main(String[] args) {
        Error er = new Error();
        er.printError();
        Error er2 = new Error(true, 1, "Ошибка вывода");
        er2.printError();
        Error er3 = new Error(false, 2, "Ошибка печати");
        er3.printError();
    }
}
