package Day3_Sorting_Algorithms;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

        
            if (!swapped) break;
        }
    }

    public static void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 78, 92, 66, 74, 88};

        System.out.println("Original Marks:");
        printArray(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("Sorted Marks (Ascending):");
        printArray(studentMarks);
    }
}
