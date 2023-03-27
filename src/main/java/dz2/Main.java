
//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
package dz2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main
{
    public static void main(String[] args)
    {
        // non-primitive integer array
        Integer[] A = { 6, 8, 3, 5, 1, 9 };

        List<Integer> ints = Arrays.asList(A);

        System.out.println("Минимальное число: " + Collections.min(ints));
        System.out.println("Максимальное число: " + Collections.max(ints));
    }
}
