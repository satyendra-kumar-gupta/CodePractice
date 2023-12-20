package com.java8;

import java.util.ArrayList;
import java.util.List;

public class MaxValueFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(500);
        integerList.add(100);
        integerList.add(700);
        integerList.add(200000);
        integerList.add(65626);

        System.out.println(integerList.stream().max((integer1, interger2) -> integer1 > interger2 ? 1 : -1).get());

    }
}
