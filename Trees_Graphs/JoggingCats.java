import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Node {
	private int id;
	public ArrayList<Integer> edges;
	public boolean active;
	
	Node (int id_) {
		id = id_;
		edges = new ArrayList<Integer>();
		active = true;
	}
}

public class JoggingCats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		
		Node[] nodes = new Node[N + 1];
		
		for (int i = 1; i <= N; i++) {
			nodes[i] = new Node(i);
		}
		for (int j = 0; j < M; j++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			nodes[a].edges.add(b);
			nodes[b].edges.add(a);
		}
		long sum = 0;
		
		for (int k = 1; k <= N; k++) {
			nodes[k].active = false;
			
			HashMap<Integer, Integer> paths = new HashMap<>();
			
			for (int e : nodes[k].edges) {
				if (nodes[e].active) {
					for (int d : nodes[e].edges) {
						if (nodes[d].active) {
							paths.put(d, (paths.containsKey(d) ? paths.get(d) + 1 : 1));
						}
					}
				}
			}
			
			for (int f : paths.keySet()) {
				long g = paths.get(f);
				if (g >= 2) {
					sum += (g * (g - 1L)/2L);
				}
			}
		}
		System.out.println(sum);
	}
}