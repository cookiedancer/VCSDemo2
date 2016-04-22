import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AsteroidSmall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsteroidSmall2 extends Rocks
{
    /**
     * Act - do whatever the AsteroidSmall2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AsteroidSmall2()
{    
    GreenfootImage image = getImage();  
    image.scale(30, 30);
    setImage(image);
}
    public void act() 
    {
        move(2);
        if (isTouching(ShipP1.class))
    {
        removeTouching(ShipP1.class);
    }
           if (isTouching(ShipP2.class))
    {
        removeTouching(ShipP2.class);
    }
        if (isAtEdge())
    {
        getWorld().removeObject(this);  
    }
    }    
}
