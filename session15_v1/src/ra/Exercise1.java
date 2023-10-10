package ra;

import utils.ScannerUtils;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b ;

        while (true) {
            try {
                System.out.println("Enter first number:");
                a = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

        while (true) {
            try {
                System.out.println("Enter second number:");
                b = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        }

        scanner.close();
        System.out.printf("Sum of two numbers: %d %n", calculateSum(a, b));

    }

    static int calculateSum(int a, int b) {
        return a + b;
    }
}
