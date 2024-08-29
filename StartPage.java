import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World
{
    /**
     * Constructor for objects of class StartPage.
     * 
     */
    public StartPage()
    {    
        super(700, 500, 1); 
        
        showText ("Choose your clef:", 350, 125);
        
        Buttons treblebutton = new Buttons("new treble button.png", new TestWorld(true, this));
        addObject (treblebutton, 500, 300);
        
        Buttons bassbutton = new Buttons("bass clef button_1.png", new TestWorld(false, this));
        addObject (bassbutton, 200, 300);
    }
}
