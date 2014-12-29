package GraphDepthFirst;

import GraphDepthFirst.Node;
import java.util.Arrays;
import java.util.Stack;
import java.util.ListIterator;

public class GraphDepthFirst
{
	public Node[][] graph;
	private int width;
	private int height;

	public GraphDepthFirst(int width, int height)
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

	public void paintFill(int x, int y)
	{
		if (x >= 0 && x < width && y >= 0 && y < height) {
			Stack s = new Stack();
			s.push(getNode(x, y));
			while (s.empty() == false)
			{
				Node top = (Node)s.pop();
				if (top.x < 0 && top.y >= width) {
					continue;
				}
				if (top.y < 0 && top.y >= height) {
					continue;
				}
				if (top.visited) {
					continue;
				}
				if (top.marker == 'X') {
					continue;
				}

				top.marker = 'P';
				top.visited = true;

				ListIterator<Node> listIterator = top.neighbours.listIterator();
				while(listIterator.hasNext()) {
					s.push(listIterator.next());
				}
			}
		}
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