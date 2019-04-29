package ie.tudublin;


import static processing.core.PConstants.SPHERE;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class Zooming extends PlanetObjects
{

    private float radius;
    private PImage img;
    private PShape globe;
    private PShape globe2;
    private PImage[] textures = new PImage[8];


    public Zooming(PApplet ui, float x, float y, float width,float height) 
    {
        super(ui, x, y, width,height);


        img = ui.loadImage("images/sun.jpg");
        textures[0] = ui.loadImage("images/mercury.jpg");
        textures[1] = ui.loadImage("images/venus.jpg");
        textures[2] = ui.loadImage("images/earth.jpg");
        textures[3] = ui.loadImage("images/mars.jpg");
        textures[4] = ui.loadImage("images/jupiter.jpg");
        textures[5] = ui.loadImage("images/saturn.jpg");
        textures[6] = ui.loadImage("images/uranus.jpg");
        textures[7] = ui.loadImage("images/neptune.jpg");  



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

        x = 50;
        y = 50;
    }

    public void render()
    {

        if(ui.mousePressed)
        {
            if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY < y + height)
            {
                System.out.println("pressed earth");
            }
        }
    }

    public void update()
    {
        
    }






    


}