package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class example1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        LinkedList al1=new LinkedList();
        al.add("suman");
        al.add("suman sahu");
        System.out.println(al);
        for(String ab : al){
            System.out.println(ab);
        }
        al.add(0,"abc");
        System.out.println(al.get(1));

        Iterator p = al.listIterator();
        Iterator p1 = al1.stream().iterator();

        // print list from second position
        while (p.hasNext()) {
            System.out.println("a"+p.next());
        }

        PriorityQueue<Integer> pq=new PriorityQueue();
        pq.add(1);
    }
}