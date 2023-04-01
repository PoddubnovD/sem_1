package dz2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainClassFromDZ2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String strGenerate = stringGenerate();
        System.out.println(strGenerate);
        stringWriter(strGenerate);
    }
    private static String stringGenerate() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        return sb.toString();
    }

    private static void stringWriter(String string) {
        try (PrintWriter pw = new PrintWriter("src/main/resources/files/TEST.txt");) {
            pw.print(string);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}