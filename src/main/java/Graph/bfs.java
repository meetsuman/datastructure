package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class bfs {

    private int V;
    private LinkedList<Integer> a[];

        bfs(int v){
        V=v;
        a=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            a[i]=new LinkedList();
        }
    }
    void addEdge(int v,int c){
            a[v].add(c);
    }

    void bfsSearch(int ele){
            boolean[] visited=new boolean[V];

            LinkedList<Integer> queue=new LinkedList<>();

            visited[ele]=true;
            queue.add(ele);
            while(!queue.isEmpty()){

                int dequeEle=queue.poll();
                System.out.print(dequeEle+" ");

                Iterator<Integer> i=a[dequeEle].listIterator();

                while(i.hasNext()){
                    int n=i.next();
                    if(!visited[n]){
                        visited[n]=true;
                        queue.add(n);
                    }
                }

            }

    }

    public static void main(String[] args) {
        bfs g = new bfs(5);

        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(4, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.bfsSearch(0);
    }
}
