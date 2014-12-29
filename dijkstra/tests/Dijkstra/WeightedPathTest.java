package tests.Dijkstra;

import static org.junit.Assert.*;
import org.junit.Test;
import Dijkstra.WeightedPath;
import Dijkstra.Node;

public class WeightedPathTest
{
    @Test
    public void testCanInstantiate()
    {
        WeightedPath wp = new WeightedPath(8);
        assertTrue(wp instanceof WeightedPath);
    }

    @Test
    public void testCanAddNodes()
    {
        WeightedPath wp = new WeightedPath(8);
        for (int i = 0; i < 8; i++) {
            wp.addNode(new Node(i, i*10, i*10));
        }
        // Set weights for A
        wp.setEdgeWeight(0, 1, 20);
        wp.setEdgeWeight(0, 3, 80);
        wp.setEdgeWeight(0, 6, 90);
        // Set weights for B
        wp.setEdgeWeight(1, 5, 10);
        // Set weights for C
        wp.setEdgeWeight(2, 3, 10);
        wp.setEdgeWeight(2, 5, 50);
        wp.setEdgeWeight(2, 7, 20);
        // Set weights for D
        wp.setEdgeWeight(3, 6, 20);
        wp.setEdgeWeight(3, 2, 10);
        // Set weights for E
        wp.setEdgeWeight(4, 1, 50);
        wp.setEdgeWeight(4, 6, 30);
        // Set weights for F
        wp.setEdgeWeight(5, 2, 10);
        wp.setEdgeWeight(5, 3, 40);
        // Set weights for G
        wp.setEdgeWeight(6, 0, 20);
        // Set weights for G - NA

        wp.printNodes();
        wp.printPathWeights();

        for (int i = 0; i < 8; i++) {
            wp.findPathsForNode(i); 
        }        
        wp.printPathWeights();
    }
}