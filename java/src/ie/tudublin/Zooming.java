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
            boxes();  
            ui.image(sun,xrect*5,yrect*1.5f);       
            
            //ui.rect(width/4,yrect*1.5f,500,500);

            Info Sunn = infos.get(0);        
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
            ui.textSize(25);
            ui.text(sundetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + sundetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + sundetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + sundetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + sundetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + sundetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + sundetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + sundetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + sundetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + sundetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Mercury = infos.get(1);
            mercurydetails[0] = Mercury.getPlanetName();
            mercurydetails[1] = Mercury.getPlanetSize();
            mercurydetails[2] = Mercury.getPlanetMass();
            mercurydetails[3] = Mercury.getPlanetPopulation();
            mercurydetails[4] = Mercury.getAmountOfMoons();
            mercurydetails[5] = Mercury.getTimeOfOrbitAroundSun();
            mercurydetails[6] = Mercury.getDistanceFromSun();
            mercurydetails[7] = Mercury.getPlanetTemp();
            mercurydetails[8] = Mercury.getGravity();
            mercurydetails[9] = Mercury.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(mercurydetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + mercurydetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + mercurydetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + mercurydetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + mercurydetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + mercurydetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + mercurydetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + mercurydetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + mercurydetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + mercurydetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Venus = infos.get(2);
            venusdetails[0] = Venus.getPlanetName();
            venusdetails[1] = Venus.getPlanetSize();
            venusdetails[2] = Venus.getPlanetMass();
            venusdetails[3] = Venus.getPlanetPopulation();
            venusdetails[4] = Venus.getAmountOfMoons();
            venusdetails[5] = Venus.getTimeOfOrbitAroundSun();
            venusdetails[6] = Venus.getDistanceFromSun();
            venusdetails[7] = Venus.getPlanetTemp();
            venusdetails[8] = Venus.getGravity();
            venusdetails[9] = Venus.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(venusdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + venusdetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + venusdetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + venusdetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + venusdetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + venusdetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + venusdetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + venusdetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + venusdetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + venusdetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Earth = infos.get(3);
            earthdetails[0] = Earth.getPlanetName();
            earthdetails[1] = Earth.getPlanetSize();
            earthdetails[2] = Earth.getPlanetMass();
            earthdetails[3] = Earth.getPlanetPopulation();
            earthdetails[4] = Earth.getAmountOfMoons();
            earthdetails[5] = Earth.getTimeOfOrbitAroundSun();
            earthdetails[6] = Earth.getDistanceFromSun();
            earthdetails[7] = Earth.getPlanetTemp();
            earthdetails[8] = Earth.getGravity();
            earthdetails[9] = Earth.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(earthdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + earthdetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + earthdetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + earthdetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + earthdetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + earthdetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + earthdetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + earthdetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + earthdetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + earthdetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Mars = infos.get(4);
            marsdetails[0] = Mars.getPlanetName();
            marsdetails[1] = Mars.getPlanetSize();
            marsdetails[2] = Mars.getPlanetMass();
            marsdetails[3] = Mars.getPlanetPopulation();
            marsdetails[4] = Mars.getAmountOfMoons();
            marsdetails[5] = Mars.getTimeOfOrbitAroundSun();
            marsdetails[6] = Mars.getDistanceFromSun();
            marsdetails[7] = Mars.getPlanetTemp();
            marsdetails[8] = Mars.getGravity();
            marsdetails[9] = Mars.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(marsdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + marsdetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + marsdetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + marsdetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + marsdetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + marsdetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + marsdetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + marsdetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + marsdetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + marsdetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Jupiter = infos.get(5);
            jupiterdetails[0] = Jupiter.getPlanetName();
            jupiterdetails[1] = Jupiter.getPlanetSize();
            jupiterdetails[2] = Jupiter.getPlanetMass();
            jupiterdetails[3] = Jupiter.getPlanetPopulation();
            jupiterdetails[4] = Jupiter.getAmountOfMoons();
            jupiterdetails[5] = Jupiter.getTimeOfOrbitAroundSun();
            jupiterdetails[6] = Jupiter.getDistanceFromSun();
            jupiterdetails[7] = Jupiter.getPlanetTemp();
            jupiterdetails[8] = Jupiter.getGravity();
            jupiterdetails[9] = Jupiter.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(jupiterdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + jupiterdetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + jupiterdetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + jupiterdetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + jupiterdetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + jupiterdetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + jupiterdetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + jupiterdetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + jupiterdetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + jupiterdetails[9],(width/4) +50,(yrect*1.5f)+410);
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

            Info Saturn = infos.get(6);
            saturndetails[0] = Saturn.getPlanetName();
            saturndetails[1] = Saturn.getPlanetSize();
            saturndetails[2] = Saturn.getPlanetMass();
            saturndetails[3] = Saturn.getPlanetPopulation();
            saturndetails[4] = Saturn.getAmountOfMoons();
            saturndetails[5] = Saturn.getTimeOfOrbitAroundSun();
            saturndetails[6] = Saturn.getDistanceFromSun();
            saturndetails[7] = Saturn.getPlanetTemp();
            saturndetails[8] = Saturn.getGravity();
            saturndetails[9] = Saturn.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(saturndetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + saturndetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + saturndetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + saturndetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + saturndetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + saturndetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + saturndetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + saturndetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + saturndetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + saturndetails[9],(width/4) +50,(yrect*1.5f)+410);            
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

            Info Uranus = infos.get(7);
            uranusdetails[0] = Uranus.getPlanetName();
            uranusdetails[1] = Uranus.getPlanetSize();
            uranusdetails[2] = Uranus.getPlanetMass();
            uranusdetails[3] = Uranus.getPlanetPopulation();
            uranusdetails[4] = Uranus.getAmountOfMoons();
            uranusdetails[5] = Uranus.getTimeOfOrbitAroundSun();
            uranusdetails[6] = Uranus.getDistanceFromSun();
            uranusdetails[7] = Uranus.getPlanetTemp();
            uranusdetails[8] = Uranus.getGravity();
            uranusdetails[9] = Uranus.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(uranusdetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + uranusdetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + uranusdetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + uranusdetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + uranusdetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + uranusdetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + uranusdetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + uranusdetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + uranusdetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + uranusdetails[9],(width/4) +50,(yrect*1.5f)+410);            
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

            Info Neptune = infos.get(8);
            neptunedetails[0] = Neptune.getPlanetName();
            neptunedetails[1] = Neptune.getPlanetSize();
            neptunedetails[2] = Neptune.getPlanetMass();
            neptunedetails[3] = Neptune.getPlanetPopulation();
            neptunedetails[4] = Neptune.getAmountOfMoons();
            neptunedetails[5] = Neptune.getTimeOfOrbitAroundSun();
            neptunedetails[6] = Neptune.getDistanceFromSun();
            neptunedetails[7] = Neptune.getPlanetTemp();
            neptunedetails[8] = Neptune.getGravity();
            neptunedetails[9] = Neptune.getLengthOfDay();
            ui.fill(255);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.textSize(25);
            ui.text(neptunedetails[0],(width/4) +250,(yrect*1.5f)+50);
            ui.textAlign(PApplet.LEFT, PApplet.CENTER);
            ui.textSize(15);
            ui.text("Diameter of Planet: " + neptunedetails[1],(width/4) +50,(yrect*1.5f)+90);
            ui.text("Mass of Planet: " + neptunedetails[2],(width/4) +50,(yrect*1.5f)+130);
            ui.text("Population of Planet: " + neptunedetails[3],(width/4) +50,(yrect*1.5f)+170);
            ui.text("Amount of Moons: " + neptunedetails[4],(width/4) +50,(yrect*1.5f)+210);
            ui.text("Time of Orbit around the Sun: " + neptunedetails[5],(width/4) +50,(yrect*1.5f)+250);
            ui.text("Distance from the Sun: " + neptunedetails[6],(width/4) +50,(yrect*1.5f)+290);
            ui.text("Temperature of Planet: " + neptunedetails[7],(width/4) +50,(yrect*1.5f)+330);
            ui.text("Gravitational force of Planet: " + neptunedetails[8],(width/4) +50,(yrect*1.5f)+370);
            ui.text("Length of day on the Planet: " + neptunedetails[9],(width/4) +50,(yrect*1.5f)+410);            
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