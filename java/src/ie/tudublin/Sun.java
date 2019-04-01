package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	PImage sun,mercury,venus,earth,mars,jupiter,saturn,uranus;
	
	
	
		
    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
        sun = ui.loadImage("images/sun.png"); //150*150
        mercury = ui.loadImage("images/mercury.png"); //25*25		
		venus = ui.loadImage("images/venus.png"); //40*40		
		earth = ui.loadImage("images/earth.png"); //40*40
		mars = ui.loadImage("images/mars.png"); //30*30
		jupiter = ui.loadImage("images/jupiter.png"); //75*75
		saturn = ui.loadImage("images/saturn.png"); //60*60
		uranus = ui.loadImage("images/uranus.png"); //40*40
		
    }    
	
    
    public void render()
    {        
        ui.image(sun,x - 75,y - 75);
		ui.image(mercury,x -110 ,y -12);
		ui.image(venus,x -155 ,y -20);
		ui.image(earth,x -200 ,y -20);
		ui.image(mars,x -235 ,y -15);		
        ui.image(jupiter,x -315 ,y -37 );  
		ui.image(saturn,x -380 ,y -30 );
		ui.image(uranus,x -425 ,y -20 );
		
		
		
		
    }
	
}


