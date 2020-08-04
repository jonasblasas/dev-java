import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 5, 2, 1};
        System.out.println("Array before sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);

        System.out.println("Array after srt: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}