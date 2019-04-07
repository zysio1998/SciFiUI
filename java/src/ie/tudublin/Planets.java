package ie.tudublin;

import processing.core.PApplet;

public abstract class Planets
{
    protected float x;
    protected float y;
    protected float diameter;
    protected PApplet ui;
		
    public Planets(PApplet ui,float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter; 
    }

    public abstract void update(); 
    
    public abstract void render();

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the ui
     */
    public PApplet getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(PApplet ui) {
        this.ui = ui;
    }
}


