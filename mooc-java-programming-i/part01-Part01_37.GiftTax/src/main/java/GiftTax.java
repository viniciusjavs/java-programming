
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
            return;
        }

        int lowerLim, lowerLimTax;
        double taxRate;
        if (value < 25000) {
            lowerLim = 5000;
            lowerLimTax = 100;
            taxRate = 0.08;
        } else if (value < 55000) {
            lowerLim = 25000;
            lowerLimTax = 1700;
            taxRate = 0.1;
        } else if (value < 200000) {
            lowerLim = 55000;
            lowerLimTax = 4700;
            taxRate = 0.12;
        } else if (value < 1000000) {
            lowerLim = 200000;
            lowerLimTax = 22100;
            taxRate = 0.15;
        } else {
            lowerLim = 1000000;
            lowerLimTax = 142100;
            taxRate = 0.17;
        }
        System.out.println("Tax: "+ ((value - lowerLim) * taxRate + lowerLimTax));
    }
}
