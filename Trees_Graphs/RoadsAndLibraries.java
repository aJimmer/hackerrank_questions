/*

-----------------------------------
    Test Input
-----------------------------------
5
9 2 91 84
8 2
2 9
5 9 92 23
2 1
5 3
5 1
3 4
3 1
5 4
4 1
5 2
4 2
8 3 10 55
6 4
3 2
7 1
1 0 5 3
2 0 102 1


-----------------------------------
    Test Output
-----------------------------------

805
184
80
5
204


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadsAndLibraries {
    
    private static long dfs(int root, Map<Integer, Set<Integer>> graph, boolean[] visited, long count) {
        
        visited[root] = true;
        
        Set<Integer> neighbors = graph.get(root);
        for(Integer adj:neighbors) {
            if(!visited[adj]) {
                count = 1 + dfs(adj, graph, visited, count);
            }    
        }
        
        return count;
    }
    
   private static long solve(int n, int m, long clib, long croad, Map<Integer, Set<Integer>> graph) {
       long ans = 0;
       
       boolean[] visited = new boolean[n + 1];
       
       for(int node = 1; node < n; node++){
           if(!visited[node]){
               long clusterSize = dfs(node, graph, visited, 1);
               
               ans += clib;
               
               if(clib > croad){
                   ans += ((clusterSize - 1) * croad);
               } else {
                   ans += ((clusterSize - 1) * clib);
               }
           }
       }
       
       return ans;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long clib = in.nextLong();
            long croad = in.nextLong();
            
            Map<Integer, Set<Integer>> graph = new HashMap<>();
            
            for(int node = 1; node <= n; node++){
                graph.put(node, new HashSet<>());
            }

            for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                graph.get(city_1).add(city_2);
                graph.get(city_2).add(city_1);
            }
            
            System.out.println(solve(n, m, clib, croad, graph));
        }
        
    }
}



