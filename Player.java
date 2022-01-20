import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Player()
    {
        setRotation(270);
    }
    
    public int tahan=10;
    private int jeda=0;
    private int nyawa;
    
    public void tombol()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
        }
        if (tahan==0){
            if(Greenfoot.isKeyDown("Space"))
            {
                getWorld().addObject(new laser(),getX(),getY());
                /*Greenfoot.playSound("bullet.wav");*/
            }
            tahan=10;
        }
    }
        
        public void act() 
        {
            tahan--;
            tombol();
            if(jeda>0)jeda--;
            if(jeda==1)
            if(jeda==0)jeda=20;
        } 
    }

