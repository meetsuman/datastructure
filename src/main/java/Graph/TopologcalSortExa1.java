package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TopologcalSortExa1 {
    public ArrayList<ArrayList<Integer>> a;
    int v;

    public TopologcalSortExa1(int v) {
        this.v=v;
        a=new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            a.add(new ArrayList<Integer>());
        }

    }

    public void addEdge(int v,int w){
        a.get(v).add(w);
        //System.out.println("value= "+v+" "+a.get(0).iterator().hasNext());


    }

    void topologcalSortLogic2(int num,boolean visited[],Stack<Integer> stack) {

        visited[num]=true;
        Integer num1;
        //
        //
        //System.out.println(a.get(2).iterator().);
        //System.out.println(a.size());


            Iterator<Integer> it = a.get(num).iterator();
            //System.out.println(v);
            while (it.hasNext()) {
                //System.out.println(num);
                num1 = it.next();
                //System.out.println("hi "+num1);
                if (!visited[num1])
                    //System.out.println("hi "+num1);
                    topologcalSortLogic2(num1, visited, stack);
            }

        stack.push(new Integer(num));

    }


    void topologcalSortLogic1(){

        Stack<Integer> stack=new Stack<Integer>();

        boolean[] visited=new boolean[v];
        for (int i = 0; i < v; i++) {
            visited[i]=false;
        }

        for (int i = 0; i < v; i++) {
            if(visited[i]==false)
                //System.out.println("hi");
                topologcalSortLogic2(i,visited,stack);
        }
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }

    public static void main(String[] args) {

        TopologcalSortExa1 g=new TopologcalSortExa1(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.topologcalSortLogic1();

    }
}
