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

    public void addNode(LinkedListNode node)
    {
        AddNodeToList(node);
    }

    public void removeNode(LinkedListNode node)
    {
        RemoveNodeFromList(node);
    }

    public LinkedListNode findByData(int data)
    {
        LinkedListNode currentNode = rootNode;
        for (int i = 0; i < linkedListSize; i++) {
            if (currentNode.getData() == data) {
                return currentNode;
            }
            currentNode = currentNode.getChild();
            if (currentNode == null) { // should never happen
                break;
            }
        }

        return null;
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
        } else {
            LinkedListNode currentNode = rootNode;
            while(currentNode.getChild() != null)
            {
                currentNode = currentNode.getChild();
            }

            currentNode.setChild(newNode);
            newNode.setParent(currentNode);
        }
        linkedListSize++;
    }

    private void RemoveNodeFromList(LinkedListNode nodeToRemove)
    {
        LinkedListNode childNode = nodeToRemove.getChild();
        LinkedListNode parentNode = nodeToRemove.getParent();
        if (nodeToRemove == rootNode) {
            rootNode = childNode;
        }

        if (parentNode != null) {
            parentNode.setChild(childNode);
        } 
        if (childNode != null) {
            childNode.setParent(parentNode);
        }
        linkedListSize--;
    }
}