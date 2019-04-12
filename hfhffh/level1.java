import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
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
        turtle turtle = new turtle();
        addObject(turtle,84,194);
        banana banana = new banana();
        addObject(banana,479,88);
        banana banana2 = new banana();
        addObject(banana2,309,240);
        banana banana3 = new banana();
        addObject(banana3,467,349);
        bola bola = new bola();
        addObject(bola,193,32);
        bola bola2 = new bola();
        addObject(bola2,479,18);
        score score = new score();
        addObject(score,285,18);
        bola.setLocation(191,46);
        bola.setRotation(90);
        bola2.setRotation(90);
    }
}
