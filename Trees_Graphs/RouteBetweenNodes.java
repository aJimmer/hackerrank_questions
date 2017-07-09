package RouteBetweenNodes;
import java.util.*;

public class RouteBetweenNodes {
	public class Graph {
		public Set<Node> nodes;
		private Set<Node> getNodes(){
			return nodes;
		}
	}
	
	public class Node {
		int data;
		State state;
		Set<Node> adjacent;
		
		private Set<Node> getAdjacent() {
			return adjacent;
		}
	}

	enum State { Unvisited, Visited, Visiting; }

	boolean search(Graph g, Node start, Node end){
		if (start == end) return true;
		
		// 
			LinkedList<Node> q = new LinkedList<Node>();
			
			for(Node u: g.getNodes()){
				u.state = State.Unvisited;
			}
			
			start.state = State.Visiting;
			
			q.add(start);
			
			Node u;
			while(!q.isEmpty()) {
				u = q.removeFirst();
				if(u != null){
					for(Node v : u.getAdjacent()){
						if(v.state == State.Unvisited){
							if(v == end){
								return true;
							} else {
								v.state = State.Visiting;
								q.add(v);
							}
						}
					}
					u.state = State.Visited;
				}
			}
			return false;
	}
	
	public static void main(String args[]){
		// initiate graph and search it here...
	}
}