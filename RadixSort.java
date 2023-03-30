import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static void main(String[] args) {
        int[] arr = {10, 1, 4, 2, 55, 6, 3, 12, 34, 0};
        RadixSort radixSort = new RadixSort();
        radixSort.radixSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Time complexity: O(nk)");
    }

    private void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            sortByDigit(arr, exp);
        }
    }

    private void sortByDigit(int[] arr, int exp) {
        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int value : arr) {
            int bucketIndex = (value / exp) % 10;
            buckets[bucketIndex].add(value);
        }
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[i++] = value;
            }
        }
    }
}
