import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class laser extends Actor
{
    public laser()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight=(int)myImage.getHeight()*1/10;
        int myNewWidth=(int)myImage.getWidth()*1/10;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(270);
    }
    
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void gerak()
    {
        setLocation(getX(),getY()-10);
        if(getY()<20){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena(){
        if(isTouching(musuh.class))
        {
            getWorld().addObject(new ledakan1(),getX(),getY());
            MyWorld m=(MyWorld)getWorld();
            
            /*Greenfoot.playSound("explosion.wav");*/
            removeTouching(musuh.class);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        gerak();
    }    
}
