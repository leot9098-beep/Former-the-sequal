package former;

import java.awt.Graphics;
import java.io.Serializable;

public abstract class Forms implements Serializable {

    protected int KordX;
    protected int KordY;
    protected boolean run = false;

    public Forms(int x, int y) {
        this.KordX = x;
        this.KordY = y;
    }

    public void setRunning(boolean run) {
        this.run = run;
    }

    public void move(int x, int y) {
       
    }

    public int getKordX() {
        return this.KordX;
    }

    public int setKordY() {
        return this.KordY;
    }
    
    public abstract void draw(Graphics g);
public abstract String WhatAmI();
}
