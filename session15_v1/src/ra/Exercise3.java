package ra;

public class Exercise3 {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, "a", "6", "S"};

        System.out.println(sumArr(arr));
    }

    static int sumArr(Object[] arr) {
        int sum = 0;
        for (Object number: arr) {
            try {
                sum += (Integer)number;
            }catch (Exception e) {
                System.out.printf("Phần từ \"%s\" không phải là số nguyên. Nên bỏ qua phần tử này%n", number);
            }
        }

        return sum;
    }
}
