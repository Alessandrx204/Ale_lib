package Ale_lib;

import java.util.Scanner;

public class Pynput {

    static Scanner sc = new Scanner(System.in);

    // Just a string, love
    public static String Str(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // Integer, darling
    public static int Int(String prompt) {
        System.out.print(prompt);
        int input = sc.nextInt();
        sc.nextLine(); // clear that annoying leftover newline
        return input;
    }

    // A double, sweetie
    public static double Doubl(String prompt) {
        System.out.print(prompt);
        double input = sc.nextDouble();
        sc.nextLine(); // get rid of the leftover newline
        return input;
    }

    // Single char, hun
    public static char Chr(String prompt) {
        System.out.print(prompt);
        char input = sc.next().charAt(0);
        sc.nextLine(); // tidy up the leftover newline
        return input;

    }

    // Single char, hun
    public static void Close() {

        sc.close(); // tidy up all

    }




}