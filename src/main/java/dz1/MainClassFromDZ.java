//2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
package dz1;

public class MainClassFromDZ {

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
