package tree.BT;

public class NoOfLeafNode {

    public static class Node{
        int k;
        Node left,right;

        public Node(int i) {
            k=i;
            left=right=null;
        }
    }

    public int noOfLeaf(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return noOfLeaf(root.left)+noOfLeaf(root.right);
    }

    public static void main(String[] args) {
        NoOfLeafNode nf=new NoOfLeafNode();
        Node root=new Node(10);
        root.left=new Node(12);
        root.right=new Node(30);

        System.out.println(nf.noOfLeaf(root));
    }
}
