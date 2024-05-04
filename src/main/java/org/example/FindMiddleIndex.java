package org.example;

public class FindMiddleIndex {
    public static void main(String[] args) {
        int[] arr = {2,2,5,6,-2};

        int k;
        for(k=1; k<=arr.length; k++){

            int leftSum = 0;
            int rightSum = 0;

            for(int i=0; i<k; i++){
                leftSum = leftSum +arr[i];
            }

            for(int j=arr.length-1; j>=arr.length-k; j--){
                rightSum = rightSum +arr[j];
            }

            if(leftSum == rightSum){
                System.out.println(arr[k]);
            }
        }

    }
}
