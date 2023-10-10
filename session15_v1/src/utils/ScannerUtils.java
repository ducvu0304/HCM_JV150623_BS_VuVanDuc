package utils;

import java.util.Scanner;

public class ScannerUtils {

    public static Integer inputInteger(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }

    public static Double inputDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
