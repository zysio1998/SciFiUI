package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PGraphics;

public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
    PImage sun;

    

    

    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
               
    }
    
    
    public void render()
    {
        sun = loadImage("images/sun.jpg");
        ui.stroke(255,154,0);
        //ui.fill(sun);
        ui.ellipse(sun(x, y , diameter, diameter), diameter, diameter, diameter);
    }

    private float sun(float x2, float y2, float diameter2, float diameter3) {
        return 0;
    }

    private PImage loadImage(String string) {
        return null;
    }
}


