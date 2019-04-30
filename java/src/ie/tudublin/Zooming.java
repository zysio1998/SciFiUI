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
    private ArrayList<Info> infos = new ArrayList<Info>();    //store csv data array 

    private String csv[] = {"","","","","","","","","","",""};
    private String headers[] = {"Diameter of Planet: ","Mass of Planet: ","Population of Planet: ","Amount of Moons: ",
    "Time of Orbit around the Sun: ","Distance from the Sun: ","Temperature of Planet: ",
    "Gravitational force of Planet: ","Length of day on the Planet: "};  
    private String sundetails[] = {"","","","","","","","","",""};
    private String mercurydetails[] = {"","","","","","","","","",""};
    private String venusdetails[] = {"","","","","","","","","",""};
    private String earthdetails[] = {"","","","","","","","","",""};
    private String marsdetails[] = {"","","","","","","","","",""};
    private String jupiterdetails[] = {"","","","","","","","","",""};
    private String saturndetails[] = {"","","","","","","","","",""};
    private String uranusdetails[] = {"","","","","","","","","",""};
    private String neptunedetails[] = {"","","","","","","","","",""};    
     
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
    
public void render()
    {
        //buttons
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
        int rowNum = 0;
        float x = ((width/4) +50);
        float y = ((yrect*1.5f)+90);
        int gap = 0;

        if(a % 2 != 0)
        {
            boxes();  
            ui.image(sun,xrect*5,yrect*1.5f);       

            rowNum = 0; 
            for(int z = 0; z <10; z++ )
            { 
                sundetails[z] = csv[z];           
            }            
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(sundetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + sundetails[v+1],x,y + gap);
                gap = gap +40;
            }            
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
            boxes();
            ui.image(mercury,xrect*5,yrect*1.5f);

            rowNum = 1;            
            for(int z = 0; z <10; z++ )
            {            
                mercurydetails[z] = csv[z];                 
            }            
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(mercurydetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + mercurydetails[v+1],x,y + gap);
                gap = gap +40;
            }
            ui.textSize(15);

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
            boxes();
            ui.image(venus,xrect*5,yrect*1.5f);

            rowNum = 2;
            for(int z = 0; z <10; z++ )
            {
                venusdetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(venusdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + venusdetails[v+1],x,y + gap);
                gap = gap +40;
            }
            ui.textSize(15);

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
            boxes();
            ui.image(earth,xrect*5,yrect*1.5f);

            rowNum = 3;
            for(int z = 0; z <10; z++ )
            {
                earthdetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(earthdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + earthdetails[v+1],x,y + gap);
                gap = gap +40;
            }
            ui.textSize(15);

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
            boxes();
            ui.image(mars,xrect*5,yrect*1.5f);

            rowNum = 4;
            for(int z = 0; z <10; z++ )
            {
                marsdetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(marsdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + marsdetails[v+1],x,y + gap);
                gap = gap +40;
            }
            ui.textSize(15);

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
            boxes();
            ui.image(jupiter,xrect*5,yrect*1.5f);

            rowNum = 5;
            for(int z = 0; z <10; z++ )
            {
                jupiterdetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(jupiterdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + jupiterdetails[v+1],x,y + gap);
                gap = gap +40;
            }
            ui.textSize(15);

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
            boxes();
            ui.image(saturn,xrect*5,yrect*1.5f);

            rowNum = 6;
            for(int z = 0; z <10; z++ )
            {
                saturndetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(saturndetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + saturndetails[v+1],x,y + gap);
                gap = gap +40;
            }          
            ui.textSize(15);
            
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
            boxes();
            ui.image(uranus,xrect*5,yrect*1.5f);

            rowNum = 7;
            for(int z = 0; z <10; z++ )
            {
                uranusdetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(uranusdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + uranusdetails[v+1],x,y + gap);
                gap = gap +40;
            }           
            ui.textSize(15);

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
            
            boxes();
            ui.image(neptune,xrect*5,yrect*1.5f);

            rowNum = 8;
            for(int z = 0; z <10; z++ )
            {
                neptunedetails[z] = csv[z];            
            }
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(neptunedetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            for(int v = 0; v < 9; v++)
            {
                ui.text(headers[v] + neptunedetails[v+1],x,y + gap);
                gap = gap +40;
            }    
            ui.textSize(15);

            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            g = 0;
            h = 0;
        }
        
        Info info = infos.get(rowNum);  // loads each row of the CSV rowNum selects which one

        csv[0] = info.getPlanetName();
        csv[1] = info.getPlanetSize();
        csv[2] = info.getPlanetMass();
        csv[3] = info.getPlanetPopulation();
        csv[4] = info.getAmountOfMoons();
        csv[5] = info.getTimeOfOrbitAroundSun();
        csv[6] = info.getDistanceFromSun();
        csv[7] = info.getPlanetTemp();
        csv[8] = info.getGravity();
        csv[9] = info.getLengthOfDay();      
    }

    public void rectangles()
    {
        //draws rectangles aroung the stationary images in order to make buttons
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

    public void boxes()
    {
        ui.fill(0);
        ui.rect(xrect +70,yrect,1200,1600);
        ui.rect(xrect +150,yrect -90,1000,100);

        ui.noFill();
        ui.stroke(255);
        ui.rect(width/4,yrect*1.5f,500,500);
    }

}