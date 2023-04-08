package LinkedList;

public class ReverseList2 {
     static Node head;

     static class Node{
         int item;
         Node next;

         Node(int item){
             this.item=item;
             this.next=null;
         }
    }

    Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next1 = null;
        while (current != null) {
            next1= current.next;
            current.next = prev;
            prev = current;
            current = next1;
        }
        node=prev;
        return node;
    }

    Node reverseListRecursive(Node node) {
        Node head=node;
            if (head == null || head.next == null)
                return head;

        /* reverse the rest list and put
        the first element at the end */
        System.out.println("head0 "+head.item);
            Node rest = reverseListRecursive(head.next);
            System.out.println("rest "+rest.item);
            System.out.println("head "+head.item);
            head.next.next = head;
        //System.out.println("rest1 "+rest.next.next.item);
        System.out.println("head1 "+head.next.item);
            /* tricky step -- see the diagram */
            head.next = null;
        System.out.println("head2 "+head.item);

            /* fix the head pointer */
            return rest;
    }

    void print(Node node){
        while(node!=null){
            System.out.println(" "+node.item);
            node=node.next;
        }
    }

    public static void main(String[] args) {
        ReverseList2 bl=new ReverseList2();
        bl.head=new Node(10);
        bl.head.next=new Node(20);
        bl.head.next.next=new Node(30);
        bl.head.next.next.next=new Node(40);
        bl.head.next.next.next.next=new Node(50);
        //bl.print(head);
        //head=bl.reverseList(head);
        //bl.print(head);
        head=bl.reverseListRecursive(head);
        bl.print(head);


    }

}
