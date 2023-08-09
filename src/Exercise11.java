import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 9, 14, 3, 8, 4};

        System.out.print("Введите число, сумму которого нужно найти: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int[] indexes = twoSum(numbers, n);
        System.out.println("Массив, в котором происходит поиск: " + Arrays.toString(numbers));
        System.out.println("Индексы массива, удовлетворяющие поиску суммы: " + Arrays.toString(indexes));
    }

    public static int[] twoSum(int[] numbers, int n) {
        int[] indexes = new int[2];

        loop1:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == n) {
                    indexes[0] = i;
                    indexes[1] = i + 1;
                    break loop1;
                }
            }
        }

        return indexes;
    }
}
