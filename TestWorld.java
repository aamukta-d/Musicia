import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class TestWorld extends World
{
    public static Queue notes = new Queue();
    
    int counting = 0;
    int finalScore = 0;
    int howManyNotes = 0;
    int staffPosition;
    int tempRandom;

    public TestWorld(boolean world, StartPage sWorld)
    {   
        super(700,500,1);
    
        InputArea ia = new InputArea(); addObject (ia, 148, 250);
        Staff s = new Staff(world); addObject (s, setXStaff(world), setYStaff(world));
        Buttons quitButton = new Buttons("quit button.png", sWorld); addObject(quitButton, 687, 12);
        
        int arrPossibleOffsets [] = {0, 24, 39, 56, 76, 98, 114, 136, 155, 69, 90, 109, 133, 151, 165, 188, 216, 228};
        
        for (int i = 0; i<=50; i++)
        {
            tempRandom = greenfoot.Greenfoot.getRandomNumber(18);
            notes.enqueue(arrPossibleOffsets[tempRandom], notes, world, tempRandom);
        }
    }
    
    private int setXStaff(boolean world)
    {
        if (world == true)
        {
            return 375;
        }
        else
        {
            return 350;
        }
    }
    
    private int setYStaff(boolean world)
    {
        if (world == true)
        {
            return 250;
        }
        else
        {
            return 240;
        }
    }

    public void act()
    {
        counting++;
        
        if (counting%60 == 0)
        {
            if (notes.isEmpty(notes) == false)
            {
                addNote(notes);
            }
        }
    
        if (((counting)-248)%60 == 0)//every 60 act cycles after the first note leaves the screen, change the head
        {
            if (notes.isEmpty(notes) == false)
            {
                notes.dequeue(notes);
            }
        }
        
        if (counting == 3669)
        {
            Greenfoot.setWorld(new EndPage(finalScore, notes));
        }
    }
    
    public void finalScore()
    {
        finalScore = finalScore + 10;
        int position = 20;
        if (finalScore > 99)
        {
            position = 30;
        }
        showText(Integer.toString(finalScore),30,20);
    }
    
    public Queue getQueue()
    {
        return notes;
    }

    public void addNote(Queue notes)
    {
        if (counting == 120) // when the first note comes up, change the head
        {
            addObject(notes.head.objectPointer.data, 700, notes.head.objectPointer.offset+136); //add the new head to the screen
        }
        else if (counting == 180)
        {
            addObject(notes.head.objectPointer.objectPointer.data, 700, notes.head.objectPointer.objectPointer.offset+136);
        }
        else if (counting == 240)
        {
            addObject(notes.head.objectPointer.objectPointer.objectPointer.data, 700, notes.head.objectPointer.objectPointer.objectPointer.offset+136);
        }
        else if (counting == 60) 
        {
            //add the first note to the screen.
            addObject(notes.head.data, 700, notes.head.offset+136);
        }
        else
        {
            if (howManyNotes <= 53)
            {
                addObject(notes.head.objectPointer.objectPointer.objectPointer.data, 700, notes.head.objectPointer.objectPointer.objectPointer.offset+136);
                howManyNotes++;
            }
        }
    }
}

