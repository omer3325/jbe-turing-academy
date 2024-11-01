package az.turingacademy;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        String result = "";

        if(value%3==0){
            result = "Eded 3-e bolunur";
        } else if (value%3==2) {
            System.out.println("Eded 3-e bolunmur qaliq 1-dir");
        } else{
            System.out.println("Eded 3-e bolunmur qaliq 2-dir");

        }
    }
}
