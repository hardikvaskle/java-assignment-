import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : array) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        System.out.println("Duplicate elements and frequency ");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element " + entry.getKey() + ", Frequency " + entry.getValue());
            }
        }
    }
}
