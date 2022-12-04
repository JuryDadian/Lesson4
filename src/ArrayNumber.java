import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int number = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Число " + number + " входит в массив под индексом №" + i);
            }
        }
    }
}