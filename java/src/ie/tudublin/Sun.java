package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	PImage sunny;
		
    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
		sunny = ui.loadImage("images/sun.png");
    }    
	
    
    public void render()
    {        
        ui.image(sunny,x - 50,y - 50);
    }
	
}


