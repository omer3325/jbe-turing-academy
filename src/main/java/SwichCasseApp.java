import java.util.Scanner;

public class SwichCasseApp {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        String result = "";

        //prosses

        switch (value%3){
            case 0:
                result = "Eded 3-e bolunur";
                break;

            case 1:
                result = "Eded 3-e bolunmur qaliq 1-dir";
                break;

            case 2:
                result = "Eded 3-e bolunmur qaliq 2-dir";
                break;

            default:
                result = "Eded 3-e tam bolunmur ve qaliq " + value % 3 +"-dir";

        }
    }
}
