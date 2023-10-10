package ra;

import utils.ScannerUtils;

import java.util.Optional;
import java.util.Scanner;

public class Exercise2 {
    private static int currentIndex = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static Integer[] arr = new Integer[50];

    public static void main(String[] args) {
        /** [Bài tập] tìm số lớn nhất trong mảng số nguyên */

        System.out.println("Enter number of Integer:");
        int number = ScannerUtils.inputInteger(scanner);

        inputInteger(arr, number);

        maxValue(arr);
    }

    static int maxValue(Integer[] arr) {
        Integer max = 0;
        Optional<Integer> optional = Optional.ofNullable(arr[0]);

        if(optional.isPresent()) {
            max = arr[0];
            for (int i = 1; i < currentIndex; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.printf("***Max value : %d ***** %n", max);
            return max;
        }else {
            throw new RuntimeException("Không có phần tử");
        }
    }

    static void inputInteger(Integer[] arr, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Enter number:");
            arr[currentIndex] = ScannerUtils.inputInteger(scanner);
            currentIndex++;
        }

        System.out.println("Input data into array successfully!");
    }
}
