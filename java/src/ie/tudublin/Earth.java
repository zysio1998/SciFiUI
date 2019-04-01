package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Earth
{
    private float x;
    private float y;
    private float diameter;
	private float angle = 0;
    PApplet ui;
	PImage earth;
	
		
	
    public Earth(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;  
		earth = ui.loadImage("images/earth.png");		
    }    
	
    
    public void render()
    {        
        ui.image(earth,x,y);		
    }

    public void update()
    {
        angle += 0.005;
        x += ((diameter +80) * (Math.cos(angle)));
        y += ((diameter +80) * (Math.sin(angle)));      
    }
   
	public void reset()
	{
       x = 460;
       y = 370;
	}
}


