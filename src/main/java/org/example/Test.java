package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("clothes", 120);
        hasMap.put("grocery", 150);
        hasMap.put("transportation", 100);

        Map<String, Integer> hasMpaResult = hasMap.entrySet().stream()
                .sorted(comparingByValue())
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(), (e1,e2)-> e2,LinkedHashMap::new));
        System.out.println(hasMpaResult);
    }
}
