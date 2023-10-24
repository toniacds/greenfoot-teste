import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fogo extends Actor
{
    /**
     * Act - do whatever the Fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque(); 
        acertarAlvo();

    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians(getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x,y);

    }
    
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(Uniqua.class);
        
        if(b != null){
            
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
            
            getWorld().removeObject(b);
            getWorld().removeObject(this);
        }
    }
}