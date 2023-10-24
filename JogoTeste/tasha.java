import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tasha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tasha extends Actor
{
    GreenfootSound efeito = new GreenfootSound("efeito.mp3");
    
    private int sTimer = 0;
    /**
     * Act - do whatever the tasha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
           public void act(){
        movimento();
    }

     public void movimento(){
     int speed = 3;
    if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    else if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
        sTimer ++;
        efeito.play();
        getWorld().addObject(new Fogo(), getX() - 100, getY() + 30);
    }
    
    else{
        if(!Greenfoot.isKeyDown("f")){
            sTimer = 0;
        }
    }
}    
}


    
