package ra;

import utils.ScannerUtils;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = ScannerUtils.inputInteger(scanner);

        scanner.close();

        if(isPrime(number)){
            System.out.printf("The number %d is prime number%n", number);
        }else {
            System.out.printf("The number %d is not prime number%n", number);
        }
    }

    static boolean isPrime (int number) {
        if(number <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
