package Collections;
import java.util.*;
public class FrequencyCounter {
    public static Map<String, Integer> countFrequencies(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String item : list) {
            if (freqMap.containsKey(item)) {
                freqMap.put(item, freqMap.get(item) + 1);
            } else {
                freqMap.put(item, 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list.add(str);
        }
        Map<String, Integer> frequency = countFrequencies(list);
        System.out.println("Frequency of elements: " + frequency);
        sc.close();
    }
}
