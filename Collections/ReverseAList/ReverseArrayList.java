package Collections.ReverseAList;
import java.util.*;
import java.util.List;
public class ReverseArrayList {
    public static <T> void reverseArrayList(List <T> list){
        int left = 0;
        int right = list.size() -1;
        while(left < right){
            T temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the Number of Eelements : ");
        int n = sc.nextInt();
        for(int i = 1; i < n; i++){
            arrayList.add(sc.nextInt());
        }
        System.out.println("Original Array List : " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList : " + arrayList);
        sc.close();
    }
    
}
