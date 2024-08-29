import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clef_buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Clef_buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private World link;
    public Buttons(String image, World link)
    {
        setImage (new GreenfootImage(image));
        this.link = link;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked (this))
        {
            Greenfoot.setWorld(this.link);
        }
    }
}
