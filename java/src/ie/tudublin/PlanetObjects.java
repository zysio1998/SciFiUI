package ie.tudublin;

import processing.core.PApplet;

public abstract class PlanetObjects
{
    protected float x;
    protected float y;
    protected float width;
    protected float height;
    protected PApplet ui;
		
    public PlanetObjects(PApplet ui,float x, float y, float width, float height)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width; 
        this.height = height;
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
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the diameter to set
     */
    public void setWidth(float width) {
        this.width = width;
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

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }
}


