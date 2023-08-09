import java.util.Arrays;

public class Exercise09 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        rotateRight(numbers, k);
        System.out.println("Изменённый массив: " + Arrays.toString(numbers));
    }

    public static void rotateRight(int[] numbers, int k) {
        int n = numbers.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = numbers[i];
        }

        System.arraycopy(temp, 0, numbers, 0, n);
    }
}
