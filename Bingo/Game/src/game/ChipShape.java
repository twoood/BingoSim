/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author dale
 */
public class ChipShape extends SelectableShape {
    
    private static final int value = 10;
    private int x;
    private int y;
    
    public ChipShape(int input1, int input2)
    {
        this.x = input1;
        this.y = input2;
    }
    
    
    public void draw(Graphics2D g2)
    {
    Ellipse2D.Double displaychip = new Ellipse2D.Double(x - value, y - value, 2.0 * value, 2.0 * value);
    g2.draw(displaychip);
    }
    
}
