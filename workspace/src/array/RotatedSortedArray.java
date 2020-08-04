public class RotatedSortedArray {

    int[] arr = {5, 6, 7, 1, 2, 3, 4};

    public int getRotationIndex() {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return i+1;
            }
        }

        return -1;
    }

    public void run() {
        System.out.println(getRotationIndex());
    }

    public static void main(String[] args) { new RotatedSortedArray().run(); }
}