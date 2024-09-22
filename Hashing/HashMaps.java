package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 12};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = map.getOrDefault(key, 0); // Get the current frequency or default to 0
            freq++;
            map.put(key, freq);
        }

        // Print the frequencies after the loop
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value (Frequency): " + entry.getValue());
        }
    }
}
