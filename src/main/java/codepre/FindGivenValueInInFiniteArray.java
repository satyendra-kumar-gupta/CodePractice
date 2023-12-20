package codepre;

public class FindGivenValueInInFiniteArray {
    public static void main(String[] args) {
        findFirstRangePostionOfElement();
    }


    //  Step 1- We need to find position of element index where given element our between them
    // Step 2-Apply binary search and find our given element position
    static void findFirstRangePostionOfElement() {
        int arr[] ={1,1,1,1,1};
        int findValue = 1;

        int left =0;
        int right = 1;

        int initialValue = arr[left];

        while (initialValue<findValue){
            left = right;
            if(2*right < arr.length)
            right = 2* right;
            else
                right = 2*right-1;
            initialValue = arr[right];
        }

        int position = callBinarySearch(arr, left,right,findValue);
        System.out.println("find value now is =========:: " +position);
    }

    static int callBinarySearch(int[] arr, int left, int right, int findValue) {

        int low = left;
        int high = right;

        if (right >= left){
            int mid = left + (right-left)/2;
            if(arr[mid] == findValue){
                return mid+1;
            }
            if(arr[mid]>findValue){
                return callBinarySearch(arr,left,mid-1, findValue);
            }
        return callBinarySearch(arr,mid+1,right,findValue);
        }
        return -1;
    }
}

//==========================

// Step 1= First we define our event properties class
// Step 2= Base on that we need to define post call which that we are able to save requried data into database
// step 3= We also need to define Get call which give data to UI person, Then can integrate our code with UI.