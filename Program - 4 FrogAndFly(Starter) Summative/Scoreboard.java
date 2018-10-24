import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    //integer that holds the value for the points that the user has collected
    private int points;
    
    /**
     * sets up the scoreboard by setting the points to 0 and making "Food Eaten" appear in the top corner
     * everytime the user eats food the number beside Food Eaten goes up by one
     * 
     * @param there are no parameters
     * @return there is no return
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage eatenFood = new GreenfootImage(150,30);
        eatenFood.drawString("Food Eaten: " + points, 5,25);
        setImage(eatenFood);
    }
    
    /**
     * everytime the addToScore method is called the it clears the current points in the top corner
     * then it adds a new number to the top corner replacing the one form before
     * 
     * @param there are no parameters
     * @return there is no return
     */
    public void addToScore()
    {
        points++;
        GreenfootImage img = getImage();
        img.clear(); 
        img.drawString("Food Eaten: " + points, 5,25); 
    }
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
