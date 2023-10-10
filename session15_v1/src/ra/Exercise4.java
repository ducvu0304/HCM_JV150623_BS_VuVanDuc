package ra;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /**[Bài tập] chuyển đổi chuỗi về số nguyên*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string's number : ");
        String str = scanner.nextLine();

        convertStringToNumber(str);
    }

    static int convertStringToNumber (String str) {
        try {
            return Integer.parseInt(str);
        }catch (NumberFormatException e) {
            System.out.println("Không phải số nguyên");
            return 0;
        }
    }
}
