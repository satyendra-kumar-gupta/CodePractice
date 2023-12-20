package in.saty;
import java.util.Arrays;
import java.util.Stack;
public class Temper {
    // Function to determine how many days
// required to wait for the next
// warmer temperature
    static void dailyTemperatures(int[] T)
    {
        int n = T.length;
        // To store the answer
        int[] daysOfWait = new int[n];
        Arrays.fill(daysOfWait, -1);
        Stack<Integer> s = new Stack<>();

        // Traverse all the temperatures
        for(int i = 0; i < n; i++)
        {
            // Check if current index is the
            // next warmer temperature of
            // any previous indexes
            while (!s.isEmpty() && T[s.peek()] < T[i])
            {
                daysOfWait[s.peek()] = i - s.peek();
                // Pop the element
                s.pop();
            }
            // Push the current index
            s.push(i);
        }

        // Print waiting days
        for(int i = 0; i < n; i++)
        {
            System.out.print(daysOfWait[i] + " ");
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        // Given temperatures
        int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
        // Function call
        dailyTemperatures(arr);
    }
}


