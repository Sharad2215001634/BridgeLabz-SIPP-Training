package Day3_Sorting_Algorithms;

public class InsertionSortEmployee {

    
    public static void insertionSort(int[] empIDs) {
        int n = empIDs.length;

        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
            empIDs[j + 1] = key;
        }
    }
    public static void printArray(int[] empIDs) {
        for (int id : empIDs) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] employeeIDs = {1023, 1001, 1045, 1010, 1030};

        System.out.println("Original Employee IDs:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("Sorted Employee IDs (Ascending):");
        printArray(employeeIDs);
    }
}
