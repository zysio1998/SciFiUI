package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Orbits extends PlanetObjects
{
    private float angle = 0;
    private float radius;	   
	PImage earth;   	
    
    private PImage sun,mercury,venus,mars,jupiter,saturn,uranus,neptune;
	
    public Orbits(PApplet ui, float x,float y, float diameter)
    {
		super(ui,x,y,diameter);
		radius = diameter / 2;  //500
        // sun = ui.loadImage("images/sun.png"); //140*140
        // mercury = ui.loadImage("images/mercury.png"); //20*20		
		// venus = ui.loadImage("images/venus.png"); //35*35		
		earth = ui.loadImage("images/earth.png"); //35*35
		// mars = ui.loadImage("images/mars.png"); //25*25
		// jupiter = ui.loadImage("images/jupiter.png"); //70*70
		// saturn = ui.loadImage("images/saturn.png"); //55*55
		// uranus = ui.loadImage("images/uranus.png"); //35*35
		// neptune = ui.loadImage("images/neptune.png"); //35*35	
		
    }    

    public void render()
    {        
        ui.image(earth,x,y);
        // ui.image(sun,x - 50,y - 50);
		// ui.image(mercury,x -75 ,y -10);
		// ui.image(venus,x -115 ,y -17);
		// ui.image(earth,x -155 ,y -17);
		// ui.image(mars,x -185 ,y -12);		
        // ui.image(jupiter,x -260 ,y -35 );  
		// ui.image(saturn,x -320 ,y -27 );
		// ui.image(uranus,x -360 ,y -17 );
		// ui.image(neptune,x -400 ,y -17);			
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


