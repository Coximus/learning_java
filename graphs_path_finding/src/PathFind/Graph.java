package PathFind;

import java.util.LinkedList;
import java.util.ListIterator;
import PathFind.Node;

public class Graph
{
	public Node[][] graph;
	private int width;
	private int height;

	public Graph(int width, int height)
	{
		this.width = width;
		this.height = height;
		graph = new Node[width][height];
		initGraph();
	}

	public void printGraph()
	{
		System.out.println("-----Graph-----");
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.printf("%c", graph[i][j].marker);
			}
			System.out.println();
		}
	}

	public Node getNode(int x, int y) 
	{
		if (x >= 0 && x < width && y >= 0 && y < height) {
			return graph[x][y];
		}
		return null;
	}

	public void mapPath(Node source, Node dest)
	{
		LinkedList<Node> ll = new LinkedList<Node>();
		ll.add(dest);
		dest.visited = true;
		while(ll.size() != 0) {
			Node top = (Node)ll.getFirst();
			ll.removeFirst();
			if (top.x == source.x && top.y == source.y) {
				dest.marker = 'D';
				return;
			}
			top.marker = 'V';
			ListIterator<Node> listIterator = top.neighbours.listIterator();
			while(listIterator.hasNext()) {
				Node next = listIterator.next();
				if (next.visited == false) {
					next.visited = true;
					ll.add(next);
				}
			}
		}
		dest.marker = 'D';
	}

	private void initGraph()
	{
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				graph[x][y] = new Node(x, y);
			}
		}

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Node current = graph[x][y];
				if (x - 1 >= 0) {
					current.neighbours.add(graph[x-1][y]);
				}
				if (x + 1 < width) {
					current.neighbours.add(graph[x+1][y]);
				}
				if (y - 1 >=  0) {
					current.neighbours.add(graph[x][y-1]);
				}
				if (y + 1 < height) {
					current.neighbours.add(graph[x][y+1]);
				}
			}
		}
	}
}