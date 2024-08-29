import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        Title title = new Title();
        addObject (title, 350, 200);
        
        Buttons playButton = new Buttons("play button.png", new StartPage());
        addObject (playButton, 420, 300);
        
        Buttons tutorialButton = new Buttons("tutorial button.png", new TutorialPage(this));
        addObject (tutorialButton, 300, 300);
    }
}
