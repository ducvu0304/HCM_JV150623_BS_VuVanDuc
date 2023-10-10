package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {43,234,321,3,5435,52321,2,4,5,6,7};

        while (true) {
            try {
                System.out.println("Enter find value:");
                int findValue = Integer.parseInt(scanner.nextLine());

                indexOfValue(arr,findValue);
                scanner.close();
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }

    }

    static int indexOfValue(int[] arr, int findValue){
        Arrays.sort(arr);
        int l, r, m;
        int index = -1;
        l = 0;
        r = arr.length - 1;

        while (l < r) {
            m = l + (r-l)/2;

            if(arr[m] == findValue) {
                index = m;
                System.out.printf("Index of value : %d%n", index);
                break;
            }

            if(arr[m] < findValue) {
                l = m + 1;
            }else {
                r = m - 1;
            }
        }

        if(index == -1) {
            throw new RuntimeException("Value not found");
        }

        return index;
    }
}
