package Day3_Sorting_Algorithms;

public class QuickSortProductPrices {
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1;
    }
    public static void printArray(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        double[] productPrices = {899.99, 199.99, 499.50, 1099.00, 299.99, 649.75};
        System.out.println("Original Product Prices:");
        printArray(productPrices);
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Product Prices (Ascending):");
        printArray(productPrices);
    }
}
