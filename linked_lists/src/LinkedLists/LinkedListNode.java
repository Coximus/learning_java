package LinkedLists;

public class LinkedListNode
{
    private LinkedListNode parent;
    private LinkedListNode child;
    private int data;

    public LinkedListNode()
    {        
    }

    public LinkedListNode(int data)
    {
        this.data = data;
    }

    public LinkedListNode getParent()
    {
        return this.parent;
    }

    public LinkedListNode getChild()
    {
        return this.child;
    }

    public int getData()
    {
        return this.data;
    }

    public void setParent(LinkedListNode node)
    {
        this.parent = node;
    }

    public void setChild(LinkedListNode node)
    {
        this.child = node;
    }

    public void setData(int data)
    {
        this.data = data;
    }
}