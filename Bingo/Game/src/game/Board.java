/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dale
 */
public class Board {
    
    private Tile[][] BoardTile = new Tile[5][5];
    private String ThemeBoard;
    private JPanel show = new JPanel();
    
    public Board(String Theme)
    {
        this.ThemeBoard = Theme;
        int j = 0;
        for (int i =0; i <5; i++)
        {
            for (j = 0; j < 5; j++)
            {
            this.BoardTile[i][j] = new Tile(i); 
            }
            
        }
        
    }
    public String getTile(int i, int j)
    {
        return this.BoardTile[i][j].getVal();
    }
    public void displayBoard(JFrame f)
    {
        show.setBounds(40, 80, 2000, 2000);
        if (this.ThemeBoard.equals("Dark"))
        {
        show.setBackground(Color.GRAY);
        }
        else 
        {
            show.setBackground(Color.CYAN);
        }
        show.setLayout(null);
        JButton b1 = new JButton(this.getTile(0, 0));
        JButton b2 = new JButton(this.getTile(0, 1));
        JButton b3 = new JButton(this.getTile(0, 2));
        JButton b4 = new JButton(this.getTile(0, 3));
        JButton b5 = new JButton(this.getTile(0, 4));
        
        JButton i1 = new JButton(this.getTile(1, 0));
        JButton i2 = new JButton(this.getTile(1, 1));
        JButton i3 = new JButton(this.getTile(1, 2));
        JButton i4 = new JButton(this.getTile(1, 3));
        JButton i5 = new JButton(this.getTile(1, 4));
        
        JButton n1 = new JButton(this.getTile(2, 0));
        JButton n2 = new JButton(this.getTile(2, 1));
        JButton n3 = new JButton(this.getTile(2, 2));
        JButton n4 = new JButton(this.getTile(2, 3));
        JButton n5 = new JButton(this.getTile(2, 4));
        
        JButton g1 = new JButton(this.getTile(3, 0));
        JButton g2 = new JButton(this.getTile(3, 1));
        JButton g3 = new JButton(this.getTile(3, 2));
        JButton g4 = new JButton(this.getTile(3, 3));
        JButton g5 = new JButton(this.getTile(3, 4));

        JButton o1 = new JButton(this.getTile(4, 0));
        JButton o2 = new JButton(this.getTile(4, 1));
        JButton o3 = new JButton(this.getTile(4, 2));
        JButton o4 = new JButton(this.getTile(4, 3));
        JButton o5 = new JButton(this.getTile(4, 4));
        
        JLabel b = new JLabel("B");
        JLabel i = new JLabel("I");
        JLabel n = new JLabel("N");
        JLabel g = new JLabel("G");
        JLabel o = new JLabel("O");
        
        b.setFont(new Font("Serif", Font.BOLD, 50));
        i.setFont(new Font("Serif", Font.BOLD, 50));
        n.setFont(new Font("Serif", Font.BOLD, 50));
        g.setFont(new Font("Serif", Font.BOLD, 50));
        o.setFont(new Font("Serif", Font.BOLD, 50));
        
        b.setBounds(80, 0, 100, 50);
        i.setBounds(190, 0, 100, 50);
        n.setBounds(285, 0, 100, 50);
        g.setBounds(385, 0, 100, 50);
        o.setBounds(485, 0, 100, 50);
        
        b1.setBounds(50, 0+50, 100, 40);
        b2.setBounds(50, 50+50, 100, 40);
        b3.setBounds(50, 100+50, 100, 40);
        b4.setBounds(50, 150+50, 100, 40);
        b5.setBounds(50, 200+50, 100, 40);
        
        i1.setBounds(150, 0+50, 100, 40);
        i2.setBounds(150, 50+50, 100, 40);
        i3.setBounds(150, 100+50, 100, 40);
        i4.setBounds(150, 150+50, 100, 40);
        i5.setBounds(150, 200+50, 100, 40);
        
        n1.setBounds(250, 0+50, 100, 40);
        n2.setBounds(250, 50+50, 100, 40);
        n3.setBounds(250, 100+50, 100, 40);
        n4.setBounds(250, 150+50, 100, 40);
        n5.setBounds(250, 200+50, 100, 40);
        
        g1.setBounds(350, 0+50, 100, 40);
        g2.setBounds(350, 50+50, 100, 40);
        g3.setBounds(350, 100+50, 100, 40);
        g4.setBounds(350, 150+50, 100, 40);
        g5.setBounds(350, 200+50, 100, 40);
        
        o1.setBounds(450, 0+50, 100, 40);
        o2.setBounds(450, 50+50, 100, 40);
        o3.setBounds(450, 100+50, 100, 40);
        o4.setBounds(450, 150+50, 100, 40);
        o5.setBounds(450, 200+50, 100, 40);
        
        show.add(b);
        show.add(i);
        show.add(n);
        show.add(g);
        show.add(o);
        
        show.add(b1);
        show.add(b2);
        show.add(b3);
        show.add(b4);
        show.add(b5);
        
        show.add(i1);
        show.add(i2);
        show.add(i3);
        show.add(i4);
        show.add(i5);
        
        show.add(n1);
        show.add(n2);
        show.add(n3);
        show.add(n4);
        show.add(n5);

        show.add(g1);
        show.add(g2);
        show.add(g3);
        show.add(g4);
        show.add(g5);

        show.add(o1);
        show.add(o2);
        show.add(o3);
        show.add(o4);
        show.add(o5);
        
        f.add(show);
        
    }
}
