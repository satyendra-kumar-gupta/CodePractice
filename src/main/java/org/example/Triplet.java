
package org.example;

import java.util.*;

class Triplet {

    // function to print triplets with 0 sum
    static void findTriplets(int arr[], int n, int target)
    {
        boolean found = false;
        //{ 0, -1, 2, -3, 1 };
        for (int i = 0; i < n - 1; i++) {
            // Find all pairs with sum equals to
            // "-arr[i]"
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = target - (arr[i] + arr[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x,
                            arr[i], arr[j]);
                    found = true;
                }
                else {
                    s.add(arr[j]);
                }
            }
        }

        if (found == false) {
            System.out.printf(" No Triplet Found\n");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
       // int arr[] = { 0, -1, 2, -3, 1 };
        int arr[] = {1,2,3,4,5,0,2,2,-1,8,-4};
        int n = arr.length;
        int target = 6;
        findTriplets(arr, n, target);
    }
}