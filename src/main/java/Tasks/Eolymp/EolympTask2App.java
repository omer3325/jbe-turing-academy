package Tasks.Eolymp;

import java.util.Scanner;

public class EolympTask2App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input digits: ");

        long n = scanner.nextLong();
        int m = String.valueOf(n).length();

        System.out.println("The number of digits is: " + m);

    }
}