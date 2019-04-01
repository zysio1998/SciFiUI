package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Orbits
{
    private float x;
    private float y;
    //private float diameter;
	private float angle = 0;
    PApplet ui;
	PImage earth;
	private float radius;
	
		
	
    public Orbits(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
       // this.diameter = diameter;   //1000
		radius = diameter / 2;  //500
		earth = ui.loadImage("images/earth.png");	//40*40	
    }    
	
    
    public void render()
    {        
        ui.image(earth,x,y);		
    }

    public void update()
    {
        angle += 0.008;  //0.003
        x += ((radius -365) * (Math.cos(angle)));  //500 - 365 = 135 away from middle
        y += ((radius -365) * (Math.sin(angle))); 
    }
   
	public void reset()
	{
       x = 480;  // defines the origin of the cirlce minus the size of the circle itself
       y = 430;
	}
}


