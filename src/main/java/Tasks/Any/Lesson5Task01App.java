package Tasks.Any;

import java.util.Scanner;

public class Lesson5Task01App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

       /* String result = value % 2 == 1 ? "ODD" : "Even";
        System.out.println(result);

        if (value < 0) {
            System.out.println("Neagtive");
        } else if (value > 0){

            System.out.println("Possitive");
        }else{
            System.out.println("Zero");
        }*/

        String result = value > 0 ? "Possitive" : (value == 0 ? "Zero" : "Negative");
        System.out.println(result);

    }


}


