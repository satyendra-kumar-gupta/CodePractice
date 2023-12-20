package org.example;

public class SmalestPair {
    public static void main(String[] args) {
        int[] a1 = new int[] {1, 3, 15, 11, 2};//{-1, 5, 10, 20, 28, 3};
        int[] a2 = new int[]{23, 127, 235, 19, 8};// {26, 134, 135, 15, 17};

        int[] pair = findSmallestDifferencePair_Naive(a1, a2);
        System.out.println(pair[0]+","+pair[1]);
    }

    private static int[] findSmallestDifferencePair_Naive(int[] a1, int[] a2) {
        int[] resultArray = new int[2];
        int smallestDiff = Integer.MAX_VALUE;
        for(int i=0; i<a1.length; i++){
            for(int j=0; j<a2.length; j++){
                int currentSmallestValue = Math.abs(a1[i]-a2[j]);
                if(currentSmallestValue<smallestDiff){
                    smallestDiff = currentSmallestValue;
                    resultArray[0] = a1[i];
                    resultArray[1] = a2[j];
                }
            }
        }
        return resultArray;
    }
}
