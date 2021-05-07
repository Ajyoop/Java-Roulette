
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ellio
 */
public class Slot {
    //Attributer
    private int number;
    private Color färg;
    private int xCord;

    //Kontruktor
    public Slot(int number, Color f, int xCord) {
        this.number = number;
        this.färg = f;
        this.xCord = xCord;
    }
    
    //GETTER AND SETTERS
    public Color getFärg() {
        return färg;
    }
    
    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }
    
    //METODER
    
    /**
     * Ritar upp slotten
     * @param g Graphics
     */
    public void drawSlot(Graphics g){
        g.setColor(färg);
        g.fillRect(xCord, 180, 80, 80);
        
        
    }

    

    
    
    
    
    
    
}
