package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Orbits extends PlanetObjects
{
    private float MercuryAngle,VenusAngle,EarthAngle,MarsAngle,JupiterAngle,SaturnAngle,UranusAngle,NeptuneAngle;   
    private PImage sun,mercury,venus,earth,mars,jupiter,saturn,uranus,neptune;
	
    public Orbits(PApplet ui, float x,float y, float diameter)
    {
		super(ui,x,y,diameter);
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
        ui.pushMatrix();
        ui.translate(50, 0);
        ui.image(sun,400,400);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(MercuryAngle);
        ui.image(mercury,-64,-64);          
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(500, 450);
        ui.rotate(VenusAngle); 
        ui.image(venus, -100, -100);       
        ui.popMatrix();  

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(EarthAngle);   
        ui.image(earth,-134,-134);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(MarsAngle);   
        ui.image(mars,-157,-157);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(JupiterAngle);   
        ui.image(jupiter,-220,-220);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(SaturnAngle);   
        ui.image(saturn,-263,-263);     
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(UranusAngle);   
        ui.image(uranus,-290,-290);    
        ui.popMatrix();

        ui.pushMatrix();  
        ui.translate(500, 450); 
        ui.rotate(NeptuneAngle);   
        ui.image(neptune,-322,-322);     
        ui.popMatrix();  	
    }

    public void update()
    {       
        MercuryAngle += 0.009; 
        VenusAngle += 0.005; 
        EarthAngle += 0.003;  
        MarsAngle += 0.008;  
        JupiterAngle += 0.002;
        SaturnAngle += 0.009;
        UranusAngle += 0.005;
        NeptuneAngle += 0.004;
    }
}
   



