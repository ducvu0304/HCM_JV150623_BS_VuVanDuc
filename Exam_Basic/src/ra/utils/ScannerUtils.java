package ra.utils;

import java.util.Scanner;

public class ScannerUtils {
    public static int inputInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static float inputFloat(Scanner scanner) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid input. Please enter an float.");
            }
        }
    }

    public static double inputDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid input. Please enter an double.");
            }
        }
    }

    public static String inputString(Scanner scanner) {
       return scanner.nextLine();
    }
}
