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
   JFrame f = new JFrame("Bingo Board");
   String theme = "Not Dark";
   Board myboard = new Board(theme);
   Board testboard = new Board("Dark");
   
  /* JButton b1 = new JButton(myboard.getTile(0, 0));
   
   b1.setBounds(50, 50, 5, 5);
   
   f.setSize(640, 480);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.add(b1);*/
   f.setSize(1500, 500);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JPanel container = new JPanel();
   container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
   JPanel use1 = myboard.displayBoard();
   JPanel use2 = testboard.displayBoard();
   container.add(use1);
   container.add(use2);
   f.add(container);
   while (f.isActive())
   {
       myboard.PlayGame();
       testboard.PlayGame();
   }

   }
}
