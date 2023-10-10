package ra;

import utils.ScannerUtils;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = 0;
        do {
            System.out.println("Enter radius:");
            r = ScannerUtils.inputDouble(scanner);

            if (r < 0) {
                System.out.println("The radius must be greater than 0.");
            }
        } while (r < 0);

        calCircleArea(r);
    }

    static void calCircleArea(double r) {
        System.out.printf("Circle area: %.2f%n", Math.PI * r * r);
    }
}
