import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class musuh extends Actor
{
    public musuh()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight=(int)myImage.getHeight()*1/4;
        int myNewWidth=(int)myImage.getWidth()*1/4;
        myImage.scale(myNewWidth,myNewHeight);
        setRotation(270);
    }
    
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int tahan=30;
    private int jeda=0;
    
    public void gerak()
    {
        setLocation(getX(),getY()+1);
        if(getY()>500){
            //Penggunaan random number
            setLocation(Greenfoot.getRandomNumber(500),
            Greenfoot.getRandomNumber(50));
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        gerak();
        if(tahan==0){
         tahan=30;
        }
        if(jeda>0)jeda--;
        if(jeda==1) getWorld().addObject(new laserbiru(),getX(),getY()+50);
        if(jeda==0)jeda=120;
    }    
    
    
}
