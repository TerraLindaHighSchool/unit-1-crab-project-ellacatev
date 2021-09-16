import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snow extends World
{

    /**
     * Constructor for objects of class snow.
     * 
     */
    public snow()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        fish fish = new fish();
        addObject(fish,201,162);
        polarbear polarbear = new polarbear();
        addObject(polarbear,478,206);
        seal seal = new seal();
        addObject(seal,326,67);
    }
}
