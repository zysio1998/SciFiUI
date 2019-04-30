package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Orbits extends PlanetObjects {

    private float MercuryAngle, VenusAngle, EarthAngle, MarsAngle, JupiterAngle, SaturnAngle, UranusAngle, NeptuneAngle;
    private PImage sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;    
    private float halfWidth;
    private float halfHeight;    

    public Orbits(PApplet ui, float x, float y, float width,float height)
     {
        super(ui, x, y, width,height);

        sun = ui.loadImage("images/sun.png"); // 100*100
        mercury = ui.loadImage("images/mercury.png"); // 20*20
        venus = ui.loadImage("images/venus.png"); // 35*35
        earth = ui.loadImage("images/earth.png"); // 35*35
        mars = ui.loadImage("images/mars.png"); // 25*25
        jupiter = ui.loadImage("images/jupiter.png"); // 70*70
        saturn = ui.loadImage("images/saturn.png"); // 55*55
        uranus = ui.loadImage("images/uranus.png"); // 35*35
        neptune = ui.loadImage("images/neptune.png"); // 35*35   
       
        halfWidth = width/2;
        halfHeight = height/2;
       
    }

    public void render() 
    {      
        ui.pushMatrix();
        ui.translate(halfWidth -50, halfHeight -50);
        ui.image(sun,0,0);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(MercuryAngle);
        ui.image(mercury,-55,-55);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(VenusAngle);
        ui.image(venus, 48, 48);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(EarthAngle);
        ui.image(earth,90,-90);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(MarsAngle);
        ui.image(mars,-114,114);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(JupiterAngle);
        ui.image(jupiter,-247,-35);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(SaturnAngle);
        ui.image(saturn,-27,-305);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(UranusAngle);
        ui.image(uranus,-17,310);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(NeptuneAngle);
        ui.image(neptune,-273,-273);
        ui.popMatrix();
    }

    public void update()
    {       
        MercuryAngle += 0.002; 
        VenusAngle += 0.003; 
        EarthAngle += 0.005;  
        MarsAngle += 0.007;  
        JupiterAngle += 0.005;
        SaturnAngle += 0.008;
        UranusAngle += 0.006;
        NeptuneAngle += 0.004;
    }
}
