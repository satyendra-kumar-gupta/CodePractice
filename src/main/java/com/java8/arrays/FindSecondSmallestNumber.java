package com.java8.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondSmallestNumber {

    private static void find2ndSmallestNumber(int[] arr) {

        int smalest2ndElement = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("2nd smallest number not available"));
        System.out.println("Smallest element::: "+smalest2ndElement);
    }
    public static void main(String[] args) {
        int[] arr = {1,6,9,30,70,45,2};

        find2ndSmallestNumber(arr);

        System.out.println("=============================");
        int arr1[] = {1,2,3,4,5};
        int arr2[] ={4,5,6,7,8,9};

        findCommonElentformTwoArraysUsingJava8(arr1,arr2);
    }

    private static void findCommonElentformTwoArraysUsingJava8(int[] arr1, int[] arr2) {

        List<Integer> integerList=Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(arr2Number->arr2Number==number)).boxed().collect(Collectors.toList());

        System.out.println(integerList);
    }


}
