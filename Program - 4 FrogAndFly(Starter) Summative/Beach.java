import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score;
    
    public void act()
    {
        if(getObjects(Food.class).size()== 0)
        {
            addFood(10);
        }
    }
    
    public Beach()
    {    
       super(800, 600, 1); 

       //calls the addFood method
       addFood(10);

       // adds a fly to the world in a random position
       addObject(new Fly(),Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       
       // adds a frog to the center of the world
       addObject(new Frog(),(getWidth()/2),(getHeight()/2));
       
       score = new Scoreboard();
       addObject(score, 75,25);
    }
    
    /**
     * Adds 10 pieces of food in random positions on the world
     * each piece of food has a random x and y location
     * 
     * @param the parameter is int n
     * @return there is no return
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            //gets a random value for the x location of the food
            int x = Greenfoot.getRandomNumber( getWidth() );
            
            //gets a random value for the y location of the food
            int y = Greenfoot.getRandomNumber( getHeight() );
            
            //adds all the food in random positions
            addObject(new Food(),x,y);
          
        }
    }
    
    public void update()
    {
        score.addToScore();
    }
}
