import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int arraySize = 10;
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            numbers[i] = randomNumber;
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                numbers[i] = 0;
            }
        }

        System.out.println("Изменённый массив: " + Arrays.toString(numbers));
    }
}