package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{	
		Orbits orbits;
		PlanetDisplay planetDisplay;	
		Zooming zooming;	

		public void settings()
		{
			fullScreen();	
		}

    public void setup()
    {	
			orbits = new Orbits(this,0,0, width,height);  // creating an object with the same parameters
			planetDisplay = new PlanetDisplay(this,0,0,width,height);
			zooming = new Zooming(this,width,height);
		}

    public void draw()
    {
			background(0);

			orbits.render();	
			orbits.update();
			
			planetDisplay.render();

			zooming.rectangles();
			zooming.writing();			
			zooming.render();
			zooming.update();
			noStroke();
		}
}