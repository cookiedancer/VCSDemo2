import greenfoot.*;

/**
 * Write a description of class map2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map2 extends Actor
{
    Map map;
    public map2()
    {
        map = new Map("36.7857699, -76.101696");
        setImage(map.getImage());
    }
    
    
    /**
     * Act - do whatever the map2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        map.zoomOut(1);
        setImage(map.getImage());
    }    
}
