package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int numbers = 8;
        int results[] = new int[2];

        int count =0;
        for(int i=0; i<nums.length; i++){
            if(numbers == nums[i]){
                results[1]=i;
                count++;
            }
        }

        if(count>=2){
            results[0] = results[1]-count+1;
        }else {
            if(count==1) {
                results[0] = results[1];
                results[1] =-1;
            }else{
                results[0] = -1;
                results[1] =-1;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(results));
    }
}
