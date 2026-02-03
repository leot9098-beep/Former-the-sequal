package former;
import java.awt.Color;
import java.io.Serializable;
import java.util.Locale;
import java.awt.Graphics;


public class Rektangel extends Forms{
    private int bas;
    private int höjd;
    private boolean fylld;
    private int startx;
    private int starty;
    private Color FärgPåForm;

    
    public Rektangel(int x, int y, int bas, int höjd, boolean fylld) {
        super(x, y);
          this.fylld=fylld;
        this.bas=bas;
        this.höjd=höjd;
        int FärgR = (int) (Math.random()*256);
        int FärgG = (int) (Math.random()*256);
        int FärgB = (int) (Math.random()*256);
        FärgPåForm = new Color(FärgR,FärgG,FärgB);
    }
    @Override
    public void draw(Graphics g) {
         g.setColor(FärgPåForm);
                g.fillRect(KordX-bas/2, KordY-höjd/2, bas, höjd);
    }

    @Override
    public String WhatAmI() {
        return "Rektangel";
    }
}
