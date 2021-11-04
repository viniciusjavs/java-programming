
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            }
            if (n < 0) {
                total++;
            }
        }
        System.out.println("Number of negative numbers: " + total);
    }
}
