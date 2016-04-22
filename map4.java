import greenfoot.*;

/**
 * Write a description of class map4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map4 extends World
{

    /**
     * Constructor for objects of class map4.
     * 
     */
    public map4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Map map = new Map("36.7857699, -76.101696", getWidth(), getHeight(), 12); 
        setBackground(map.getImage());
    }
}
