
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountNumbers = 0;
        int sumNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            }
            amountNumbers++;
            sumNumbers += n;
        }
        System.out.println("Average of the numbers: " + 1.0 * sumNumbers / amountNumbers);
    }
}
