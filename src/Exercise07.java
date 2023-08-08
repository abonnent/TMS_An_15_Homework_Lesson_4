import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        String names[] = {
                "Дмитрий",
                "Алексей",
                "Сергей",
                "Ярослав",
                "Борис",
                "Игнат",
                "Владимир",
                "Юрий",
        };

        System.out.println("Исходный массив: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Упорядоченный массив: " + Arrays.toString(names));
    }
}