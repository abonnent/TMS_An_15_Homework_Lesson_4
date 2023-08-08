import java.util.Arrays;

public class Exercise08 {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7, 1};

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}