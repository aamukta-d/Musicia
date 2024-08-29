import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Staff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Staff extends Actor
{
    /**
     * Act - do whatever the Staff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Staff (boolean world)
    {
        if (world == false)
        {
            this.setImage("bass clef final staff.png");
        }
    }
}
