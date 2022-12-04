import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int result1 = 0;
        for (int j : arr1) {
            result1 = j + result1;
        }
        int[] arr2 = {5, 4, 3, 2, 1};
        int result2 = 0;
        for (int j : arr2) {
            result2 = j + result2;
        }
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        System.out.println("Массив 2: " + Arrays.toString(arr2));
        double sarif1 = result1 / arr1.length;
        double sarif2 = result2 / arr2.length;
        if (sarif1 > sarif2) {
            System.out.println("Ср. ариф. элементов массива 1 больше (" + sarif1 + " > " + sarif2 + ")");
        } else if (sarif2 > sarif1) {
            System.out.println("Ср. ариф. элементов массива 2 больше (" + sarif2 + " > " + sarif1 + ")");
        } else {
            System.out.println("Ср. ариф. элементов массивов 1 и 2 равны (" + sarif2 + " = " + sarif1 + ")");
        }
    }
}