
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0, numbers = 0, evens = 0;
        while (num >= 0) {
            sum += num;
            numbers += 1;
            if (num % 2 == 0) {
                ++evens;
            }
            num = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double) sum / numbers);
        System.out.println("Even: " + evens);
        System.out.println("Odds: " + (numbers - evens));
    }
}
