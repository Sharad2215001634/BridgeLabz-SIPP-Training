package Day6_AlgorithmsRuntimeAnalysis_and_BigONotation;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void testPerformance(int size, int target) {
        int[] data = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size * 2);
        }
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = System.nanoTime() - start;
        Arrays.sort(data);
        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = System.nanoTime() - start;

        System.out.printf("Dataset Size: %d\n", size);
        System.out.printf("Linear Search Time: %.3f ms\n", linearTime / 1e6);
        System.out.printf("Binary Search Time: %.3f ms\n", binaryTime / 1e6);
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        int target = 500;

        for (int size : sizes) {
            testPerformance(size, target);
        }
    }
}
