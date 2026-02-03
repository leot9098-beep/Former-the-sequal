package former;
import java.awt.Color;
import java.io.Serializable;
import java.util.Locale;
import java.awt.Graphics;


public class Triangel extends Forms {
    private int bas;
    private int höjd;
    private boolean fylld;
    private int startx;
    private int starty;
        private Color FärgPåForm;

    public Triangel(int x, int y, int bas, int höjd, boolean fylld) {
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
          g.fillPolygon(new int[] {KordX-bas/2,KordX ,KordX+bas/2 }, new int[] {KordY+höjd/2, KordY-höjd/2, KordY+höjd/2}, 3);
                
    }

    @Override
    public String WhatAmI() {
        return "Triangel";
    }
}
