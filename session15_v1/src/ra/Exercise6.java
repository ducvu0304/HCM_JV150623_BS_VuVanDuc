package ra;

import utils.ScannerUtils;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter divisible number: ");
            int divisibleNumber = ScannerUtils.inputInteger(scanner);
            System.out.println("Enter divisor: ");
            int divisor = ScannerUtils.inputInteger(scanner);

            int result = divisibleNumber/divisor;
            System.out.printf("Result: %d%n", result);

            scanner.close();
        }catch (ArithmeticException e) {
            System.out.println("Divisor must be greater than 0!");
        }
    }
}
