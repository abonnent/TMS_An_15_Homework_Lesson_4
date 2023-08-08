import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        int minSize = 5;
        int maxSize = 10;
        int arraySize = 0;

        while (true) {
            System.out.print("Укажи размер массива: ");
            Scanner console = new Scanner(System.in);
            arraySize = console.nextInt();

            if (!(arraySize > minSize && arraySize <= maxSize)) {
                System.out.println("Размер массива должен быть больше " + minSize + " и не больше " + maxSize);
            } else {
                break;
            }
        }

        int min = 1;
        int max = 100;
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            numbers[i] = randomNumber;
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        Collection<Integer> list = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                list.add(number);
            }
        }

        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Чётный массив: " + Arrays.toString(array));
    }
}