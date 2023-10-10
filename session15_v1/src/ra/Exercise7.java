package ra;


import utils.ScannerUtils;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a:");
        int a = ScannerUtils.inputInteger(scanner);
        System.out.println("Enter number b:");
        int b = ScannerUtils.inputInteger(scanner);

        greaterNumber(a,b);
    }

    static void greaterNumber(int a, int b){
        int result = a > b ? a : b;

        System.out.println(result);
    }
}
