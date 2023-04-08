package geeksforgeeks.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {
    // One queue
    Queue<Integer> q1 = new LinkedList<Integer>();

    void push(int x)
    {
        //  Get previous size of queue
        int s = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }

    void pop()
    {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() { return q1.size(); }

    // driver code
    public static void main(String[] args)
    {
        QueueToStack s = new QueueToStack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}