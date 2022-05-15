package queue;

public class simpleQueue {
    int rear,front,size;
    int queueArray[];

    public simpleQueue(int arrayLength) {
        this.queueArray = new int[arrayLength];
        rear=front=size=0;
    }

    public void enQueue(int item){
        if(isFull()){
            return;
        }
        queueArray[(rear++)%(queueArray.length)]=item;
        size++;
        System.out.println("enqueue --> "+item);
    }

    public int deQueue(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        size--;
        return queueArray[(front++)%queueArray.length];
    }

    private boolean isEmpty() {
        return (size==0);
    }

    private boolean isFull(){
        return (size==this.queueArray.length);

    }



    public static void main(String[] args) {
        simpleQueue sq=new simpleQueue(5);
        sq.enQueue(1);
        sq.enQueue(2);
        sq.enQueue(3);
        sq.enQueue(4);
        sq.enQueue(5);


        System.out.println("dequeue --> "+ sq.deQueue());
        System.out.println("dequeue --> "+ sq.deQueue());
        System.out.println("dequeue --> "+ sq.deQueue());
        System.out.println("dequeue --> "+ sq.deQueue());
        System.out.println("dequeue --> "+ sq.deQueue());

    }
}


