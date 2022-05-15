package LinkedList;

public class SearchNthNode {
    Node head;

    public void createNode(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
    }

    public int search(int y){
        Node first;
        first=head;
        int count=0;
        while(first.next != null){
            count++;
            if(first.data==y){
                return count;
            }
            first=first.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        SearchNthNode nth=new SearchNthNode();
        nth.createNode(10);
        nth.createNode(20);
        nth.createNode(30);
        nth.createNode(40);
        nth.createNode(50);
        int x=nth.search(15);
        if(x>0){
            System.out.println("Exist "+ x);
        }
        else
            System.out.println("Not Exist");
    }
}
