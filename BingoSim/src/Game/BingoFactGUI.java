/*
 * GUI interface to properly display the Bingo Fact in a window.
 */

/**
 * Author: Sara Lively
 * A-Number: A25227626
 * This is a class for making the BINGO Fact GUI.
 */
package Game;
import java.awt.*;
import javax.swing.*;


public class BingoFactGUI
{
    private final JFrame Frame = new JFrame();
    private JLabel WinnerText = new JLabel();
    private JLabel FactText = new JLabel();
    /**
     * This will create the window to display the fact & tell the person that they won.
     * @param 
     */
    public BingoFactGUI( String Fact )
    {
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        WinnerText = new JLabel("Congrats, You Won! Enjoy your BINGO FACT!");
        WinnerText.setFont(new Font("Serif", Font.BOLD, 20));
        WinnerText.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        JLabel Blank = new JLabel("\n");
        JLabel Blank1 = new JLabel("\n");
        JLabel Blank2 = new JLabel("\n");
        FactText = new JLabel(Fact);
        FactText.setFont(new Font("Serif", Font.BOLD, 15));
        FactText.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        WinnerText.setBorder(BorderFactory.createCompoundBorder(
                   BorderFactory.createLineBorder(Color.black),
                   WinnerText.getBorder()));
        container.add(Blank);
        container.add(WinnerText);
        container.add(Blank1);
        container.add(Blank2);
        container.add(FactText);
        Frame.add(container);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setSize(1500, 150);
        Frame.setVisible(true);
    }
}
