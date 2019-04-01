package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Radar r;
	Ship s;
    PImage img;
    Sun sun;
	Earth earth;

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
		size(1000, 800);
        //Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
        img = loadImage("images/background3.jpg");    
		//sun.sunny = loadImage("images/sun.png");		
    }

    public void setup()
    {	
		b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        r = new Radar(this, width / 2, height / 2, 200);
        s = new Ship(this, width / 2, height / 2, 80);
        sun = new Sun(this, width / 2, height / 2, 150);
		earth = new Earth(this, 400, 650, 75);
    }

    public void draw()
    {
        background(img);
        //b.render();
        //b.mouseClicked();

        //mc.update();
        //mc.render();

        //r.update();
        //r.render();
        //r.reset();
		
		//s.update();
        //s.render();
        
        sun.render();		
		
		earth.update();
		earth.render();
		earth.reset();
		
		line(0,400,1000,400);
		line(500,0,500,800);
		//ellipse(500,400,300,300);
		//fill(255,250,250);
		stroke(255,250,250);
		
		
		
        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

