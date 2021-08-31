import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster is th enemy of the Crab 
 * 
 * @author Ella Velyvis 
 * @version 8/31/21
 */
public class Lobster extends Actor
{
    //This method repeats the following actions 
    public void act()
    {
        move(3);
        turnAtEdge();
    }
    
    //Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}
