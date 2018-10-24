import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    /**
     * gets a random number for the foodType variable which is then used to determine what fruit shows up
     * if the random number is 0 the fruit is an apple
     * if the random number is 1 the fruit is a banana
     * if the random number is 2 the fruit is a cherry
     * if the random number is 3 the fruit is a grape
     * if the random number is anything else teh fruit is a strawberry
     * 
     * @param there are no parameters
     * @return there is no return
     */
    public Food()
    {
        //holds a random number value for the foodType variable 
        int foodType = Greenfoot.getRandomNumber(5);
        
        if( foodType == 0 ) 
        {
            setImage("apple1.png");
        } 
        else if( foodType == 1 ) 
        {
            setImage("bananas.png");
        } 
        else if( foodType == 2 ) 
        {
            setImage("cherries.png");
        }
        else if(foodType == 3) {
            setImage("grapes.png");
        }
        else
        {
            setImage("strawberry.png");
        }
    }   
}
