import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uniqua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uniqua extends Actor
{
    /**
     * Act - do whatever the Uniqua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act(){
        movimento();
    }

     public void movimento(){
     int speed = 5;
     GreenfootSound efeito = new GreenfootSound("efeito.mp3");
    int sTimer = 0;
    if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    else if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("p") && (sTimer == 0)){
        sTimer ++;
        efeito.play();
        getWorld().addObject(new bola(), getX() - 100, getY() + 30);
    }
    
    else{
        if(!Greenfoot.isKeyDown("p")){
            sTimer = 0;
        }
    }
}
}
