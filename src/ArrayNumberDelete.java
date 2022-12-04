import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumberDelete {
    public static void main(String[] args) {
        int x = 0;
        int[] array = {9, 3, 7, 3, 5, 4, 3, 2, 3, 1};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int number = sc.nextInt();
        for (int res:array) {
            if (res == number) {
                x = x + 1;
            }
        }
        if (x != 0) {
            int[] copyArray = new int[array.length - x];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] != number) {
                    copyArray[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(copyArray));
        } else {
            System.out.println("Нет такого числа в массиве!");
        }
    }
}