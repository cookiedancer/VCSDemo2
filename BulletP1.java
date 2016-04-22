import greenfoot.*;

/**
 * Write a description of class BulletP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletP1 extends Actor
{
    /**
     * Act - do whatever the BulletP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BulletP1()
    {    
        GreenfootImage image = getImage();  
        image.scale(20, 20);
        setImage(image);
    }
    public void act() 
    {
        move(5);
        impact();
    }    
        public void impact()
    {
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else if (isTouching(ShipP2.class))
        {
            getWorld().removeObject(this);
        }
                else if (isTouching(AsteroidLarge.class))
        {
            Gold Gold = new Gold(); 
            getWorld().addObject(Gold, getX(), getY());
            AsteroidSmall AsteroidSmall = new AsteroidSmall();  
            AsteroidSmall.setRotation(getRotation()+45);  
            getWorld().addObject(AsteroidSmall, getX(), getY());
            AsteroidSmall1 AsteroidSmall1 = new AsteroidSmall1();  
            AsteroidSmall1.setRotation(getRotation()-45);  
            getWorld().addObject(AsteroidSmall1, getX(), getY());
            AsteroidSmall2 AsteroidSmall2 = new AsteroidSmall2();  
            AsteroidSmall2.setRotation(getRotation()+135);  
            getWorld().addObject(AsteroidSmall2, getX(), getY());
            AsteroidSmall3 AsteroidSmall3 = new AsteroidSmall3();  
            AsteroidSmall3.setRotation(getRotation()-135);  
            getWorld().addObject(AsteroidSmall3, getX(), getY());
            removeTouching(AsteroidLarge.class);
            getWorld().removeObject(this);
        }
                else if (isTouching(AsteroidSmall.class))
        {
            removeTouching(AsteroidSmall.class);
            getWorld().removeObject(this);
        }
                else if (isTouching(AsteroidSmall1.class))
        {
            removeTouching(AsteroidSmall1.class);
            getWorld().removeObject(this);
        }
                else if (isTouching(AsteroidSmall2.class))
        {
            removeTouching(AsteroidSmall2.class);
            getWorld().removeObject(this);
        }
                else if (isTouching(AsteroidSmall3.class))
        {
            removeTouching(AsteroidSmall3.class);
            getWorld().removeObject(this);
        }
    }
}
