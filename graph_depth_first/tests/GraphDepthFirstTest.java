package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import GraphDepthFirst.GraphDepthFirst;

public class GraphDepthFirstTest
{
	@Test
	public void testCanInstantiate()
	{
		int width = 50;
		int height = 50;
		GraphDepthFirst g = new GraphDepthFirst(width, height);
		assertTrue(g instanceof GraphDepthFirst);
	}

	@Test
	public void testCanFillSection()
	{
		int width = 50;
		int height = 50;
		GraphDepthFirst g = new GraphDepthFirst(width, height);
		
		g.getNode(0, 10).marker = 'X';
		g.getNode(1, 11).marker = 'X';
		g.getNode(2, 12).marker = 'X';
		g.getNode(3, 11).marker = 'X';
		g.getNode(4, 10).marker = 'X';
		
		g.getNode(3, 9).marker = 'X';
		g.getNode(2, 8).marker = 'X';
		g.getNode(1, 9).marker = 'X';
		
		g.printGraph();
		g.paintFill(3, 10);
		g.printGraph();
		assertTrue(g instanceof GraphDepthFirst);	
	}
}