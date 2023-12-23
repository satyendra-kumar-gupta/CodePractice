package org.example;

import java.util.Arrays;

public class SmallestPairTwoPointer {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 15, 11, 2};
        int[] arr2 = {23, 127, 235, 19, 8};
//        int[] arr1 = new int[] {-1, 5, 10, 20, 28, 3};
//        int[] arr2 = new int[] {26, 134, 135, 15, 17};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int smallestDiff = Integer.MAX_VALUE;
        int[] smallestDiffPair = new int[2];
        int i=0,j=0;

        while (i<arr1.length && j<arr2.length){
            int currentSmallestDiff = Math.abs(arr1[i] - arr2[j]);
            if(currentSmallestDiff<smallestDiff){
                smallestDiff = currentSmallestDiff;
                smallestDiffPair[0] = arr1[i];
                smallestDiffPair[1] = arr2[j];
            }
            if(arr1[i]<arr2[j]){
                i++;
            }else {
                j++;
            }
        }

        System.out.println(smallestDiffPair[0] +" "+smallestDiffPair[1]);
    }
}
