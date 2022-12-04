import java.util.Arrays;


public class ArrayNull {
    public static void main(String[] args) {
        int n = 10;
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[j] = arr1[i];
            } else {
                arr2[j] = 0;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}







