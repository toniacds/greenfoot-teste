import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class uniqua2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class uniqua2 extends Actor
{
    
    GifImage mygif = new GifImage("uniqua.gif");
    /**
     * Act - do whatever the uniqua2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mygif.getCurrentImage());
    }
}
