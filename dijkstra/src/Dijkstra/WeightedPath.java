package Dijkstra;

import Dijkstra.Node;

public class WeightedPath
{
    private Node[] nodes;
    private int[][] graph;
    private int nodeCount;

    public WeightedPath(int nodeCount)
    {
        this.nodeCount = nodeCount;
        nodes = new Node[nodeCount];
        graph = new int[nodeCount][nodeCount];
        fillGraph();
    }

    public void addNode(Node n)
    {
        if (n.id < nodeCount) {
            nodes[n.id] = n;
        }
    }

    public void findPathsForNode(int id)
    {        
        if (id >= nodeCount) {
            return;
        }
        boolean[] visited = new boolean[nodeCount];
        visited[id] = true;
        int i = id;
        while (true) {
            int lowest = 1000000000;
            int lowNode = -1;
            for (int j = 0; j < nodeCount; j++) {
                if (!visited[j] && graph[id][j] != -1 && graph[id][j] < lowest) {
                    lowest = graph[id][j];
                    lowNode = j;
                }
            }
            if (lowNode == -1) {
                break;
            }
            visited[lowNode] = true;
            for (int k = 0; k < nodeCount; k++) {
                if (graph[lowNode][k] == -1) {
                    continue;
                }
                if (graph[id][k] == -1) {
                    graph[id][k] = graph[lowNode][k]+lowest;
                } else if (graph[id][k] > (graph[lowNode][k]+lowest)) {
                    graph[id][k] = graph[lowNode][k]+lowest;
                }
            }
        }
        graph[id][id] = 0;
    }

    public void printNodes()
    {
        for (int i = 0; i < nodeCount; i++) {
            if (nodes[i] != null) {
                System.out.println(nodes[i]);
            }            
        }
    }

    public void printPathWeights()
    {
        System.out.println("---- Edge Weights ----");
        for (int i = 0; i < nodeCount; i++) {
            System.out.print("|");
            for (int j = 0; j < nodeCount; j++) {
                System.out.printf(" %d", graph[i][j]);
            }
            System.out.println(" |");
        }
    }    

    public Node getNode(int id) {
        return nodes[id];
    }

    public void setEdgeWeight(int sNode, int dNode, int weight) {
        if (sNode < nodeCount && dNode < nodeCount) {
            graph[sNode][dNode] = weight;
        }
    }

    private void fillGraph()
    {
        for (int i = 0; i < nodeCount; i++) {
            for (int j= 0; j< nodeCount; j++) {
                graph[i][j] = -1;
            }
        }
    }
}