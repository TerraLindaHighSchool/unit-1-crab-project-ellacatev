import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * polarbear is th enemy of the seal
 * 
 * @author Ella Velyvis 
 * @version 8/31/21
 */
public class polarbear extends Actor
{
    //This method repeats the following actions 
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    
    //Turns the seal at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}

