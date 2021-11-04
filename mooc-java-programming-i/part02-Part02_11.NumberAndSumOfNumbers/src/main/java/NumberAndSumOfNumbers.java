
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumbers = 0;
        int sumNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            }
            numNumbers++;
            sumNumbers += n;
        }
        System.out.println("Number of numbers: " + numNumbers);
        System.out.println("Sum of the numbers: " + sumNumbers);
    }
}
