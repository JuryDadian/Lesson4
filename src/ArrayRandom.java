import java.util.Arrays;
import java.util.Scanner;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[0];
        int n;
        boolean isTrue = true;
        System.out.println("Введите размер массива больше 5 и меньше или равно 10");
        while (isTrue) {
            n = sc.nextInt();
            if (n > 5 && n <= 10) {
                isTrue = false;
                arr1 = new int[n];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (int) (Math.random() * 100);
                }
            } else {
                System.out.println("Вы ввели неверные данные! Повторите попытку:");
            }
        }
        System.out.println(Arrays.toString(arr1));
        int x = 0;
        for (int k : arr1) {
            if (k % 2 != 0) {
                x = x + 1;
            }
        }
        int[] arr2 = new int[arr1.length - x];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[j] = arr1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
