package dz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassFromHomeWorkTask1 {

    //1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
    // что 1 человек может иметь несколько телефонов.

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {

        if (map.containsKey(key)) {

            map.get(key).add(value);

        } else {

            ArrayList<Integer> list = new ArrayList<>();

            list.add(value);

            map.put(key, list);

        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {

        for (var item : map.entrySet()) {

            String phones = "";

            for (int el : item.getValue()) {

                phones = phones + el + ", ";

            }

            System.out.printf("%s: %s \n", item.getKey(), phones);

        }

    }

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();

        addNumber("Иванов", 749584284, bookPhone);
        addNumber("Иванов", 749572059, bookPhone);
        addNumber("Петров", 749516838, bookPhone);
        addNumber("Сидоров", 749582379, bookPhone);
        addNumber("Иванов", 749567614, bookPhone);
        addNumber("Петров", 749531739, bookPhone);
        printBook(bookPhone);

    }

}
