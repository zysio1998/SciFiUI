package ie.tudublin;

import processing.core.PApplet;
//import processing.core.PImage;

public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	//PImage sunny;
		
	
    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
    }    
	
    
    public void render()
    {        
        ui.stroke(255,0,0);        
        ui.ellipse(x, y , diameter, diameter);   
		ui.fill(255,0,0);
		//ui.ellipse(x, y , diameter - 5, diameter - 5); 
		//ui.image(sunny,50,50);		
    }

    
   
}


