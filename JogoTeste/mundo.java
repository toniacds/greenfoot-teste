import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("Backyardigans.mp3");
    
    public void started()
    {
      bgMusic.playLoop();
    }


    public void stopped()
    {
        bgMusic.pause();
    }

        
    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 720, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Uniqua uniqua = new Uniqua();
        addObject(uniqua,856,404);
        uniqua2 uniqua2 = new uniqua2();
        addObject(uniqua2,497,213);
        tasha tasha = new tasha();
        addObject(tasha,152,544);
        Fogo fogo = new Fogo();
        addObject(fogo,315,552);
        uniqua.setLocation(649,510);
        bola bola = new bola();
        addObject(bola,649,510);
        uniqua.setLocation(737,497);
        Counter counter = new Counter();
        addObject(counter,951,33);
        uniqua.setLocation(468,571);
        uniqua.setLocation(836,410);
        bola.setLocation(723,424);
        fogo.setLocation(328,558);
        tasha.setLocation(276,549);
        tasha.setLocation(116,525);
        fogo.setLocation(268,529);
        uniqua.setLocation(746,466);
        uniqua.setLocation(885,447);
        uniqua.setLocation(732,469);
        uniqua.setLocation(884,517);
        Counter counter2 = new Counter();
        addObject(counter2,88,44);
        counter.setLocation(962,31);
        removeObject(counter);
        Counter2 counter22 = new Counter2();
        addObject(counter22,920,36);
    }
}

