package ie.tudublin;

import processing.core.PApplet;


public class Earth
{
    private float x;
    private float y;
    private float diameter;
	private float radius;
	private float angle = 0;
    PApplet ui;
	
		
	
    public Earth(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;  
		radius = diameter /2;		
    }    
	
    
    public void render()
    {        
        ui.stroke(0,255,0);        
        ui.ellipse(x, y , diameter, diameter);  
		ui.fill(255,0,0);		
    }

    public void update()
    {
        angle += 0.01;
        x += ((radius) * (Math.cos(angle)));
        y += ((radius) * (Math.sin(angle)));      
		//System.out.println(radius);
		//System.out.println(angle);
    }
   
    public void reset()
    {
        x = 400;
        y = 650;
    }
}


