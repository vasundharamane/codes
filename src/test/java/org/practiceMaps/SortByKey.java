package org.practiceMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("p", 4);
        map.put("c", 2);

        Map<String, Integer> op = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (OldValue, NewValue) -> OldValue,
                        LinkedHashMap::new));

        System.out.println(op);
    }
}
