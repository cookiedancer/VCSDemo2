import greenfoot.*;

/**
 * Write a description of class map6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map6 extends World
{

    /**
     * Constructor for objects of class map6.
     * 
     */
    public map6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Map map = new Map("36.7857699, -76.101696", getWidth(), getHeight(), 10); 
        setBackground(map.getImage());
    }
}
