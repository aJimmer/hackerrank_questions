import java.io.*;
import java.util.*;
 
class Graph
{
    private int vCount;  
    private LinkedList<Integer> adj[];
 

    Graph(int numOfVertices) {
        vCount = numOfVertices;
        adj = new LinkedList[numOfVertices];
        for (int i=0; i<numOfVertices; ++i) adj[i] = new LinkedList();
    }
 
    void addEdge(int vertex, int weight) {
        adj[vertex].add(weight);
    }
 
    void BFS(int s) {

        boolean visited[] = new boolean[vCount];
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        visited[s]=true;
        queue.add(s);
 
        while (!queue.isEmpty()){

            s = queue.remove();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
 
        g.BFS(2);
    }
}