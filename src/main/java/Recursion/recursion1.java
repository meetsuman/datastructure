package Recursion;

public class recursion1 {

    public static void main(String[] args) {
        int num = iterate(4);
        System.out.println(num);
    }
    public static int iterate(int i){
        if (i == 0 || i == 1) {
            return i;
        } else
            return (2 * iterate(i - 1) + 3 * iterate(i - 2));
    }
}
