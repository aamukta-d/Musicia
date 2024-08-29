import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialPage extends World
{

    /**
     * Constructor for objects of class TutorialPage.
     * 
     */
    public TutorialPage(HomePage hWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        setBackground("final-tutorial-page.jpg");
        
        Buttons quitButton = new Buttons("quit button.png", hWorld); addObject(quitButton, 687, 12);
    }
}
