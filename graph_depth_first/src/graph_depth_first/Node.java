package GraphDepthFirst;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Node
{
	public List<Node> neighbours;
	public char marker;
	public boolean visited;

	public int x;
	public int y;

	public Node(int x, int y)
	{
		this.x = x;
		this.y = y;
		neighbours = new LinkedList<Node>();
		marker = '.';
		visited = false;
	}

	public void printNeighbourLocations()
	{
		ListIterator<Node> listIterator = neighbours.listIterator();
		System.out.printf("{");
		while(listIterator.hasNext()) {
			listIterator.next().printXY();
		}
		System.out.println("}");
	}

	public void printXY()
	{
		System.out.printf("[%d,%d]", x,y);
	}
}