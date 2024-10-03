package org.practiceMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("d", 1);
        map.put("a", 0);
        map.put("c", 9);
        map.put("b", 2);


        Map<String,Integer> op = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (oldValue,newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println(op);
    }
}
