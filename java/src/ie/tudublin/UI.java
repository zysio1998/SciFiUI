package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet
{
    
    
	
	Orbits orbits;
	PlanetDisplay planetDisplay;
	Zooming zooming;

	
	
	

    
    

    public void settings()
    {
		
        //size(fullScreen(), P3D);
        // Use fullscreen instead of size to make your interface fullscreen
		fullScreen();
		
		
		
        		
    }

    public void setup()
    {	
	
		//b = new Button(this, 50, 50, 100, 50, "I am a button");
		orbits = new Orbits(this,0,0, width,height);
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
		line(width/8,0,width/8,height);
		
		line(width/2,0,width/2,height);
		line(0,height/2,width,height/2);
		


        
		
        

        
    }
}

