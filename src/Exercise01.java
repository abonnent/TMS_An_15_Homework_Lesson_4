import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Integer[] numbers = {17, 22, 51, 44, 36, 73, 85};

        System.out.println("Угадай одно из загаданных чисел!");
        System.out.print("Введи своё число: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        if (list.contains(number)) {
            System.out.println("");
            System.out.println("Ты угадал!");
        } else {
            System.out.println("");
            System.out.println("Попробуй ещё раз");
        }
    }
}
