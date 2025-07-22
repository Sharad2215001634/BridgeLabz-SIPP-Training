package Day3_Sorting_Algorithms;

public class MergeSortBookPrices {
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    
    private static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = prices[mid + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k++] = L[i++];
            } else {
                prices[k++] = R[j++];
            }
        }
        while (i < n1) {
            prices[k++] = L[i++];
        }
        while (j < n2) {
            prices[k++] = R[j++];
        }
    }
    public static void printArray(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        double[] bookPrices = {399.99, 150.50, 199.00, 249.75, 89.99, 499.00};
        System.out.println("Original Book Prices:");
        printArray(bookPrices);
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Sorted Book Prices (Ascending):");
        printArray(bookPrices);
    }
}
