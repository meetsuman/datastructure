package stack;

public class stackTest {
    int pointer=0;
    int size=0;
    private static final int CONST_SIZE=10;
    int[] stackArray;

    public stackTest(int size) {
        this.stackArray=new int[size];
        this.size=size;
    }

    public void push(int k){
        if(stackArray.length<=pointer){
            int[] temp=new int[size*2];
            for(int i=0;i<stackArray.length;i++){
                temp[i]=stackArray[i];
            }
            stackArray=temp;
        }
        stackArray[pointer++]=k;
        System.out.println("Push --> "+k);
    }

    public int pop(){
        return stackArray[--pointer];
    }

    public int peek(){
        return stackArray[pointer];
    }

    public static void main(String[] args) {
        stackTest st=new stackTest(5);
        st.push(8);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(20);
        st.push(21);

        System.out.println("pop --> "+ st.pop());
        System.out.println("pop --> "+ st.pop());
        System.out.println("pop --> "+ st.pop());
        System.out.println("pop --> "+ st.pop());
        System.out.println("pop --> "+ st.pop());

    }
}
