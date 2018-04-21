/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.*;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Tom Wood
 * This java class is used exclusively to check the functionality of the Board, 
 * Tiles, and the Gui.
 * Not to be used for integration.
 */
public class testBoardChips {
    public static void main(String[] args)
   {
   JFrame f = new JFrame("Bingo Board");

   Board myboard = new Board(false);
   
   Board testboard = new Board(true);
   System.out.println("Begin");
   
   /*JPanel use4 = myboard.displayBoard();
   System.out.println("Begin");
   javax.swing.GroupLayout layout = new javax.swing.GroupLayout(use4);
        use4.setLayout(layout);
        // layout settings goes here
        f.setSize(1500, 500);
        f.add(use4);
        f.setVisible(true);
   
  JButton b1 = new JButton(myboard.getTile(0, 0));
   
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
   
   f.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
      
    }
    }
    
    public void windowActivated(WindowEvent we) {
        myboard.PlayGame();
        testboard.PlayGame();
        testboard.CheckCPU("B2");
        testboard.CheckCPU("B7");
        testboard.CheckCPU("B9");
        ArrayList<String> Arrry = new ArrayList<>();
        Arrry = testboard.GetMarked();
        
		for (String temp : Arrry) {
			System.out.print(temp + "Marked");
		}
        System.out.println("this window or a subframe was focused");
         
    }
    });

   }
}
