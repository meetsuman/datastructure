package geeksforgeeks.stack;

import java.util.Stack;

public class SpecialStack {

    int min = -1; // sentinel value for min
    static int demoVal = 9999; // DEMO_VALUE
    Stack<Integer> st = new Stack<Integer>();

    void getMin() { System.out.println("min is: " + min); }

    void push(int val)
    {
        // if stack is empty OR current element is less than
        // min, update min..
        if (st.isEmpty() || val < min) {
            min = val;
        }

        st.push(val * demoVal
                + min); // encode the current value with
        // demoVal, combine with min and
        // insert into stack
        System.out.println("pushed: " + val);
    }

    int pop()
    {
        // if stack is empty return -1;
        if (st.isEmpty() ) {
            System.out.println("stack underflow");
            return -1;
        }

        int val = st.pop();

        if (!st.isEmpty()) // if stack is empty, there would
            // be no min value present, so
            // make min as -1
            min = st.peek() % demoVal;
        else
            min = -1;
        System.out.println("popped: " + val / demoVal);
        return val / demoVal; // decode actual value from
        // encoded value
    }


    // Driver Code
    public static void main(String[] args)
    {
        SpecialStack s = new SpecialStack();

        int[] arr = { 3, 2, 6, 1, 8, 5, 5, 5, 5 };

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
            s.getMin();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            s.pop();
            s.getMin();
        }
    }
}