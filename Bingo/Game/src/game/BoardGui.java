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
 * @author Tom Wood
 * Class used to visualize the underlying data structure of the Board Class as 
 * a JPanel with each element of the 2-D array implemented as JButtons.
 */
public class BoardGui {
        private JButton b1 = new JButton();
        private JButton b2 = new JButton();
        private JButton b3 = new JButton();
        private JButton b4 = new JButton();
        private JButton b5 = new JButton();
        
        private JButton i1 = new JButton();
        private JButton i2 = new JButton();
        private JButton i3 = new JButton();
        private JButton i4 = new JButton();
        private JButton i5 = new JButton();
        
        private JButton n1 = new JButton();
        private JButton n2 = new JButton();
        private JButton n3 = new JButton();
        private JButton n4 = new JButton();
        private JButton n5 = new JButton();
        
        private JButton g1 = new JButton();
        private JButton g2 = new JButton();
        private JButton g3 = new JButton();
        private JButton g4 = new JButton();
        private JButton g5 = new JButton();

        private JButton o1 = new JButton();
        private JButton o2 = new JButton();
        private JButton o3 = new JButton();
        private JButton o4 = new JButton();
        private JButton o5 = new JButton();
        
        private JButton Call = new JButton();
        
        private JPanel Show = new JPanel();
        
        private Board TheBoard;
        
        
        /**
         * 
         * @param ThisBoard 
         * Constructor used to create a board. The constructor defines the color
         * scheme of the GUI, creates all the JButtons, and adds the text.
         */
        
        public BoardGui(Board ThisBoard)
        {
        TheBoard = ThisBoard;
        
        Color LightLetters = new Color(244, 119, 28);
        Color DarkLetters = new Color(81, 93, 198);
        
        Color DarkTiles1 = new Color(207, 208, 234);
        Color DarkTiles2 = new Color(233, 233, 245);
        
        Color LightTiles1 = new Color(251, 213, 202);
        Color LightTiles2 = new Color(253, 235, 231);
        
        
         Show = new JPanel();
         Show.setBounds(40, 80, 400, 600);
        if (ThisBoard.getTheme().equals("Dark"))
        {
         Show.setBackground(DarkLetters);
        }
        else 
        {
             Show.setBackground(LightLetters);
        }
         Show.setLayout(null);
        b1 = new JButton(ThisBoard.getTile(0, 0));
        b2 = new JButton(ThisBoard.getTile(0, 1));
        b3 = new JButton(ThisBoard.getTile(0, 2));
        b4 = new JButton(ThisBoard.getTile(0, 3));
        b5 = new JButton(ThisBoard.getTile(0, 4));
        
        i1 = new JButton(ThisBoard.getTile(1, 0));
        i2 = new JButton(ThisBoard.getTile(1, 1));
        i3 = new JButton(ThisBoard.getTile(1, 2));
        i4 = new JButton(ThisBoard.getTile(1, 3));
        i5 = new JButton(ThisBoard.getTile(1, 4));
        
        n1 = new JButton(ThisBoard.getTile(2, 0));
        n2 = new JButton(ThisBoard.getTile(2, 1));
        n3 = new JButton(ThisBoard.getTile(2, 2));
        n4 = new JButton(ThisBoard.getTile(2, 3));
        n5 = new JButton(ThisBoard.getTile(2, 4));
        
        g1 = new JButton(ThisBoard.getTile(3, 0));
        g2 = new JButton(ThisBoard.getTile(3, 1));
        g3 = new JButton(ThisBoard.getTile(3, 2));
        g4 = new JButton(ThisBoard.getTile(3, 3));
        g5 = new JButton(ThisBoard.getTile(3, 4));

        o1 = new JButton(ThisBoard.getTile(4, 0));
        o2 = new JButton(ThisBoard.getTile(4, 1));
        o3 = new JButton(ThisBoard.getTile(4, 2));
        o4 = new JButton(ThisBoard.getTile(4, 3));
        o5 = new JButton(ThisBoard.getTile(4, 4));
        
        Call = new JButton("Call BINGO");
        
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
        
        
        Call.setFont(new Font("Serif", Font.BOLD, 20));
        Call.setBounds(360, 350, 190, 70);
        
        b.setBounds(80, 0, 100, 50);
        i.setBounds(190, 0, 100, 50);
        n.setBounds(285, 0, 100, 50);
        g.setBounds(385, 0, 100, 50);
        o.setBounds(485, 0, 100, 50);

        b1.setBounds(50, 50, 100, 40);
        b2.setBounds(50, 90, 100, 40);
        b3.setBounds(50, 130, 100, 40);
        b4.setBounds(50, 170, 100, 40);
        b5.setBounds(50, 210, 100, 40);
        
        i1.setBounds(150, 50, 100, 40);
        i2.setBounds(150, 90, 100, 40);
        i3.setBounds(150, 130, 100, 40);
        i4.setBounds(150, 170, 100, 40);
        i5.setBounds(150, 210, 100, 40);
        
        n1.setBounds(250, 50, 100, 40);
        n2.setBounds(250, 90, 100, 40);
        n3.setBounds(250, 130, 100, 40);
        n4.setBounds(250, 170, 100, 40);
        n5.setBounds(250, 210, 100, 40);
        
        g1.setBounds(350, 50, 100, 40);
        g2.setBounds(350, 90, 100, 40);
        g3.setBounds(350, 130, 100, 40);
        g4.setBounds(350, 170, 100, 40);
        g5.setBounds(350, 210, 100, 40);
        
        o1.setBounds(450, 50, 100, 40);
        o2.setBounds(450, 90, 100, 40);
        o3.setBounds(450, 130, 100, 40);
        o4.setBounds(450, 170, 100, 40);
        o5.setBounds(450, 210, 100, 40);
        
        Color letterC = LightLetters;
        Color tile1 = LightTiles1;
        Color tile2 = LightTiles2;
        
        if (ThisBoard.getTheme().equals("Dark"))
        {
            letterC = DarkLetters;
            tile1 = DarkTiles1;
            tile2 = DarkTiles2;
        }
   
        
        b.setForeground(Color.white);
        i.setForeground(Color.white);
        n.setForeground(Color.white);
        g.setForeground(Color.white);
        o.setForeground(Color.white);
        
        b.setBackground(letterC);
        i.setBackground(letterC);
        n.setBackground(letterC);
        g.setBackground(letterC);
        o.setBackground(letterC);

        b.setBackground(letterC);
        i.setBackground(letterC);
        n.setBackground(letterC);
        g.setBackground(letterC);
        o.setBackground(letterC);
        
        b1.setBackground(tile1);
        b2.setBackground(tile2);
        b3.setBackground(tile1);
        b4.setBackground(tile2);
        b5.setBackground(tile1);
        
        i1.setBackground(tile1);
        i2.setBackground(tile2);
        i3.setBackground(tile1);
        i4.setBackground(tile2);
        i5.setBackground(tile1);
        
        n1.setBackground(tile1);
        n2.setBackground(tile2);
        n3.setBackground(tile1);
        n4.setBackground(tile2);
        n5.setBackground(tile1);
        
        g1.setBackground(tile1);
        g2.setBackground(tile2);
        g3.setBackground(tile1);
        g4.setBackground(tile2);
        g5.setBackground(tile1);
        
        o1.setBackground(tile1);
        o2.setBackground(tile2);
        o3.setBackground(tile1);
        o4.setBackground(tile2);
        o5.setBackground(tile1);
        

        
        
         Show.add(Call);
         Show.add(b);
         Show.add(i);
         Show.add(n);
         Show.add(g);
         Show.add(o);
        
         Show.add(b1);
         Show.add(b2);
         Show.add(b3);
         Show.add(b4);
         Show.add(b5);
        
         Show.add(i1);
         Show.add(i2);
         Show.add(i3);
         Show.add(i4);
         Show.add(i5);
        
         Show.add(n1);
         Show.add(n2);
         Show.add(n3);
         Show.add(n4);
         Show.add(n5);

         Show.add(g1);
         Show.add(g2);
         Show.add(g3);
         Show.add(g4);
         Show.add(g5);

         Show.add(o1);
         Show.add(o2);
         Show.add(o3);
         Show.add(o4);
         Show.add(o5);
         
         if(b1.getModel().isEnabled())
                 {
                     System.out.println("Button Enabled");
                 }
         
        
         
         
        }

        /**
         * Adds ActionListeners to the JButtons to allow implementation, and to 
         * give response to the user that the button has been activated. This 
         * function uses an anonymous inner class of ActionLister to accomplish
         * its task.
         */
        public void BoardInteraction()
        {
        ActionListener Alist = (new ActionListener() {
        public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == b1)
        {
            b1.setBackground(Color.red);
            TheBoard.SetTileObject(0, 0);
        }
        else if (e.getSource() == b2)
        {
            b2.setBackground(Color.red);
            TheBoard.SetTileObject(0, 1);            
        }
        else if (e.getSource() == b3)
        {
            b3.setBackground(Color.red);
            TheBoard.SetTileObject(0, 2);
        }
        else if (e.getSource() == b4)
        {
            b4.setBackground(Color.red);
            TheBoard.SetTileObject(0, 3);            
        }
        else if (e.getSource() == b5)
        {
            b5.setBackground(Color.red);
            TheBoard.SetTileObject(0, 4);
        }
                else if (e.getSource() == i1)
        {
            i1.setBackground(Color.red);
            TheBoard.SetTileObject(1, 0);
        }
        else if (e.getSource() == i2)
        {
            i2.setBackground(Color.red);
            TheBoard.SetTileObject(1, 1);            
        }
        else if (e.getSource() == i3)
        {
            i3.setBackground(Color.red);
            TheBoard.SetTileObject(1, 2);
        }
        else if (e.getSource() == i4)
        {
            i4.setBackground(Color.red);
            TheBoard.SetTileObject(1, 3);            
        }
        else if (e.getSource() == i5)
        {
            i5.setBackground(Color.red);
            TheBoard.SetTileObject(1, 4);
        }
                else if (e.getSource() == n1)
        {
            n1.setBackground(Color.red);
            TheBoard.SetTileObject(2, 0);
        }
        else if (e.getSource() == n2)
        {
            n2.setBackground(Color.red);
            TheBoard.SetTileObject(2, 1);            
        }
        else if (e.getSource() == n3)
        {
            n3.setBackground(Color.red);
            TheBoard.SetTileObject(2, 2);
        }
        else if (e.getSource() == n4)
        {
            n4.setBackground(Color.red);
            TheBoard.SetTileObject(2, 3);            
        }
        else if (e.getSource() == n5)
        {
            n5.setBackground(Color.red);
            TheBoard.SetTileObject(2, 4);
        }
                else if (e.getSource() == g1)
        {
            g1.setBackground(Color.red);
            TheBoard.SetTileObject(3, 0);
        }
        else if (e.getSource() == g2)
        {
            g2.setBackground(Color.red);
            TheBoard.SetTileObject(3, 1);            
        }
        else if (e.getSource() == g3)
        {
            g3.setBackground(Color.red);
            TheBoard.SetTileObject(3, 2);
        }
        else if (e.getSource() == g4)
        {
            g4.setBackground(Color.red);
            TheBoard.SetTileObject(3, 3);            
        }
        else if (e.getSource() == g5)
        {
            g5.setBackground(Color.red);
            TheBoard.SetTileObject(3, 4);
        }
        else if (e.getSource() == o1)
        {
            o1.setBackground(Color.red);
            TheBoard.SetTileObject(4, 0);
        }
        else if (e.getSource() == o2)
        {
            o2.setBackground(Color.red);
            TheBoard.SetTileObject(4, 1);            
        }
        else if (e.getSource() == o3)
        {
            o3.setBackground(Color.red);
            TheBoard.SetTileObject(4, 2);
        }
        else if (e.getSource() == o4)
        {
            o4.setBackground(Color.red);
            TheBoard.SetTileObject(4, 3);            
        }
        else if (e.getSource() == o5)
        {
            o5.setBackground(Color.red);
            TheBoard.SetTileObject(4, 4);
        }
        else if (e.getSource() == Call)
        {
            // Implement Calling of Bingo
            Call.setBackground(Color.WHITE);
        }
        }});
        
        b1.addActionListener(Alist);
        b2.addActionListener(Alist);
        b3.addActionListener(Alist);
        b4.addActionListener(Alist);        
        b5.addActionListener(Alist);
        
        i1.addActionListener(Alist);
        i2.addActionListener(Alist);
        i3.addActionListener(Alist);
        i4.addActionListener(Alist);        
        i5.addActionListener(Alist);
        
        n1.addActionListener(Alist);
        n2.addActionListener(Alist);
        n3.addActionListener(Alist);
        n4.addActionListener(Alist);        
        n5.addActionListener(Alist);

        g1.addActionListener(Alist);
        g2.addActionListener(Alist);
        g3.addActionListener(Alist);
        g4.addActionListener(Alist);        
        g5.addActionListener(Alist);

        o1.addActionListener(Alist);
        o2.addActionListener(Alist);
        o3.addActionListener(Alist);
        o4.addActionListener(Alist);        
        o5.addActionListener(Alist);

        Call.addActionListener(Alist);
    
        }
        /**
         * Function used to retrieve the Gui 
         * @return JPanel
         */
        public JPanel GetGui()
        {
            return Show;
        }
}
