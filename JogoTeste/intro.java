import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 440, 1); 
        prepare();
    }

    public void act(){
        //dialogo tairone
        if (Greenfoot.isKeyDown("a")){
            setBackground(new GreenfootImage("2.png"));
        }
        //dialogo austin
        if (Greenfoot.isKeyDown("s")){
            setBackground(new GreenfootImage("3.png"));
        }
        //iniciar jogo
        if (Greenfoot.isKeyDown("d")){
            mundo world = new mundo();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
