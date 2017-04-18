/**
   This class implements a queue based 
	on linked lists.
*/

public class LinkedQueue
{
    private class Node
    {
        Object obj;
        Node next;
        Node(Object obj, Node n)
        {
            this.obj = obj; 
            next = n;
        }       
    }

    private Node front = null; 
    private Node rear = null;                                     
    
    /**
       The method enqueue adds a value
		 to the queue.
       @param s The value to be added
		 to the queue.
    */
    
    public void enqueue(Object o)
    {
        if (rear != null)
        {
           rear.next = new Node(o, null);
           rear = rear.next;
        }
        else
        {
            rear = new Node(o, null);
            front = rear;
        }
    }
    
    /**
       The empty method checks to see if 
		 the queue is empty.
       @return true if and only if queue
		 is empty.
    */

    public boolean empty()
    {
        return front == null;
    }
    
    /**
       The method peek returns value at the
       front of the queue.
       @return item at front of queue.
		 @excepton EmptyQueueException When the
		 queue is empty.
    */
    
    public Object peek()
    {
        if (empty())
            throw new EmptyQueueException();
        else
            return front.obj;        
    }
    
    /**
       The dequeue method removes and returns 
       the item at the front of the queue.
       @return item at front of queue.
		 @exception EmptyQueueException When
		 the queue is empty.
    */
    
    public Object dequeue()
    {
       if (empty()) 
           throw new EmptyQueueException();
       else
       {
           Object value = front.obj;
           front = front.next;
           if (front == null) rear = null;    
           return value;
       }
    }
    
    /**
       The toString method concatenates all strings
       in the queue to give a string representation 
       of the contents of the queue.        
       @return string representation of this queue.
    */
    
    public String toString()
    {
       StringBuilder sBuilder = new StringBuilder();
       
       // Walk down the list and append all values
       Node p = front;
       while (p != null)
       {
           sBuilder.append(p.obj + " ");
           p = p.next;
       }
       return sBuilder.toString();        
    }
}