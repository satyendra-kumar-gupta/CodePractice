package com.java8;

import java.util.Arrays;
import java.util.List;

public class DistinctStream {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("bus", "car", "bycle", "bus", "car", "bike", "car");
        strList.stream().distinct().forEach(System.out::println);
        System.out.println(strList.stream().distinct().count());

        System.out.println("=================================================");

        List<Integer> integerList = Arrays.asList(1, 5, 9, 4, 0, 12, 78, 90);
        System.out.println(integerList.stream().min((v1, v2) -> v1.compareTo(v2)).get());


    }
}
