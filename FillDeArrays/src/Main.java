import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Arrays.fill(array1,8);
        int[] array2 = new int[5];
        array2=Arrays.copyOf(array1,5);
        boolean berdinak=Arrays.equals(array1,array2);
        Arrays.sort(array1);
    }
}