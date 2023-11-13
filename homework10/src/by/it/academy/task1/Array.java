package by.it.academy.task1;

import java.util.HashMap;
import java.util.Map;

public class Array {
    public static <K> Map<K, Integer> array(K[] k) {
        Map<K, Integer> map = new HashMap<>();

        for (K element : k) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        return map;
    }
}
