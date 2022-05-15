package tree.BT;

public class highestHeight {
    public static class Node{
        int k;
        Node left,right;

        public Node(int i) {
            k=i;
            left=right=null;
        }

    }

    public int higesthieghtcnt(Node root){
        if(root==null){
            return 0;
        }
        System.out.println(root.k);
        return max(higesthieghtcnt(root.left),higesthieghtcnt(root.right))+1;
    }
    public int max(int a,int b)
    {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        highestHeight nf=new highestHeight();
        Node root=new Node(2);
        root.left=new Node(7);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.left.left.left=new Node(10);
        root.left.left.right=new Node(11);
        root.right.right=new Node(9);
        root.right.right.left=new Node(4);

        System.out.println(nf.higesthieghtcnt(root));
    }
}
