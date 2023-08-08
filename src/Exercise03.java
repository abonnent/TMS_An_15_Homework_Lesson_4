import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.print("Укажи размер массива: ");
        Scanner console = new Scanner(System.in);
        int arraySize = console.nextInt();

        int min = 1;
        int max = 100;
        Integer[] numbers = new Integer[arraySize];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            numbers[i] = randomNumber;
            sum += randomNumber;
        }

        List<Integer> list = Arrays.asList(numbers);
        int minVal = Collections.min(list);
        int maxVal = Collections.max(list);
        double avg = (double) sum / arraySize;

        System.out.println("Наименьшее значение массива: " + minVal);
        System.out.println("Среднее значение массива: " + avg);
        System.out.println("Наибольшее значение массива: " + maxVal);
    }
}