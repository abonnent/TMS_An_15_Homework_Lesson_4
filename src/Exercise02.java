import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 5, 3, 4, 5};

        System.out.println("Угадай одно из загаданных чисел!");
        System.out.println("Если одно из значений будет угадано, то оно будет удалено из массива.");
        System.out.print("Введи своё число: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        if (list.contains(number)) {
            System.out.println("");
            list.removeAll(Arrays.asList(number));
            String s = Arrays.toString(list.toArray());
            System.out.println(s);
        } else {
            System.out.println("");
            System.out.println("Не угадал. Попробуй ещё раз");
        }
    }
}