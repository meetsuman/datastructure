package geeksforgeeks.hash;

import java.util.ArrayList;
import java.util.Arrays;

public class findRepeatativePattern {

    static int findRepeating(int arr[], int N)
    {

        // res is going to store value of
        // 1 ^ 2 ^ 3 .. ^ (N-1) ^ arr[0] ^
        // arr[1] ^ .... arr[n-1]



        int res = 0;
        for (int i = 0; i < N - 1; i++){
            res = res ^ (i + 1) ^ arr[i];
            System.out.println(res);}
        res = res ^ arr[N - 1];

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
        int N = arr.length;

        // Function call
        System.out.println(findRepeating(arr, N));
    }
}

