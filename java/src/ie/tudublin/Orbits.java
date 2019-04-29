package ie.tudublin;

import static processing.core.PConstants.SPHERE;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class Orbits extends PlanetObjects {

    private float MercuryAngle, VenusAngle, EarthAngle, MarsAngle, JupiterAngle, SaturnAngle, UranusAngle, NeptuneAngle;
    private PImage sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;
    private float radius;
    private PImage img;
    private PShape globe;
    private PShape globe2;
    private float halfWidth;
    private float halfHeight;
    private PImage[] textures = new PImage[8]; 

    public Orbits(PApplet ui, float x, float y, float width,float height) {
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

        img = ui.loadImage("images/sun.jpg");
        textures[0] = ui.loadImage("images/mercury.jpg");
        textures[1] = ui.loadImage("images/venus.jpg");
        textures[2] = ui.loadImage("images/earth.jpg");
        textures[3] = ui.loadImage("images/mars.jpg");
        textures[4] = ui.loadImage("images/jupiter.jpg");
        textures[5] = ui.loadImage("images/saturn.jpg");
        textures[6] = ui.loadImage("images/uranus.jpg");
        textures[7] = ui.loadImage("images/neptune.jpg");     
       
        halfWidth = width/2;
        halfHeight = height/2;

        
    }

    public void render() {

       //ui.translate(width/2, height/2, 0);
        // ui.pushMatrix();        
        // ui.translate(width/2, height/2, 0);
        // ui.noStroke();
        // ui.noFill();        
        // globe = ui.createShape(SPHERE, 50);
        // globe.setTexture(img); 
        // ui.popMatrix();

       // ui.translate(500,500, 0);
        // ui.pushMatrix();
        // ui.translate(750,300, 0);
        // ui.noStroke();
        // ui.noFill();        
        // globe2 = ui.createShape(SPHERE, 55);
        // globe2.setTexture(textures[0]); 
        // ui.popMatrix();

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
        ui.image(venus, -84, -84);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(EarthAngle);
        ui.image(earth,-110,-110);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(MarsAngle);
        ui.image(mars,-129,-129);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(JupiterAngle);
        ui.image(jupiter,-187,-187);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(SaturnAngle);
        ui.image(saturn,-225,-225);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(UranusAngle);
        ui.image(uranus,-248,-248);
        ui.popMatrix();

        ui.pushMatrix();
        ui.translate(halfWidth, halfHeight);
        ui.rotate(NeptuneAngle);
        ui.image(neptune,-273,-273);
        ui.popMatrix();

        

        System.out.println(width);
        System.out.println(height);

        
       
    }

    public void update()
    {       
        MercuryAngle += 0.01; 
        VenusAngle += 0.01; 
        EarthAngle += 0.01;  
        MarsAngle += 0.01;  
        JupiterAngle += 0.01;
        SaturnAngle += 0.01;
        UranusAngle += 0.01;
        NeptuneAngle += 0.01;

       // ui.shape(globe);
      //  ui.shape(globe2);

        
       
        
    }
}
   



