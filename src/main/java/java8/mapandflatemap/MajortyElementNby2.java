package java8.mapandflatemap;

public class MajortyElementNby2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 5, 6, 7, 8, 2, 2, 2, 2, 2,2,2,2, 7};
        int n = arr.length;

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count=1;
            }
        }

        count = 0;
        for (int i: arr){
            if(candidate == i){
                count++;
            }
        }

        if(count>n/2){
            System.out.println(candidate);
        }else{
            System.out.println(-1);
        }
    }
}