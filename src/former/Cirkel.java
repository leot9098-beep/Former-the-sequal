package former;
import java.awt.Color;
import java.io.Serializable;
import java.util.Locale;
import java.awt.Graphics;


public class Cirkel extends Forms{
    private int radie;
    private boolean fylld;
    private int startx;
    private int starty;
    private Color FärgPåForm;

    public Cirkel(int x, int y, int radie, boolean fylld) {
        super(x, y);
        this.radie=radie;
        this.fylld=fylld;
        int FärgR = (int) (Math.random()*256);
        int FärgG = (int) (Math.random()*256);
        int FärgB = (int) (Math.random()*256);
         FärgPåForm = new Color(FärgR,FärgG,FärgB);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(FärgPåForm);
                g.fillOval(KordX-radie/2, KordY-radie/2, radie, radie);
    }

    @Override
    public String WhatAmI() {
        return "Cirkel";
    }
    
}
