package ra;

import utils.ScannerUtils;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise11 {
   private static LocalDate localDate = LocalDate.now();
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int day = inputDay(scanner);
        int month = inputMonth(scanner);
        int year = inputYear(scanner);

        System.out.println(LocalDate.of(year, month, day));
    }

    static int inputDay(Scanner scanner) {
        int day = 0;

        do {
            System.out.println("Enter day:");
            day = ScannerUtils.inputInteger(scanner);

            if (day > localDate.getDayOfMonth() || day < 1) {
                System.out.println("Invalid day!");
            }
        }while (day > localDate.getDayOfMonth() || day < 1);

        return day;
    }

    static int inputMonth(Scanner scanner) {
        int month = 0;

        do {
            System.out.println("Enter month:");
            month = ScannerUtils.inputInteger(scanner);

            if (month > 12|| month < 1) {
                System.out.println("Invalid month!");
            }

        }while (month > 12 || month < 1);

        return month;
    }

    static int inputYear(Scanner scanner) {
        int year = 0;

        do {
            System.out.println("Enter day:");
            year = ScannerUtils.inputInteger(scanner);

            if (year < 1975) {
                System.out.println("Invalid year!");
            }
        }while (year < 1975);

        return year;
    }
}
