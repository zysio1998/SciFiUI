package ie.tudublin;


//import static processing.core.PConstants.SPHERE;

import processing.core.PApplet;
import processing.core.PImage;
//import processing.core.PShape;

public class Zooming extends PlanetObjects
{

    //private float radius;
    private PImage sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;
    
    //private PShape globe;
    //private PShape globe2;
    //private PImage[] textures = new PImage[8];

    private float xrect;
    private float yrect;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    


    public Zooming(PApplet ui, float x, float y, float width,float height) 
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
        // textures[0] = ui.loadImage("images/mercury.jpg");
        // textures[1] = ui.loadImage("images/venus.jpg");
        // textures[2] = ui.loadImage("images/earth.jpg");
        // textures[3] = ui.loadImage("images/mars.jpg");
        // textures[4] = ui.loadImage("images/jupiter.jpg");
        // textures[5] = ui.loadImage("images/saturn.jpg");
        // textures[6] = ui.loadImage("images/uranus.jpg");
        // textures[7] = ui.loadImage("images/neptune.jpg");  

        xrect = width/8;
        yrect = height/9;

    

        
        
    }

    public void render()
    {

        if(ui.mousePressed)
        {
            if(ui.mouseX > xrect-50 && ui.mouseX < xrect +50 && ui.mouseY > yrect -20 && ui.mouseY < yrect +80)
            {
                System.out.println("hello");
                ui.delay(100); 
                a++;
            }         
            else if(ui.mouseX > xrect-10 && ui.mouseX < xrect +10 && ui.mouseY > (yrect*2) +30 && ui.mouseY < (yrect*2) +50) 
            {
                ui.delay(100); 
                b++;
            } 
            else if(ui.mouseX > xrect-17 && ui.mouseX < xrect +18 && ui.mouseY > (yrect*3) -10 && ui.mouseY < (yrect*3) +25) 
            {
                ui.delay(100); 
                c++;
            } 
            else if(ui.mouseX > xrect-17 && ui.mouseX < xrect +18 && ui.mouseY > (yrect*4) -35 && ui.mouseY < (yrect*4)) 
            {
                ui.delay(100); 
                d++;
            } 
            else if(ui.mouseX > xrect-12 && ui.mouseX < xrect +13 && ui.mouseY > (yrect*5) -60 && ui.mouseY < (yrect*5) -35) 
            {
                ui.delay(100); 
                e++;
            } 
            else if(ui.mouseX > xrect-35 && ui.mouseX < xrect +35 && ui.mouseY > (yrect*6) -90 && ui.mouseY < (yrect*6) -20) 
            {
                ui.delay(100); 
                f++;
            } 
            else if(ui.mouseX > xrect-27 && ui.mouseX < xrect +28 && ui.mouseY > (yrect*7) -75 && ui.mouseY < (yrect*7) -20) 
            {
                ui.delay(100); 
                g++;
            } 
            else if(ui.mouseX > xrect-17 && ui.mouseX < xrect +18 && ui.mouseY > (yrect*8) -70 && ui.mouseY < (yrect*8) -35) 
            {
                ui.delay(100); 
                h++;
            } 
            else if(ui.mouseX > xrect-17 && ui.mouseX < xrect +18 && ui.mouseY > (yrect*9) -90 && ui.mouseY < (yrect*9) -55) 
            {
                ui.delay(100); 
                i++;
            } 



        }    

    }

    public void update()
    {
        if(a % 2 != 0)
        {
            ui.image(sun,xrect +200,yrect);
        }
        else if(b % 2 != 0)
        {
            ui.image(mercury,xrect +200,yrect -50);
        }
        else if(c % 2 != 0)
        {
            ui.image(venus,xrect +300,yrect -150);
        }
        else if(d % 2 != 0)
        {
            ui.image(earth,xrect +500,yrect -50);
        }
        else if(e % 2 != 0)
        {
            ui.image(mars,xrect +600,yrect -50);
        }
        else if(f % 2 != 0)
        {
            ui.image(jupiter,xrect +700,yrect -50);
        }
        else if(g % 2 != 0)
        {
            ui.image(saturn,xrect +500,yrect -150);
        } 
        else if(h % 2 != 0)
        {
            ui.image(uranus,xrect +600,yrect -150);
        }
        else if(i % 2 != 0)
        {
            ui.image(neptune,xrect +700,yrect -150);
        }

    }

    public void rectangles()
    {
        ui.noFill();
        ui.rect(xrect -50, yrect-20, 100, 100);
        ui.rect(xrect -10, (yrect*2)+30, 20, 20);
        ui.rect(xrect -17, (yrect*3)-10, 35, 35);
        ui.rect(xrect -17, (yrect*4)-35, 35, 35);
        ui.rect(xrect -12, (yrect*5)-60, 25, 25);
        ui.rect(xrect -35, (yrect*6)-90, 70, 70);
        ui.rect(xrect -27, (yrect*7)-75, 55, 55);
        ui.rect(xrect -17, (yrect*8)-70, 35, 35);
        ui.rect(xrect -17, (yrect*9)-90, 35, 35);

        //ui.stroke(255,250,250);

        ui.noStroke();
    }

    public void arek()
    {
        //ui.translate( 800,800,0);
        // ui.noStroke();
        // ui.noFill();        
        // globe = ui.createShape(SPHERE, 200);
        // globe.setTexture(img);

        

    }






    


}