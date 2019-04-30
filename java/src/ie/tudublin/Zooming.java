package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.TableRow;
import processing.data.Table;

public class Zooming extends Info
{
    protected float width;
    protected float height;
    protected PApplet ui;
    private PImage sun, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune;   
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
    private ArrayList<Info> infos = new ArrayList<Info>();    

  
    private String sundetails[] = {"","","","","","","","","",""};
    private String sunmass;
    
     
    public Zooming(PApplet ui, float width,float height) 
    {
        this.ui = ui;
        this.width = width; 
        this.height = height;

        sun = ui.loadImage("images/sun2.png"); // 100*100
        mercury = ui.loadImage("images/mercury2.png"); // 20*20
        venus = ui.loadImage("images/venus2.png"); // 35*35
        earth = ui.loadImage("images/earth2.png"); // 35*35
        mars = ui.loadImage("images/mars2.png"); // 25*25
        jupiter = ui.loadImage("images/jupiter2.png"); // 70*70
        saturn = ui.loadImage("images/saturn2.png"); // 55*55
        uranus = ui.loadImage("images/uranus2.png"); // 35*35
        neptune = ui.loadImage("images/neptune2.png"); // 35*35       

        xrect = width/8;
        yrect = height/9;  

        loadData();
        //printStars();
    }

    public void loadData()
    {
        Table table = ui.loadTable("Planets.csv", "header");
        
        for (TableRow row : table.rows()) 
        {
            Info info = new Info(row);
            infos.add(info);      
        }
    }

    // public void printStars() 
    // {
    //     Info Sunn = infos.get(0);      
    //     //System.out.println(info);
    //     sunname = Sunn.getPlanetName();
    //     sunmass = Sunn.getPlanetMass();


        
        
    // }

    public void render()
    {

        if(ui.mousePressed)
        {
            if(ui.mouseX > xrect-50 && ui.mouseX < xrect +50 && ui.mouseY > yrect -20 && ui.mouseY < yrect +80)
            {
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
           
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(sun,xrect*5,yrect*1.5f);

            Info Sunn = infos.get(1);  
            
            
            
            sundetails[0] = Sunn.getPlanetName();
            sundetails[1] = Sunn.getPlanetSize();
            sundetails[2] = Sunn.getPlanetMass();
            sundetails[3] = Sunn.getPlanetPopulation();
            sundetails[4] = Sunn.getAmountOfMoons();
            sundetails[5] = Sunn.getTimeOfOrbitAroundSun();
            sundetails[6] = Sunn.getDistanceFromSun();
            sundetails[7] = Sunn.getPlanetTemp();
            sundetails[8] = Sunn.getGravity();
            sundetails[9] = Sunn.getLengthOfDay();

            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.text(sundetails[0],xrect+50,yrect - 45);
            ui.text(sundetails[1],xrect+50,yrect - 50);
            ui.text(sundetails[2],xrect+50,yrect - 60);
            ui.text(sundetails[3],xrect+100,yrect - 50);
            ui.text(sundetails[4],xrect+100,yrect - 20);
            ui.text(sundetails[5],xrect+100,yrect - 30);
            ui.text(sundetails[6],xrect+100,yrect - 40);
            ui.text(sundetails[7],xrect+100,yrect - 10);
            ui.text(sundetails[8],xrect+150,yrect - 50);
            ui.text(sundetails[9],xrect+150,yrect - 60);

            ui.textSize(15);


            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(b % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(mercury,xrect*5,yrect*1.5f);
            a = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(c % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(venus,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(d % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(earth,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(e % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(mars,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            f = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(f % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(jupiter,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            g = 0;
            h = 0;
            i = 0;
        }
        else if(g % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(saturn,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            h = 0;
            i = 0;
        } 
        else if(h % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(uranus,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            i = 0;
        }
        else if(i % 2 != 0)
        {
            ui.fill(0);
            ui.rect(xrect +70,yrect,1000,1600);
            ui.image(neptune,xrect*5,yrect*1.5f);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
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
        ui.noStroke();
    }

    public void writing()
    {
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("Click a planet for more Information",xrect,yrect - 45);
        ui.textSize(15);
    }

    

    

          


    
    


}