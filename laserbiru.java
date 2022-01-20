import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laserbiru here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class laserbiru extends Actor
{
    public laserbiru()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight=(int)myImage.getHeight()*1/2;
        int myNewWidth=(int)myImage.getWidth()*1/2;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(270);
    }
    
    private int nyawa;
    
    public void gerak()
    {
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
        
    public void cek_kena()
    {
        if(isTouching(Player.class))
        {
            getWorld().addObject(new ledakan(), getX(),getY());
            MyWorld w = (MyWorld)getWorld();
            /*w.updatenyawa(-1);*/
            getWorld().removeObject(this);
            /*Greenfoot.playSound("meledak.mp3");*/
        }
    }
    /**
     * Act - do whatever the laserbiru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        gerak();
    }    
}
