package Day3_Sorting_Algorithms;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }
        System.arraycopy(output, 0, ages, 0, ages.length);
    }
    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] studentAges = {12, 17, 10, 13, 15, 12, 18, 14, 16, 13};
        System.out.println("Original Student Ages:");
        printArray(studentAges);
        countingSort(studentAges);
        System.out.println("Sorted Student Ages (Ascending):");
        printArray(studentAges);
    }
}
