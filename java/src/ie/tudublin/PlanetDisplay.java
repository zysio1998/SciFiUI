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
       
        screenWidth = width/8;
        screenHeight = height/8;

    }

    public void render()
    {


    }


    public void update()
    {

    }



}