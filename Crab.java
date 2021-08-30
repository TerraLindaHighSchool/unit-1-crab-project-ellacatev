import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
                move(-3);
         turnAtEdge();
         checkKeyPress();
         onCollision();

    }//This method repeats the following actions public void act()
    
    //Moves the Crab 
    
    //Turns the Crab at the edge 
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(-50);
        }
    }

    //Checks for user key presses so user can turn the Crab 
    private void checkKeyPress()
    {
        
    }
    //Checks for collisions with other objects 
    private void onCollision()
    {
    }
    }
    
    
    
    
    



