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
    private final JButton Ok = new JButton("Ok");
    private final JTextField WinnerText = new JTextField(50);
    private final JTextField FactText = new JTextField(50);
    /**
     * This will create the window to display the fact & tell the person that they won.
     * @param 
     */
    public BingoFactGUI( String Fact )
    {
        WinnerText.setText("Congrats, You Won! Enjoy your BINGO FACT!");
        FactText.setText(Fact);
        Frame.setLayout(new FlowLayout());
        Frame.add(WinnerText);
        Frame.add(FactText);
        Frame.add(Ok);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }
}
