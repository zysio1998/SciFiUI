package ie.tudublin;

import processing.core.PApplet;




public class UI extends PApplet
{
    
    
	//PImage img;
	Orbits orbits;
	PlanetDisplay planetDisplay;
	Zooming zooming;

	
	
	

    //boolean[] keys = new boolean[1024];

    // public void keyPressed()
    // {
    //     keys[keyCode] = true;
    // }
    
    // public void keyReleased()
    // {
    //     keys[keyCode] = true;
    // }

    // public boolean checkKey(int c)
    // {
    //     return keys[c] || keys [Character.toUpperCase(c)];
    // }
    

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
		zooming = new Zooming(this,0,0,width,height);
		

		
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

		
		// line(0,50,1000,50);
		// line(0,100,1000,100);
		// line(0,150,1000,150);
		// line(0,200,1000,200);
		// line(0,250,1000,250);
		// line(0,300,1000,300);
		// line(0,350,1000,350);
		// line(0,400,1000,400);
		// line(0,450,1000,450);
		// line(0,550,1000,550);
		// line(0,500,1000,500);
		// line(0,650,1000,650);
		// line(0,600,1000,600);
		// line(0,750,1000,750);
		// line(0,700,1000,700);
		// line(0,850,1000,850);
		
		// line(50,0,50,1000);
		// line(100,0,100,1000);
		// line(150,0,150,1000);
		// line(200,0,200,1000);
		// line(250,0,250,1000);
		// line(300,0,300,1000);
		// line(350,0,350,1000);
		// line(400,0,400,1000);
		// line(450,0,450,1000);
		// line(500,0,500,1000);
		// line(550,0,550,1000);
		// line(600,0,600,1000);
		// line(650,0,650,1000);
		// line(700,0,700,1000);
		// line(750,0,750,1000);
		// line(800,0,800,1000);
		// line(850,0,850,1000);
		// line(900,0,900,1000);
		// line(950,0,950,1000);
		// line(1000,0,1000,1000);
		//ellipse(500,400,350,350);
		//fill(255,250,250);
		line(width/8,0,width/8,height);
		
		line(width/2,0,width/2,height);
		line(0,height/2,width,height/2);
		//stroke(255,250,250);
		
        

        // if (checkKey(LEFT))
        // {
        //     System.out.println("Left arrow key pressed");
        // }
    }
}

