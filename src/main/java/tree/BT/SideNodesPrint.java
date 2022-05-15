package tree.BT;

public class SideNodesPrint {
    public static class Node {
        int k;
        Node left, right;

        public Node(int i) {
            k = i;
            left = right = null;
        }

    }

    public void leftsidenode(Node root) {
       if(root==null){
           return;
       }
       leftsidenode(root.left);
       if(root.left!=null) {
           System.out.print(root.k + " ");
       }
    }

    public void rightsidenode(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.k+" ");
        rightsidenode(root.right);
    }

    public void leafNodes(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.k+" ");
        }
        leafNodes(root.right);
        leafNodes(root.left);
    }

    public static void main(String[] args) {
        SideNodesPrint nf = new SideNodesPrint();
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(11);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
        nf.leftsidenode(root);
        nf.rightsidenode(root.right);
        nf.leafNodes(root);
    }
}