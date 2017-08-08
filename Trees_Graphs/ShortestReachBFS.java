import java.io.*;
import java.util.*;

public class SortestReachBFS {
    private static class Node {
        int id;
        List<Node> list = new LinkedList<>();
        private Node(int id) {
            this.id = id;
        }
        
        private void addNode(Node node) {
            list.add(node);
        }
        
        private List<Node> getList() {
            return list;
        }
    }
    public static int calcDistance(int n, Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return -1;
        }
        int edgeLength = 6;
        int level = 0;
        
        Queue<Node> firstQueue = new LinkedList<>();
        Queue<Node> secondQueue = new LinkedList<>();
        
        firstQueue.offer(node1);
        
        boolean[] visited = new boolean[n];
        
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            while (!firstQueue.isEmpty()) {
                Node tmp = firstQueue.poll();
                if (visited[tmp.id]) {
                    continue;
                }
                if (tmp.id == node2.id) {
                    return level * edgeLength;
                }
                visited[tmp.id] = true;
                
                secondQueue.addAll(tmp.getList());
            }
            level++;
            while (!secondQueue.isEmpty()) {
                Node tmp = secondQueue.poll();
                if (visited[tmp.id]) {
                    continue;
                }
                if (tmp.id == node2.id) {
                    return level * edgeLength;
                }
                visited[tmp.id] = true;
                firstQueue.addAll(tmp.getList());
            }
            level++;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        for (int i = 0; i < test; i++) {
            int nodes = in.nextInt();
            int edges = in.nextInt();
            
            Node[] graphElements = new Node[nodes];
            for (int j = 0; j < edges; j++) {
                int x = in.nextInt() - 1;
                Node xNode = graphElements[x];
                if (xNode == null) {
                    xNode = new Node(x);
                    graphElements[x] = xNode;
                }
                
                int y = in.nextInt() - 1;
                Node yNode = graphElements[y];
                if (yNode == null) {
                    yNode = new Node(y);
                    graphElements[y] = yNode;
                }
                
                xNode.addNode(yNode);
                yNode.addNode(xNode);
            }
            
            int s = in.nextInt() - 1;
            for (int k = 0; k < graphElements.length; k++) {
                if (k != s) {
                    int distance = calcDistance(nodes, graphElements[k], graphElements[s]);
                    System.out.print(distance + " ");
                }
            }
            System.out.println();
        }
    }
}