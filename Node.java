import java.util.*;

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node  
{
    //instance variable, what you're adding to the queue
    public Note data; 
    
    //next node always creates an extra one at the end of the linked lsit
    public Node objectPointer;
    public int offset;
    
    public char answer;
    
    public Node (Note n, boolean world, int index)
    {
        offset = n.getOffset(n);
        data = n;
        char arrNoteBank [][] = {{'c', 'b', 'a', 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'g'},
                                {'e', 'd', 'c', 'b', 'a', 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'g', 'f', 'e', 'd', 'c', 'b'}};
        if (world == true)
        {
            answer = arrNoteBank [0][index];
        }
        if (world == false)
        {
            answer = arrNoteBank [1][index];
        }
        objectPointer = null;
    }
}

//object pointer points from one note to another,
