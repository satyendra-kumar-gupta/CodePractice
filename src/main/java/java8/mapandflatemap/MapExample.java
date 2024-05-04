package java8.mapandflatemap;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        /// o/p - final String adds = "PUNE,HYDEFRABAD,THANE,MUMBAI,CHENNAI";

        //List<String> forTEStrings = Arrays.asList("PUNE","HYDEFRABAD","THANE","MUMBAI","CHENNAI");

        Map<String, List<String>> addsMap = new HashMap<>();
        addsMap.put("Dravid", List.of("Pune","GOA","Thane","Chennai"));
        addsMap.put("Sachin", List.of("Mumbai","Thane","Pune"));
        addsMap.put("PV Sindhu", List.of("Punjab","Delhi","Haryana"));
        addsMap.put("MS Dhoni", List.of("Goa","pune","Hyderabad"));

        Set<String> set1 = addsMap.entrySet().stream()
                .filter(addMaps->!"PV Sindhu".equals(addMaps.getKey()))
                .flatMap(addsMap2->addsMap2.getValue().stream()).map(result->result.toUpperCase()).collect(Collectors.toSet());

        Map<String, List<String>> addsMap3 = addsMap.entrySet().stream()
                .filter(addMaps->!"PV Sindhu".equals(addMaps.getKey()))
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(addsMap3);
    }

}
