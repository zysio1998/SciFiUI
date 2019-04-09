package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
//import processing.core.PShape;

public class Orbits extends PlanetObjects
{
    
    private float MercuryAngle, VenusAngle, EarthAngle, MarsAngle, JupiterAngle, SaturnAngle, UranusAngle, NeptuneAngle;
    private PImage sun,mercury,venus,earth,mars,jupiter,saturn,uranus,neptune;
    
   
   // PShape globe;

    public Orbits(PApplet ui, float x,float y, float diameter)
    {
		super(ui,x,y,diameter);
        sun = ui.loadImage("images/sun.png"); //100*100
        mercury = ui.loadImage("images/mercury.png"); //20*20		
		venus = ui.loadImage("images/venus.png"); //35*35		
		earth = ui.loadImage("images/earth.png"); //35*35
		mars = ui.loadImage("images/mars.png"); //25*25
		jupiter = ui.loadImage("images/jupiter.png"); //70*70
		saturn = ui.loadImage("images/saturn.png"); //55*55
		uranus = ui.loadImage("images/uranus.png"); //35*35
        neptune = ui.loadImage("images/neptune.png"); //35*35	
        
        

        
        
        // ui.noStroke();
        // ui.noFill();
		// globe = ui.createShape(ui.SPHERE,50);
		// globe.setTexture(jupiterTexture);
        

        
    }    

    public void render()
    {        
        ui.pushMatrix();
        ui.translate(50, 0);
        ui.image(sun,400,400);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(MercuryAngle);
        ui.image(mercury,-10,-90);          
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(VenusAngle); 
        ui.image(venus, 65, 65);       
        ui.popMatrix();  

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(EarthAngle);   
        ui.image(earth,110,-110);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(MarsAngle);   
        ui.image(mars,-142,142);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(JupiterAngle);   
        ui.image(jupiter,220,-35);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(SaturnAngle);   
        ui.image(saturn,-27,305);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(UranusAngle);   
        ui.image(uranus,-405,-17);    
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(NeptuneAngle);   
        ui.image(neptune,-323,-323);     
        ui.popMatrix();  	

        
    }

    public void update()
    {       
        MercuryAngle += 0.003; 
        VenusAngle += 0.005; 
        EarthAngle += 0.006;  
        MarsAngle += 0.002;  
        JupiterAngle += 0.004;
        SaturnAngle += 0.008;
        UranusAngle += 0.002;
        NeptuneAngle += 0.005;
       // ui.shape(globe);
        
        
    }
}
   



