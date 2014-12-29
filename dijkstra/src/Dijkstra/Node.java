package Dijkstra;

public class Node
{
    public int id;
    public int x;
    public int y;

    public Node(int id, int x, int y)
    {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "ID : " + id + " [" + x + "," + y + "]";
    }
}