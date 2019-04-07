package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;


public class Orbits extends PlanetObjects
{
    private float MercuryAngle;
    private float angle;
    private float VenusAngle;
	PImage earth;   	
    
    private PImage sun,mercury,venus,mars,jupiter,saturn,uranus,neptune;
	
    public Orbits(PApplet ui, float x,float y, float diameter)
    {
		super(ui,x,y,diameter);
        sun = ui.loadImage("images/sun.png"); //140*140
        mercury = ui.loadImage("images/mercury.png"); //20*20		
		venus = ui.loadImage("images/venus.png"); //35*35		
		earth = ui.loadImage("images/earth.png"); //35*35
		// mars = ui.loadImage("images/mars.png"); //25*25
		// jupiter = ui.loadImage("images/jupiter.png"); //70*70
		// saturn = ui.loadImage("images/saturn.png"); //55*55
		// uranus = ui.loadImage("images/uranus.png"); //35*35
		// neptune = ui.loadImage("images/neptune.png"); //35*35	
		
    }    

    public void render()
    {        
        ui.pushMatrix();
        ui.translate(50, 0);
        ui.image(sun,400,400);
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(angle);   
        ui.image(earth,-150,-150);     
        ui.popMatrix();


        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(MercuryAngle);
        ui.image(mercury,-100,-100);          
        ui.popMatrix();


        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(VenusAngle); 
        ui.image(venus, -250, -250);       
        ui.popMatrix();  

           
		
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
      
        angle += 0.001;  //0.003
        MercuryAngle += 0.009;  //0.003 
        VenusAngle += 0.005;  //0.003
        
    }
}
   



