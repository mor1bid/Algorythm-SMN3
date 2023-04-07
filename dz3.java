public class dz3 {
    Node head;
    
    public void revert() 
    {
        if (head != null && head.next != null) 
        {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }

    }
    private void revert(Node currentNode, Node previousNode)
    {
        if(currentNode.next == null) 
        {
            head = currentNode;
        }
        else 
        {
            revert(currentNode, currentNode.previous);
        }
        currentNode = currentNode.previous; //поворот
        currentNode.next = currentNode.previous;
        currentNode.previous = null;
    }

    public class Node 
    {
        int value;
        Node next;
        Node previous;
    }
}
