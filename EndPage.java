import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

public class EndPage extends World
{
    public EndPage(int finalScore, Queue notes)
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
        showText("Your score is: " + Integer.toString(finalScore), 350, 300);
        GameOver gameover = new GameOver(); addObject(gameover, 350, 175);
        Buttons playAgain = new Buttons("play again button.png", new StartPage());
        addObject (playAgain, 275, 350);
        Buttons backHome = new Buttons("back to home.png", new HomePage());
        addObject (backHome, 425, 350);
        
        try 
        {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("High Scores.txt", true));
            fileWriter.write(Integer.toString(finalScore));
            fileWriter.newLine();
            fileWriter.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader ("High Scores.txt"));
            String currLine = br.readLine();
            int arrScores[] = new int [30];
            int i = 0;
            while (currLine != null)
            {
                arrScores[i] = Integer.parseInt(currLine);
                i++;
                currLine = br.readLine();
            }
            br.close();
            int highestValue = -1;
            for ( i = 0; i < arrScores.length; i++)
            {
                if (arrScores [i]>highestValue)
                {
                    highestValue = arrScores[i];
                }
            }
            showText("The highest score is: " + Integer.toString(highestValue), 350, 250);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
