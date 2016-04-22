import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AsteroidLarge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsteroidLarge extends Rocks
{
    private int recreate; 
    public AsteroidLarge()
{    
    GreenfootImage image = getImage();  
    image.scale(100, 100);
    setImage(image);
}
    /**
     * Act - do whatever the AsteroidLarge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1); 
        turn((Greenfoot.getRandomNumber(3)-1));  
        if (isAtEdge()) 
        {
            recreate = Greenfoot.getRandomNumber(3);    
            if (recreate == 0)
        {
            AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
            AsteroidLarge.setRotation(getRotation()); 
            getWorld().addObject(AsteroidLarge, 1, 1);
        }
        else if (recreate == 1)
        {
            AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
            AsteroidLarge.setRotation(getRotation()); 
            getWorld().addObject(AsteroidLarge, 799, 1);
        }
        else if (recreate == 2)
        {
            AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
            AsteroidLarge.setRotation(getRotation()); 
            getWorld().addObject(AsteroidLarge, 1, 799);
        }
        else if (recreate == 3)
        {
            AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
            AsteroidLarge.setRotation(getRotation()); 
            getWorld().addObject(AsteroidLarge, 799, 799);
        }
            getWorld().removeObject(this);
        }
}
}
