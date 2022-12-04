import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] name = {"Василий", "Семен", "Аркадий", "Иван", "Павел", "Юлиан", "Аврелий"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }
}
