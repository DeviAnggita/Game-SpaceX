
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Devi Anggita Ambarwati) 
 * @version (1.0)
 */
public class MyWorld extends World
{
    private int jeda=0;
    private int score;
    private int nyawa=3;
    private int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        tampilnyawa();
        tampilscore();
        showTime();
        time=1000;
        addObject(new Player(),250,550);
        prepare();
    }

    public void updatenyawa(int point)
    {
        nyawa=nyawa+point;
        tampilnyawa();
        
        if(nyawa ==0)
        {
            Greenfoot.stop();
            addObject(new kalah(),250,300);
        }
    }
   
    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa,400,25);
    }
    
    public void addScore (int points)
    {
        score=score+points;
        tampilscore();
    }
    
    private void tampilscore()
    {
        showText("Score :"+score,100,25); 
    }
    
    private void countTime()
    {
        time--;
        showTime();
        if(time==0)
        {
            Greenfoot.stop();
            addObject(new menang(),250,300);
        }
    }
    
    private void showTime()
    {
        showText("Waktu :"+time,250,25);
    }
    
    public void act()
    {
        //if(Greenfoot.getRandomNumber(100) < 3)
        //{
         //   addObject(new musuh(), Greenfoot.getRandomNumber(599), 500);
        //}
        countTime();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,253,516);
        laserbiru laserbiru = new laserbiru();
        addObject(laserbiru,141,54);
        laserbiru.setLocation(144,94);
        laserbiru.setLocation(165,68);
        musuh musuh = new musuh();
        addObject(musuh,165,68);
        musuh.setLocation(195,68);
        laserbiru.setLocation(150,105);
        musuh.setLocation(243,86);
        laserbiru laserbiru2 = new laserbiru();
        addObject(laserbiru2,243,86);
        musuh.setLocation(241,99);
        player.setLocation(199,517);
        laserbiru laserbiru3 = new laserbiru();
        addObject(laserbiru3,153,139);
        laserbiru3.setLocation(168,149);
        laserbiru laserbiru4 = new laserbiru();
        addObject(laserbiru4,207,162);
        laserbiru4.setLocation(223,198);
        laser laser = new laser();
        addObject(laser,281,430);
        laser.setLocation(217,503);
        player.setLocation(225,482);
        laser laser2 = new laser();
        addObject(laser2,118,493);
        laser2.setLocation(176,491);
        removeObject(laser);
        removeObject(laser2);
        player.setLocation(215,520);
        musuh.setLocation(164,64);
        removeObject(laserbiru2);
        removeObject(laserbiru4);
        removeObject(laserbiru3);
        removeObject(laserbiru);
        musuh.setLocation(183,48);
        musuh musuh2 = new musuh();
        addObject(musuh2,73,32);
        musuh2.setLocation(46,38);
        musuh musuh3 = new musuh();
        addObject(musuh3,97,65);
        musuh3.setLocation(117,53);
        musuh3.setLocation(83,117);
        musuh musuh4 = new musuh();
        addObject(musuh4,285,121);
        musuh4.setLocation(269,81);
        musuh musuh5 = new musuh();
        addObject(musuh5,366,134);
        musuh5.setLocation(364,46);
        musuh4.setLocation(305,130);
        musuh4.setLocation(276,107);
        player.setLocation(247,492);
        player.setLocation(245,489);
        player.setLocation(241,509);
        player.setLocation(239,496);
        removeObject(player);
        musuh5.setLocation(466,70);
        musuh4.setLocation(333,78);
        musuh.setLocation(212,54);
    }
}
