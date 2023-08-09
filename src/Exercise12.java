import java.util.*;

public class Exercise12 {

    public static void main(String[] args) {
        int[] numbers = {-2, 1, 1, 3, -3, 2, -4, 2};
        Set<String> triplexes = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = i + 2; k < numbers.length; k++) {
                    int[] nums = new int[3];
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        nums[0] = numbers[i];
                        nums[1] = numbers[j];
                        nums[2] = numbers[k];

                        Arrays.sort(nums);
                        triplexes.add(Arrays.toString(nums));
                    }
                }
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        Object[] array = triplexes.toArray();
        System.out.println("Массив триплексов, чья сумма равно нулю: " + Arrays.toString(array));
    }
}
