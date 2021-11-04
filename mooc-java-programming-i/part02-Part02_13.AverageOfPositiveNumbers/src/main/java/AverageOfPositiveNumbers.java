
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountNumbers = 0;
        int sumNumbers = 0;
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            } else if (n > 0) {
                amountNumbers++;
                sumNumbers += n;
            }
        }
        if (amountNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sumNumbers / amountNumbers);
        }
    }
}
