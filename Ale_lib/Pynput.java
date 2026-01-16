package Ale_lib;

import java.util.Scanner;

public class Pynput {

    static Scanner sc = new Scanner(System.in);

    // Just a string, love
    public static String str(String prompt) {
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
    public static double doubl(String prompt) {
        System.out.print(prompt);
        double input = sc.nextDouble();
        sc.nextLine(); // get rid of the leftover newline
        return input;
    }

    // Single char, hun
    public static char chr(String prompt) {
        System.out.print(prompt);
        char input = sc.next().charAt(0);
        sc.nextLine(); // tidy up the leftover newline
        return input;

    }

    // Whatever, just trying to figure it out
    public static Object var(String prompt) {
        System.out.print(prompt);
        String input = sc.nextLine(); // grab the user's input

        Object value; // this'll hold the result nicely

        // Trying to guess the type, fingers crossed
        if (input.equalsIgnoreCase("true")) {
            value = true;
        } else if (input.equalsIgnoreCase("false")) {
            value = false;
        } else {
            try {
                value = Integer.parseInt(input); // maybe it's an integer?
            } catch (NumberFormatException e1) {
                try {
                    value = Double.parseDouble(input); // or a double, maybe
                } catch (NumberFormatException e2) {
                    if (input.length() == 1) {
                        value = input.charAt(0); // just a single char
                    } else {
                        value = input; // otherwise, it's a string
                    }
                }
            }
        }

        return value; // hand back the value with the proper type
    }

}