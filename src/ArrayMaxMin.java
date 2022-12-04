import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int number = sc.nextInt();
        int[] array = new int[number];
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            result = array[i] + result;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
        System.out.printf("%.2f", result / array.length);
    }
}