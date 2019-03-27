package ie.tudublin;

import processing.core.PApplet;
//import processing.core.PImage;

public class Earth
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	
		
	
    public Earth(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
    }    
	
    
    public void render()
    {        
        ui.stroke(0,255,0);        
        ui.ellipse(x, y , diameter, diameter);   
		ui.fill(0,255,0);
		ui.ellipse(x, y , diameter - 5, diameter - 5); 		
    }

    
   
}


