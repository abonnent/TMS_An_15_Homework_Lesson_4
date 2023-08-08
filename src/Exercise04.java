import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int arraySize = 5;
        int[] numbers1 = new int[arraySize];
        int[] numbers2 = new int[arraySize];

        int sum1 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            numbers1[i] = randomNumber;
            sum1 += randomNumber;
        }

        int sum2 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            int randomNumber = (int) (Math.random() * (max + 1 - min) + min);
            numbers2[i] = randomNumber;
            sum2 += randomNumber;
        }

        double avg1 = (double) sum1 / arraySize;
        double avg2 = (double) sum2 / arraySize;

        System.out.println("Массив 1: " + Arrays.toString(numbers1));
        System.out.println("Массив 2: " + Arrays.toString(numbers2));

        if (avg1 > avg2) {
            System.out.println("Среднее значение первого массива больше");
        } else if (avg1 < avg2) {
            System.out.println("Среднее значение второго массива больше");
        } else {
            System.out.println("Среднее значения равны");
        }
    }
}