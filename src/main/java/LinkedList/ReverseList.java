package LinkedList;

public class ReverseList {
    private Node head;
    private Node tail;
    private Node reverseNode;
    private int nodeCount;
    private int nodeCount1;

    public ReverseList(){
        head=null;
        tail=null;
        reverseNode=null;
        nodeCount=0;
        nodeCount1=0;
    }

    private class Node{
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
            this.next=null;
        }

        public void setNext(Node nextNode){
            this.next=nextNode;
        }
        public Node getNext(){
            return next;
        }
        public int getItem(){
            return item;
        }
    }
    public void add(int item){
        if(head==null){
            head=new Node(item);
            tail=head;
        }
        else {
            Node temp=new Node(item);
            tail.next=temp;
            tail=temp;
        }
        nodeCount++;
    }

    public int size(){
        return nodeCount;
    }

    public int reverseList(){
        reverseNode=head;
        while(reverseNode.next!=null){
            head =reverseNode.next;
            reverseNode.next=head.next;
            head.next=reverseNode;
            System.out.println(head.item);
            nodeCount1++;
        }
        return nodeCount1;
    }

    public static void main(String[] args) {
        ReverseList bl=new ReverseList();
        bl.add(10);
        bl.add(20);
        bl.add(30);
        System.out.println(bl.size());
        System.out.println(bl.reverseList());
    }

}
