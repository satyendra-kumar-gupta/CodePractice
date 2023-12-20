package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTargetValueSet {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,8,1,1,1};
        int target = 9;

        // brute fource approce
//        for(int i =0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(arr[i]+" ,"+arr[j]);
//                }
//            }
//        }


        // Map approach
//        Set<Integer> setValue = new HashSet<>();
//        for(int i=0; i<arr.length; i++){
//
//            int x= target - arr[i];
//            if(setValue.contains(x)){
//                System.out.println(arr[i]+ ","+x);
//            }else{
//                setValue.add(arr[i]);
//            }
//        }


        // Using while loop
        // 2,7,11,15,8,1,1,1
        // 1,1,1,2,7,8,8,8,11,15
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;

        while (i<j){
            if(arr[i]+arr[j] == target){
                System.out.println(arr[i] +" ," + arr[j]);
                i++;
                j--;
            } else if (arr[i]+ arr[j]< target) {
                i++;
            }else {
                j--;
            }

        }
    }
}
