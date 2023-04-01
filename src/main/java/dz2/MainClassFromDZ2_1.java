package dz2;
import java.util.Scanner;
public class MainClassFromDZ2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = scanner.nextLine();
        System.out.println(palindrome(input));
    }
    private static boolean palindrome(String a) {
        boolean result = true;
        int j = a.length() - 1;
        for (int i = 0; i < (a.length()/2) ; i++) {
            if (a.charAt(i) == a.charAt(j)) {
                result = true;
                j--;
            } else {
                result = false;
            }
        }
        return result;
    }
}
