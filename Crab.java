import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        move(0);
        turnAtEdge();
        checkKeyPress();
        onCollision();
        getY();
        getX();

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
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX() +3,getY());
        }

        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX() -3,getY());
        }

        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(),getY() -3);
        }

        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(),getY() +3);
        }
    }
    //Checks for collisions with other objects 
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");

            // *** Winning the game *******************
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            // *****************************************

        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.playSound("slurp.wav");
        }
    }
}

    
    


