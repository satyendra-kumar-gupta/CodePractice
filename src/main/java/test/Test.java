package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
    List<String> str = Arrays.asList("abc", "def", "abc","xby");

    Set<String> result = str.stream().filter(str1->str1.contains("b")).collect(Collectors.toSet());

        System.out.println(result);


    }
}

