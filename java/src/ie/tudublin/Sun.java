package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	PImage sun,mercury,venus,earth,mars,jupiter,saturn,uranus,neptune;
	
	
	
		
    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
        sun = ui.loadImage("images/sun.png"); //140*140
        mercury = ui.loadImage("images/mercury.png"); //20*20		
		venus = ui.loadImage("images/venus.png"); //35*35		
		earth = ui.loadImage("images/earth.png"); //35*35
		mars = ui.loadImage("images/mars.png"); //25*25
		jupiter = ui.loadImage("images/jupiter.png"); //70*70
		saturn = ui.loadImage("images/saturn.png"); //55*55
		uranus = ui.loadImage("images/uranus.png"); //35*35
		neptune = ui.loadImage("images/neptune.png"); //35*35
		
    }    
	
    
    public void render()
    {        
        ui.image(sun,x - 75,y - 70);
		ui.image(mercury,x -105 ,y -10);
		ui.image(venus,x -145 ,y -17);
		ui.image(earth,x -185 ,y -17);
		ui.image(mars,x -215 ,y -12);		
        ui.image(jupiter,x -290 ,y -35 );  
		ui.image(saturn,x -350 ,y -27 );
		ui.image(uranus,x -390 ,y -17 );
		ui.image(neptune,x -430 ,y -17);
		
		
		
		
    }
	
}


