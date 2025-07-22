package Day3_Sorting_Algorithms;

public class HeapSortSalaryDemands {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1; 
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] salaryDemands = {55000, 48000, 72000, 66000, 51000, 60000};

        System.out.println("Original Salary Demands:");
        printArray(salaryDemands);

        heapSort(salaryDemands);

        System.out.println("Sorted Salary Demands (Ascending):");
        printArray(salaryDemands);
    }
}
