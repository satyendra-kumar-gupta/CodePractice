package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,4,6,0,1,6,-4,-1,5,2,2,3,7);
        Collections.sort(arr);
        int targetValue = 7;

        for(int i:arr){
            int valueInArray = targetValue - i;
            if(arr.contains(valueInArray))
            System.out.println("pair value: " + i + ","+valueInArray );
        }
    }
}