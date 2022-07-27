package ru.job4j.tracker;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 * @author alex_chashkov
 * @created 27/07/2022 - 22:46
 * @project job4j
 */
public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "Super");
        System.out.println(item.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
    }
}
