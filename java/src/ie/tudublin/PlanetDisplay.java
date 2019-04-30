package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class PlanetDisplay extends PlanetObjects
{
    private PImage sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;
    private float screenWidth;
    private float screenHeight;

    public PlanetDisplay(PApplet ui, float x, float y, float width,float height) 
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
       
        screenWidth = width/8; // divides the screen width by 8
        screenHeight = height/9; 
    }

    public void render()
    {           
        // load an image
        ui.image(sun,screenWidth - 50,(screenHeight) -20);
        ui.image(mercury,screenWidth - 10,(screenHeight * 2)+30);
        ui.image(venus,screenWidth - 17,(screenHeight * 3) -10);
        ui.image(earth,screenWidth - 17,(screenHeight * 4) -35);
        ui.image(mars,screenWidth - 12,(screenHeight * 5)- 60);
        ui.image(jupiter,screenWidth - 35,(screenHeight * 6) -90);
        ui.image(saturn,screenWidth - 27,(screenHeight * 7) -75);
        ui.image(uranus,screenWidth - 17,(screenHeight * 8) - 70);
        ui.image(neptune,screenWidth - 17,(screenHeight * 9) -90);
    }

    public void update()
    {

    }

}