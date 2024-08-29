import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
import greenfoot.World;

/**
 * Write a description of class note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note extends Actor
{
    public int offset = 0;
    private boolean hasKeyBeenPressed = false;
    public String arrPosMessages[] = {"Great job!", "Keep Going!", "Well Done!", "Amazing!!", "You're doing so great!", "Fantastic!", "Superb!", "Excelent"};
    public String arrNegMessages[] = {"Good try!", "Better luck next time!", "Not quite :(", "Stay positive!", "Don't give up just yet!", "Keep practicing!"};
    public boolean rightOrWrong = false;
    public int actCounter = 0;
    public int outCounter = 0;
           
    public Note(int inOffset) //later, add a parameter for the clef
    {
        setOffset(inOffset);
        if (offset == 0)
        {
            setImage (new GreenfootImage("high ledger 3.png")); 
        }
        if (offset == 24)
        {
            setImage (new GreenfootImage("high ledger 2.png"));
        }
        if (offset == 39)
        {
            setImage (new GreenfootImage("high ledger 1.png"));
        }
        if (offset == 56 ||offset == 76 ||offset == 98 ||offset == 114 ||offset == 136 ||offset == 155)
        {
            setImage (new GreenfootImage("Asset 5.png"));
        }
        if (offset == 69 ||offset == 90 ||offset == 109 ||offset == 133 ||offset == 151)
        {
            setImage (new GreenfootImage ("Asset 4.png"));
        }
        if (offset == 165)
        {
            setImage (new GreenfootImage ("middle c.png"));
        }
        if (offset == 188)
        {
            setImage (new GreenfootImage ("low ledge 2.png"));
        }
        if (offset == 216)
        {
            setImage (new GreenfootImage ("low ledger 1.5.png"));
        }
        if (offset == 228)
        {
            setImage (new GreenfootImage ("low ledger 3.png"));
        }
        
        
    }
    
    private void setOffset(int setToOffset)
    {
        offset = setToOffset;
    }
    
    public void act()
    {
        this.move(-3);
    
        if (getX() > 140 && getX() < 185 && hasKeyBeenPressed == false && (TestWorld.notes.isEmpty(TestWorld.notes) != true))//while we're in the region, if a key hasn't already been pressed
        {
            if (greenfoot.Greenfoot.isKeyDown(Character.toString(TestWorld.notes.head.answer)))//if a key has been pressed and it's correct,
            {
                score(true);
                ((TestWorld) getWorld()).finalScore();
                hasKeyBeenPressed = true;
            }
        }
        
        if (getX() < 190 && getX() > 185 && outCounter == 0)
        {   
            outCounter++;

        }
        
        if (getX() < 140 && getX() > 130 && hasKeyBeenPressed == false)
        {
            score(false);
            hasKeyBeenPressed = true;
        }
            
        if (getX() <= 130) 
        {
            getWorld().removeObject(this);
        }
        actCounter++;
    }
    
    public void score(boolean correct)
    {
        if (correct == true)
        {
            getWorld().showText (arrPosMessages[greenfoot.Greenfoot.getRandomNumber(7)], 350, 450);
        }  
        if (correct == false)
        {
            getWorld().showText (arrNegMessages[greenfoot.Greenfoot.getRandomNumber(5)], 350, 450);
        }
    }
    
    public int getOffset (Note x)
    {
        return offset;
    }
}

