package geeksforgeeks.beetwise;

public class bitwise1 {

    static int bitwise(int arr[],int n){
        int res=0;
        for (int i=0;i<n;i++){
            res^=arr[i];
            System.out.println(res);
        }

        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = { 12, 12, 14, 90, 14, 14, 14 };
        int N = arr.length;

        // Function call
        System.out.println(bitwise(arr, N));
    }
}
