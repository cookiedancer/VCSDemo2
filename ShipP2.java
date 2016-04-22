import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipP2 extends Actor
{
    /**
     * Act - do whatever the ShipP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ShipP2()
    {    
        GreenfootImage image = getImage();  
        image.scale(50, 30);
        setImage(image);
    }
    private int ammoP2;
    private int asteroidCounterP2;
    public void act() 
    {
        move(2);
        loot();
        ammoP2=(ammoP2+1);
        asteroidCounterP2=(asteroidCounterP2+1);
       if (Greenfoot.isKeyDown("left"))
    {
        turn(-3);
    }
       if (Greenfoot.isKeyDown("right"))
    {
        turn(3);
    }
       if(Greenfoot.isKeyDown("up"))
    {
       if (ammoP2>=25)
        {
        BulletP2 BulletP2 = new BulletP2();  
        BulletP2.setRotation(getRotation());  
        getWorld().addObject(BulletP2, getX(), getY());
        ammoP2=0;
        }
    }
    if (asteroidCounterP2>=100)
    {
        if (Greenfoot.getRandomNumber(3) == 0)
    {
        asteroidCounterP2=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 1, 1);
    }
        else if (Greenfoot.getRandomNumber(3) == 1)
    {
        asteroidCounterP2=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 799, 1);
    }
        else if (Greenfoot.getRandomNumber(3) == 2)
    {
        asteroidCounterP2=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 1, 799);
    }
        else if (Greenfoot.getRandomNumber(3) == 3)
    {
        asteroidCounterP2=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 799, 799);
    }

    }  
}
public void loot()
{
           if (isTouching(Gold.class))
    {
        removeTouching(Gold.class);
    }
}
}
