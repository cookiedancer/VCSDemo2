import greenfoot.*;

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(4);
       if (Greenfoot.isKeyDown("left"))
       {
           turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }    
    public boolean atWorldEdge() {
    if(getX() < 20 || getX() > getWorld().getWidth() - 20) {
        return true;
    }
    if(getY() < 20 || getY() > getWorld().getHeight() - 20) {
        return true;
    }
    else {
        return false;
    }
}
}
