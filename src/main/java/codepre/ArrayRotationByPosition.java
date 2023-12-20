package codepre;

import java.util.Arrays;

public class ArrayRotationByPosition {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,6,7,8,9};
        int fromLeftPosition = 2;

//        ==================== left rotation   ===================
//        int temp;
//        for(int i=0; i<fromLeftPosition; i++){
//
//            temp = arr[0]; //
//
//            for(int j=0; j<arr.length-1;j++){
//                arr[j]=arr[j+1];   //9,1,2,3,4,5,6,7,8
//            }
//            arr[arr.length-1]=temp; //
//        }


      //  =================== with extra space for right rotation ===================

//            int[] result = new int[arr.length];
//
//            int temp;
//            for (int i = 0; i < fromLeftPosition; i++)
//            {
//                temp = arr[arr.length-1];
//                for (int j = 0; j < arr.length-1; j++)
//                {
//                    result[j+1] = arr[j];
//                }
//                result[0] = temp;
//
//
//                for (int k = 0; k < arr.length; k++) {
//                    arr[k] = result[k];
//                }
//
//            }

//            1,2,3,4,5,6,7,8,9
//            9,1,2,3,4,5,6,7,8 //result
//            8,9,1,2,3,4,5,6,7



//        for(int k=0; k<arr.length; k++){
//            System.out.println(arr[k]);
//        }


        // ================ Right rotation ===========================

        int temp;
        for(int i=1; i<=fromLeftPosition; i++){

            temp = arr[arr.length-1]; //

            for(int j=arr.length-1; j>0;j--){
                arr[j]=arr[j-1];   //9,1,2,3,4,5,6,7,8
            }
            arr[0]=temp; //
        }

        System.out.println("Initial Arrays ::  "+Arrays.toString(arr));

    }
}
