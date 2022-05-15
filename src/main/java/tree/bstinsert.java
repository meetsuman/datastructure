package tree;

public class bstinsert {
    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
        //Node head=null;

    public void addnode(Node head,int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        if (val > head.key) {
            if (head.right == null) {
                head.right = new Node(val);
                return;
            }
            addnode(head.right, val);
        } else {
            if (head.left == null) {
                head.left = new Node(val);
                return;
            }
            addnode(head.left, val);
        }
    }
    void printinorder(Node nd){
         if(nd == null){
             return;
         }
        printinorder(nd.left);
        System.out.println(nd.key);
        printinorder(nd.right);
     }
    public void inordertraverse(){
        //printinorder(head);
    }

    public static void main(String[] args) {
        bstinsert bst=new bstinsert();
        //bst.addnode(10);
        //bst.addnode(20);
        bst.inordertraverse();
    }
}
