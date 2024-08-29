import greenfoot.World;

public class Queue  
{
    Node head;
    int finalScore = 0;
    int dequeueCounter = 0;

    public static Queue enqueue(int offset, Queue notes, boolean world, int index)
    {
        //makes a new node called newNote and adds the note to it
        Node newNote = new Node(new Note(offset), world, index);
        
        //sets the pointer of that node to null.
        newNote.objectPointer = null;
        
        //if there is no head in the list,
        if (notes.head == null)
        {
            //the head is this newNote
            notes.head = newNote;
        }
        
        else
        {
            //otherwise, set the tail to the head
            Node tail = notes.head;
            
            //to find the actual tail, while there is always a pointer from the previous note, the tail is where it is pointing to
            while (tail.objectPointer != null)
            {
                tail = tail.objectPointer;
            }
            
            //set the pointer of the tail to the new node created
            tail.objectPointer = newNote;
        }
        
        return notes;
    }
    
    public void dequeue(Queue notes)
    {
        dequeueCounter++;
        if (dequeueCounter > 4)
        {
            notes.head = notes.head.objectPointer;
        }
    }
    
    public void remove(Queue notes)
    {
        notes.head = notes.head.objectPointer;
    }

    public static boolean isEmpty(Queue notes)
    {
        if (notes.head == null)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}

