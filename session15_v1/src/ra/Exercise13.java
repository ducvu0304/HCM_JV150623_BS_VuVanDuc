package ra;

import java.util.Scanner;
import java.util.Stack;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        reverseString(s);
    }

    static String reverseString(String str) {
        StringBuilder string = new StringBuilder();

        if(!string.toString().equals("")) {
            Stack<String> stack = new Stack<>();
            String[] arr = str.split("\\s");

            for (String s : arr) {
                stack.push(s);
            }

            while (!stack.isEmpty()){
                string.append(stack.pop()).append(" ");
            }

        }else {
            throw new RuntimeException("String is null");
        }

        return string.toString();
    }
}
