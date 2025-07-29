package Collections;

import java.util.*;

public class RotateList {    
    public static <T> void rotateLeft(List<T> list, int k) {
        int n = list.size();
        if (n == 0 || k % n == 0) return;
        k = k % n;
        List<T> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }
        for (int i = 0; i < n - k; i++) {
            list.set(i, list.get(i + k));
        }
        for (int i = 0; i < k; i++) {
            list.set(n - k + i, temp.get(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Original List: " + list);
        rotateLeft(list, rotateBy);
        System.out.println("Rotated List:  " + list);
    }
}
