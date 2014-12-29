package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import PathFind.Graph;
import PathFind.Node;

public class GraphTest
{
	@Test
	public void testCanInstantiate()
	{
		Graph g = new Graph(10, 10);
		assertTrue(g instanceof Graph);
	}

	@Test
	public void testGetPath()
	{
		Graph g = new Graph(10, 10);
		Node source = g.getNode(2,2);
		Node dest = g.getNode(8,8);
		source.marker = 'S';
		dest.marker = 'D';
		g.mapPath(source, dest);
		g.printGraph();
	}
}