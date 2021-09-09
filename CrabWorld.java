import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Lobster lobster = new Lobster();
        addObject(lobster,243,190);
        Crab crab = new Crab();
        addObject(crab,412,166);
        Worm worm = new Worm();
        addObject(worm,194,326);
        Worm worm2 = new Worm();
        addObject(worm2,429,444);
        Worm worm3 = new Worm();
        addObject(worm3,82,85);
        Worm worm4 = new Worm();
        addObject(worm4,404,80);
    }
}
    