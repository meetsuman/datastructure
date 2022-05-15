package LinkedList;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;
    public BasicLinkedList() {
        first=null;
        last=null;
        nodeCount=0;
    }
private class Node{
        private Node nextNode;
        private X nodeItem;

        public Node(X Item){
            this.nextNode=null;
            this.nodeItem=Item;
        }
        public void setNextNode(Node nextNode){
            this.nextNode=nextNode;
        }
        public Node getNextNode(){
            return nextNode;
        }
        public X getNodeItem(){
            return nodeItem;
        }
}
    public void add(X item){
        if(first==null){
            first=new Node(item);
            last=first;
        }
        else{
            Node lastnode=new Node(item);
            last.setNextNode(lastnode);
            last=lastnode;
        }
        nodeCount++;
    }
    public X remove(){
        if(first==null){
            throw new IllegalStateException("The linked list is empty");
        }
        X nodeItem= first.getNodeItem();
        first=first.getNextNode();
        nodeCount--;
        return nodeItem;
    }
    public void insert(X item,int position){
        if(size()<position){
            throw new IllegalStateException("The size is less than position");
        }
        Node currentNode=first;
        for(int i=1;i<position;i++){
            currentNode=currentNode.getNextNode();
        }
        Node curr=new Node(item);
        curr.setNextNode(currentNode.getNextNode());
        currentNode.setNextNode(curr);
        nodeCount++;
    }
    public int size(){
        return nodeCount;
    }


public static void main(String[] args) {
        BasicLinkedList bl=new BasicLinkedList();
        bl.add(10);
        bl.add(20);
        bl.add("abc");
        bl.add(30);
        System.out.println(bl.size());
        //bl.insert(40,2);
        //System.out.println(bl.remove());
        System.out.println(bl.size());
    }
}
