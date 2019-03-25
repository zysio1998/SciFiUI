package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
//import processing.core.PGraphics;

public class Sun
{
    private float x;
    private float y;
    private float diameter;
    PApplet ui;
    PImage sunny;

    

    

    public Sun(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
               
    }
    
    
    public void render()
    {
        
        ui.stroke(255,154,0);
        
        ui.ellipse(x, y , diameter, diameter);                           
    }

    // public void draw()
    // {
    //     sunny = loadImage("images/sun.jpg");
    //     image(sunny,400,400,50);
    // }

   
}


