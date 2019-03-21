package ie.tudublin;

import processing.core.PApplet;

public class Ship
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    PApplet ui;

    public Ship(PApplet ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y +150 , diameter, diameter);
        ui.fill(255);
		ui.rect(0,550,800,550);
        
        
    }

    public void update()
    {
        x += dx;
        if ((x > ui.width - radius) || (x < radius))
        {
            dx *= -1;
        }
    }
}
