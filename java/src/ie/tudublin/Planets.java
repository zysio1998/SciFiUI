package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Planets
{
    private float x;
    private float y;
    private float diameter;
    private PApplet ui;
	private PImage sun,mercury,venus,mars,jupiter,saturn,uranus,neptune;
	
	
    public Planets(PApplet ui,float x, float y, float diameter)
    {
        this.ui = ui;
		//this.earth = earth;
        this.x = x;
        this.y = y;
        this.diameter = diameter; 
		
       // sun = ui.loadImage("images/sun.png"); //140*140
       // mercury = ui.loadImage("images/mercury.png"); //20*20		
		//venus = ui.loadImage("images/venus.png"); //35*35		
		//earth = ui.loadImage("images/earth.png"); //35*35
		//mars = ui.loadImage("images/mars.png"); //25*25
		//jupiter = ui.loadImage("images/jupiter.png"); //70*70
		//saturn = ui.loadImage("images/saturn.png"); //55*55
		//uranus = ui.loadImage("images/uranus.png"); //35*35
		//neptune = ui.loadImage("images/neptune.png"); //35*35	

			// this is supposed have empy classes and metheods. use protected
    }    
	    
    public void render()
    {        
       // ui.image(sun,x - 50,y - 50);
		//ui.image(mercury,x -75 ,y -10);
		//ui.image(venus,x -115 ,y -17);
		//ui.image(earth,x -155 ,y -17);
		//ui.image(mars,x -185 ,y -12);		
       // ui.image(jupiter,x -260 ,y -35 );  
		//ui.image(saturn,x -320 ,y -27 );
		//ui.image(uranus,x -360 ,y -17 );
		//ui.image(neptune,x -400 ,y -17);		
    }	
}


