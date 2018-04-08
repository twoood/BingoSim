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
public class testBoardChips {
    public static void main(String[] args)
   {
   String theme = "Dark";
   Board myboard = new Board(theme);
   JFrame f = new JFrame("Bingo Board");
  /* JButton b1 = new JButton(myboard.getTile(0, 0));
   
   b1.setBounds(50, 50, 5, 5);
   
   f.setSize(640, 480);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.add(b1);*/
   f.setSize(640, 480);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   myboard.displayBoard(f);
   

   }
}
