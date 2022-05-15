package tree.bst;

public class bstinsert {

    class Node{
        int key;
        Node left,right;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    bstinsert(){
        root=null;
    }

    void addNode(int val){
        root=insertRecord(root,val);
        System.out.println("add node2 "+ root.key);
    }

    Node insertRecord(Node root, int key ){
        if(root==null){
            root=new Node(key);
            System.out.println("1="+ root.key);
            return root;
        }
        if(key < root.key){
            System.out.println("2="+ root.key);
            root.left=insertRecord(root.left,key);
            //System.out.println("3="+ root.left.key);
        }
        else if(key > root.key){
            System.out.println("4="+ root.key);
            root.right=insertRecord(root.right,key);
            //System.out.println("5="+ root.key);
        }
        return root;
    }

    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            //System.out.println("6="+ root.key);
            inorderRec(root.left);
            //System.out.println(root.key);
            inorderRec(root.right);
            //System.out.println("7="+ root.key);
        }
    }

    public static void main(String[] args) {
        bstinsert bst=new bstinsert();
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(25);
        bst.addNode(55);
        bst.addNode(35);
        //bst.addNode(70);
        //bst.addNode(60);
        bst.inorder();
    }
}
