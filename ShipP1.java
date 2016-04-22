import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShipP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipP1 extends Actor
{
    private int ammoP1;
    public int asteroidCounterP1;
    /**
     * Act - do whatever the ShipP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ShipP1()
    {    
        GreenfootImage image = getImage();  
        image.scale(50, 30);
        setImage(image);
    }

    public void act() 
    {
        move(2);
        loot();
        ammoP1=(ammoP1+1);
        asteroidCounterP1=(asteroidCounterP1+1);
       if (Greenfoot.isKeyDown("a"))
    {
        turn(-3);
    }
       if (Greenfoot.isKeyDown("d"))
    {
        turn(3);
    }
      if(Greenfoot.isKeyDown("w"))
    {
        if (ammoP1>=25)
        {
        BulletP1 BulletP1 = new BulletP1(); 
        BulletP1.setRotation(getRotation());  
        getWorld().addObject(BulletP1, getX(), getY());
        ammoP1=0;
        }
    }
    
    if (asteroidCounterP1>=150)
    {
        if (Greenfoot.getRandomNumber(3) == 0)
    {
        asteroidCounterP1=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 1, 1);
    }
        else if (Greenfoot.getRandomNumber(3) == 1)
    {
        asteroidCounterP1=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 799, 1);
    }
        else if (Greenfoot.getRandomNumber(3) == 2)
    {
        asteroidCounterP1=0;
        AsteroidLarge AsteroidLarge = new AsteroidLarge(); 
        AsteroidLarge.setRotation(getRotation()); 
        getWorld().addObject(AsteroidLarge, 1, 799);
    }
        else if (Greenfoot.getRandomNumber(3) == 3)
    {
        asteroidCounterP1=0;
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
