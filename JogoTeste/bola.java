import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    /**
     * Act - do whatever the Fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img1;
    public int temp = 20;
    public int Timer=50;
public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
public void moveAtaque()
    {
        double angle = Math.toRadians(getRotation());
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));        
        setLocation(x,y);

    }
     public void acertarAlvo(){
         Actor a = getOneIntersectingObject(tasha.class);        
    if(a != null){            
            Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter2.add(10);
            
            getWorld().removeObject(a);
            getWorld().removeObject(this);
            
            Timer=0;
             if (Timer<1){
        uniquawins world = new uniquawins();
        Greenfoot.setWorld(world);
    }   
        }
}
}