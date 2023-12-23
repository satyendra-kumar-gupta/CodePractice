package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamIterating {
    public static void main(String[] args) {
        Stream.iterate(1, element->element+1)
                .filter(elment ->elment%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
