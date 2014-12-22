package LinkedLists;

import LinkedLists.LinkedListNode;

public class LinkedList
{
    private LinkedListNode rootNode;
    private int linkedListSize;

    public LinkedList()
    {
        linkedListSize = 0;
    }

    public int getSize()
    {
        return linkedListSize;
    }

    public void addData(int data)
    {
        LinkedListNode newNode = new LinkedListNode(data);
        AddNodeToList(newNode);
    }

    public int[] toArray()
    {
        if (rootNode == null) {
            return null;
        }

        int[] returnArray = new int[linkedListSize];
        LinkedListNode currentNode = rootNode;
        for (int i = 0; i < linkedListSize; i++) {
            returnArray[i] = currentNode.getData();
            currentNode = currentNode.getChild();
            if (currentNode == null) { // should never happen
                break;
            }
        }
        
        return returnArray;
    }

    private void AddNodeToList(LinkedListNode newNode)
    {
        if (rootNode == null) {
            rootNode = newNode;
            return;
        }

        LinkedListNode currentNode = rootNode;
        while(currentNode.getChild() != null)
        {
            currentNode = currentNode.getChild();
        }

        currentNode.setChild(newNode);
        newNode.setParent(currentNode);
        linkedListSize++;
    }
}