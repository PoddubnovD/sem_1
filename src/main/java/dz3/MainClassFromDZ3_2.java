package dz3;

import java.util.ArrayList;
import java.util.Random;
public class MainClassFromDZ3_2 {

//    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arrA.add(rnd.nextInt(10));
        }
        for (int i = 0; i < 9; i++) {
            arrB.add(rnd.nextInt(10));
        }

        ArrayList<Integer> a_b = new ArrayList<>();
        ArrayList<Integer> b_a = new ArrayList<>();
        ArrayList<Integer> aAb = new ArrayList<>();

        for (int i = 0; i < arrA.size(); i++) {
            if (arrB.contains(arrA.get(i)) == false && a_b.contains(arrA.get(i)) == false) {
                a_b.add(arrA.get(i));
            }
        }
        for (int i = 0; i < arrB.size(); i++) {
            if (arrA.contains(arrB.get(i)) == false && b_a.contains(arrB.get(i)) == false) {
                b_a.add(arrB.get(i));
            }
        }
        for (int i = 0; i < a_b.size(); i++) {
            aAb.add(a_b.get(i));
        }
        for (int i = 0; i < b_a.size(); i++) {
            aAb.add(b_a.get(i));
        }

        System.out.println(arrA + "\n" + arrB + "\n" + a_b + "\n" + b_a + "\n" + aAb);
    }
}