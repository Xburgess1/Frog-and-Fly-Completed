import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    /**
     * gets a random number from 4- 8 to be set as the speed of the frog
     * 
     * @param there are no parameters
     * @return there is no return
     */
    public Frog()
    {        
        // gets a random number from 4- 8 to be set as the frogs speed
        speed = Greenfoot.getRandomNumber(4) + 4;
    }
    
    public void act() 
    {
        //calls the move method 
        move();
        
        //calls the touchingFly method
        touchingFly();
    }  
    
    /**
     * makes the frog move forward by a random number between 4 and 8
     * 35% of the time the frog turns one way, 50% of the time it turns 15 degrees clockwise the other 50% it turns 15 degrees counter clockwise
     * if the frog reaches the edge of the world it turns 7 degrees clockwise
     * 
     * @param there are no parameters
     * @return there is no return
     */
    private void move()
    {
        move(speed); 
        
        if(Greenfoot.getRandomNumber(100) < 35)
        {
            if(Greenfoot.getRandomNumber(2) < 1)
            {
                turn(15);
            }
            else
            {
                turn(-15);
            }
        }
        
        if(atEdgeOfWorld() == true)
        {
            turn(7);
        }
    }
    
    /**
     * if the frog comes into contact with the fly the senacrio stops
     * 
     * @param there are no parameters
     * @return there is no return
     */
    private void touchingFly()
    {
        if(isTouching(Fly.class) == true)
        {
            Greenfoot.stop();
        }
    }
}
