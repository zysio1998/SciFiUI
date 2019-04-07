package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    PImage img;
	Orbits orbits;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()    
	{	
		size(1000, 900);
        //Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
        img = loadImage("images/background.jpg");    		
    }

    public void setup()
    {	
		b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
		orbits = new Orbits(this, 400, 650, width);
	}

    public void draw()
    {
        background(img);
        //b.render();
        //b.mouseClicked();

        //mc.update();
        //mc.render();
        
        //planets.render();	
		
	    orbits.update();
		orbits.render();		
		//orbits.reset();	
		
		
		line(0,450,1000,450);
		line(500,0,500,1000);
		//ellipse(500,400,350,350);
		//fill(255,250,250);
		stroke(255,250,250);
		
        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

