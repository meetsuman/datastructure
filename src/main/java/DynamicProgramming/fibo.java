package DynamicProgramming;

public class fibo {

    public int fiboVal(int n){
        if(n<2){
            return n;
        }
        //System.out.println(n);
        return fiboVal(n-1)+fiboVal(n-2);
    }

    public int fiboValDP(int n, int[] b){
        if(n<2){
            return n;
        }
        System.out.println(n);
        if(b[n]==0){
            System.out.println("b[n]"+b[n]);
            b[n]=fiboValDP(n-1,b)+fiboValDP(n-2,b);
        }
        return b[n];

    }
    public static void main(String[] args) {
        fibo fb=new fibo();
        int[] a=new int[7];
        System.out.println(fb.fiboValDP(6,a)+" ");
        //System.out.println(fb.fiboVal(6));
    }
}
