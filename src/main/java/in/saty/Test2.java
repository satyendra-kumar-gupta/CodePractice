package in.saty;

//import sun.invoke.empty.Empty;

import java.util.Arrays;
//import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73,5,6,3,2,1};
            //ans = {01, 01, 04, 02, 01, 01,}
        int[] result=new int[arr.length];
        for(int i=0; i<arr.length; i++){ //0
            int count = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    count=count+1;
                    break;
                }else{
                    count++;
                    if(j == arr.length-1 && arr[i]>arr[j] ){
                        count=0;
                    }
                }
            }

            if(count>=1) {
                result[i] = count;
            }
            else {
                result[i] =-1;
            }
        }

       Arrays.stream(result).forEach(System.out::println);

//        Optional<String> optional= Optional.empty();
//
//        String result1 = optional.get();
//        System.out.println(result1);
    }
}





