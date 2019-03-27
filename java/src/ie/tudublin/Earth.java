package ie.tudublin;

import processing.core.PApplet;


public class Earth
{
    private float x1;
    private float y1;
    private float diameter1;
	private float radius;
	private float angle = 0;
    PApplet ui;
	
		
	
    public Earth(PApplet ui, float x1, float y1, float diameter1)
    {
        this.ui = ui;
        this.x1 = x1;
        this.y1 = y1;
        this.diameter1 = diameter1;  
		radius = diameter1 /2;		
    }    
	
    
    public void render()
    {        
        ui.stroke(0,255,0);        
        ui.ellipse(x1, y1 , diameter1, diameter1);  
		ui.fill(0,255,0);		
    }

    public void update()
    {
        angle += 0.01;
        x1 += ((radius-40) * (Math.cos(angle)));
        y1 += ((radius-40) * (Math.sin(angle)));      
		//System.out.println(radius);
		//System.out.println(angle);
    }
   
}


