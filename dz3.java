public class dz3 {
    Node head;

    public void revert() {
        if (head != null && head.next != null) 
        {
            revert(head.next, head);
        }

    }; //запуск 
    private void revert(Node currentNode, Node previousNode)
    {
        if(currentNode.next == null) 
        {
            head = currentNode;
        }
        else 
        {
            revert(currentNode.next, currentNode);
        }
        currentNode = previousNode; //поворот
        previousNode.next = null;
    }

    public class Node 
    {
        int value;
        Node next;
    }
}
