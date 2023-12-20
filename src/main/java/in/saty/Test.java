package in.saty;

public class Test {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,1,6,19};
        int temp=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j] || arr[i] == arr[j] ){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
