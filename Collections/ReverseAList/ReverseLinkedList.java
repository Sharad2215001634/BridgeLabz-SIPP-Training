package Collections.ReverseAList;
import java.util.*;
import java.util.LinkedList;
public class ReverseLinkedList {
    public static <T> void reversedLinkedList(LinkedList <T> list){
    int left = 0, right = list.size() - 1;
    while (left < right) {
        T temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
        left++;
        right--;
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < n; i++){
            linkedList.add(sc.nextInt());
        }
        System.out.println("Original List : "+ linkedList);
        reversedLinkedList(linkedList);
        System.out.println("Reversed List : " + linkedList);
        sc.close();
    }
}

