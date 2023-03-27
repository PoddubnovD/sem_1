package lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {

//    public static void main(String[] args) {
//        //inputNameAndPrint();
//        size2();
//
//    }
//
//    private static void size2() {
//        int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 1};
//        int k = 0;
//        int kmax = 0;
//        for (int num : arr) {
//
//            if (num == 1) {
//                k++;
//                if (k > kmax) {
//                    kmax = k;
//                }
//            } else {
//                k = 0;
//            }
//        }
//        System.out.printf("Большая последовательность %s", kmax);
//    }
//}

        public static void transArr(int[] arr, int k) {
            int i_f, i_t;
            i_t = 0;
            for (i_f = 0; i_f < arr.length; i_f++)
                if (arr[i_f] != k)
                    arr[i_t++] = arr[i_f];
            for (i_f = i_t; i_f < arr.length; i_f++)
                arr[i_f] = k;
        }

        public static void main(String[] args) {
            int[] b = { 3, 2, 2, 3 };
            for (int x : b)
                System.out.print(x + " ");
            System.out.println();
            transArr(b, 3);
            for (int x : b)
                System.out.print(x + " ");
            System.out.println();
        }
    }

