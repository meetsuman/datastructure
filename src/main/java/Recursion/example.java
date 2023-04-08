package Recursion;

public class example {
    public static void main(String[] args) {
        example e = new example();
        String b="sumus1";
        boolean a=e.sample(b);
        System.out.println(a);
    }

    public boolean sample(String n) {

        if(n.length()==0 || n.length()==1){
            return true;
        }
        if(n.charAt(0)==n.charAt(n.length()-1))
        return sample(n.substring(1,n.length()-1));

        return false;



    }
}