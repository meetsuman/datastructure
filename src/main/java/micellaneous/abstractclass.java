package micellaneous;


abstract class abstractclass1{
    void abc123(){
        System.out.println("ab2");
    };
    abstract void abc();
}

class abcinherit extends abstractclass1{
    @Override
    void abc(){
     System.out.println("abc");
 }
}

public class abstractclass{
    public static void main(String[] args) {
        abcinherit ab=new abcinherit();
        abstractclass1 ab1=new abcinherit() ;
        ab1.abc();
        ab1.abc123();

    }
}

