import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan1 here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class ledakan1 extends Actor
{
     public ledakan1()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight=(int)myImage.getHeight()*1/9;
        int myNewWidth=(int)myImage.getWidth()*1/9;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(270);
    }
    
    private int jeda=10;
    /**
     * Act - do whatever the ledakan1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (jeda>0)jeda--;
        else getWorld().removeObject(this);
    }    
}
