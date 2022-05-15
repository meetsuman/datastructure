package micellaneous;

public class fibo {

    public int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        fibo fb=new fibo();
        System.out.println(fb.fact(0));
    }
}
