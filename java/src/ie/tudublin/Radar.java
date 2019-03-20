package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    private float x;
    private float y;
    private float x1,y1;
    private float diameter;
    private float radius;
    private float angle = 0;
    PApplet ui;

    public Radar(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter /2;
        x1 = x;
        y1 = y;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y , diameter, diameter);
        ui.fill(255);
        ui.line(x,y,x1,y1);          
    }
    

    public void update()
    {
        angle += 0.01;
        x1 += (radius * (Math.cos(angle)));
        y1 += (radius * (Math.sin(angle)));        
    }

    public void reset()
    {
        x1 = x;
        y1 = y;
    }
}


