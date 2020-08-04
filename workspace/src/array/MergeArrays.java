import org.apache.commons.lang3.ArrayUtils;

public class MergeArrays {
    int[] arr1;
    int[] arr2;

    public MergeArrays() {
        this.arr1 = new int[10];
        this.arr2 = new int[10];

        for(int i = 0; i < 10; i++) {
            this.arr1[i] = i*i;
            this.arr2[i] = i*3;
        }
    }

    public void run() {
        int[] merged = ArrayUtils.addAll(this.arr1, this.arr2);

        System.out.println(merged);
    }

    public static void main(String[] args) { new MergeArrays().run(); }
}