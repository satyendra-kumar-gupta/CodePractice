package com.java8;

import java.util.ArrayList;
import java.util.Collection;

public class PrintListUsingStreamAPI {
    public static void main(String[] args) {

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("abc");
        stringCollection.add("def");
        stringCollection.add("ghi");
        stringCollection.add("klm");
        stringCollection.stream().forEach(System.out::println);
    }
}
