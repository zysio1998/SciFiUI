package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
	PImage sunny,jupiter,mars,venus,mercury;
	
	PImage earth;
	
		
    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;     
        sunny = ui.loadImage("images/sunny.png"); //150*150
        jupiter = ui.loadImage("images/jupiter.png"); //75*75
		mars = ui.loadImage("images/mars.png"); //30*30
		venus = ui.loadImage("images/venus.png"); //40*40
		mercury = ui.loadImage("images/mercury.png"); //25*25
		earth = ui.loadImage("images/earth.png"); //40*40
		
    }    
	
    
    public void render()
    {        
        ui.image(sunny,x - 75,y - 75);
        ui.image(jupiter,x -330 ,y -37 );  
		ui.image(mars,x -250 ,y -15);
		ui.image(venus,x -170 ,y -20);
		ui.image(mercury,x -125 ,y -12);
		ui.image(earth,x -215 ,y -20);
    }
	
}


