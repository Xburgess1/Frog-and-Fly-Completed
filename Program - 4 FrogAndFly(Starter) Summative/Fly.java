import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    //holds the information for the amount of food the fly has eaten
    public int foodEaten;
    
    /**
     * Gets a random number from 0- 359 which determines which way the fly is facing
     * sets the amount of food eaten to 0 when the senario starts
     * 
     * @param there are no parameters
     * @return There is no return
     */
    public Fly()
    {  
        setRotation(Greenfoot.getRandomNumber(360));
        
        foodEaten = 0;
    }
    
    public void act() 
    {
        //calls the moveFly method
        moveFly();
        
        //calls the eatingFood method
        eatingFood();
    }
    
    
    
    /**
     * if the user presses the 'w' key the fly move forward in which ever way it's facing
     * if the user presses the 'left' or 'right' key the fly turns by 5 degrees either clockwise or counter clockwise
     * 
     * @param there are no parameters
     * @return there is no return
     */
    private void moveFly()
    {
        // make the fly move 4 steps in the direction it is facing
        if(Greenfoot.isKeyDown("w") == true)
        {
            move(4);
        }
        
        if(Greenfoot.isKeyDown("left") == true)
        {
            turn(5);
        }
        
        if(Greenfoot.isKeyDown("right") == true)
        {
            turn(-5);
        }
    }
    
    /**
     * if the fly comes into contact with a fruit it removes the fruit from the world(eats the fruit)
     * when the fly eats a fruit it adds one to the foodEaten integer
     * 
     * @param there are no parameters
     * @return there is no return
     */
    private void eatingFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            
            foodEaten++;
            
            ((Beach)getWorld()).update();
        }
    }
}
