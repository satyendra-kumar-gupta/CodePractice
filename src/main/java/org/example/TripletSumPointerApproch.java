package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumPointerApproch {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,0,2,2};
        int arr[] = {1,2,3,4,5,0,2,2,-1,8,-4};
        int target = 6;
        Arrays.sort(arr);
        List<Integer[]> arrList = new ArrayList<>();
        for(int  i=0; i<arr.length; i++){
            int left = i+1;
            int right = arr.length-1;

            while (left<right){
                if(arr[i]+arr[left]+arr[right]==target){
                    arrList.add(new Integer[]{arr[i],arr[left],arr[right]});
                    left++;
                    right--;
                } else if (arr[i]+arr[left]+arr[right]<target) {
                    left++;
                }else {
                    right--;
                }
            }
        }

//        for(Integer[] arr1 : arrList){
//            for(int i:arr1){
//                System.out.print(i+" ,");
//            }
//            System.out.println();
//        }
    }
}
