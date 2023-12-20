package codepre;

import java.util.Arrays;

public class SortTheArrayElement {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,1,6,19};

        bubbleSort(arr);
        // Sorting arrays with my own appraoch
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i]  = temp;
//                }
//            }
//        }
//       for(int i=0; i<arr.length;i++){
//           System.out.println(arr[i]);
//       }

    }




    public static void bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}