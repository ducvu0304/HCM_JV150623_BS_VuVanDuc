package ra;

import utils.ScannerUtils;

import java.io.FileReader;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number:");
        int n = ScannerUtils.inputInteger(scanner);

        fibonacci(n);
    }

    static void fibonacci(int n) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < n) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
