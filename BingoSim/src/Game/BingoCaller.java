/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;
import javax.swing.*;
import java.awt.*;


/**
 *This Class is designed to represent the BingoCaller that is responsible for
 * calling and displaying the bingo values each game
 * @author mckinney
 */
public class BingoCaller {
private static Random Rand = new Random();
private ArrayList<String> CalledValues;



public BingoCaller()
{
    this.CalledValues= new ArrayList <>();
    CalledValues.add("Free");
}

public String CallValue()
{
    int Input = Rand.nextInt(5);
    String BingoValue = GenerateVal(Input);
    
    CalledValues.add(BingoValue);
    
    
    
    return BingoValue;
    
    
}

    
private static String GenerateVal(int i)
{
        int Num;
        String Total;
        switch (i) {
            case 0:
            {
                Num = Rand.nextInt(15)+1;
                String temp = Integer.toString(Num);
                Total = 'B' + temp;
                return Total;
            }
            case 1:
            {
                Num = Rand.nextInt(15)+16;
                String temp = Integer.toString(Num);
                Total = 'I' + temp;
                return Total;
            }
            case 2:
            {
                Num = Rand.nextInt(15)+31;
                String temp = Integer.toString(Num);
                Total = 'N' + temp;
                return Total;
            }
            case 3:
            {
                Num = Rand.nextInt(15)+46;
                String temp = Integer.toString(Num);
                Total = 'G' + temp;
                return Total;
            }
            case 4:
            {
                Num = Rand.nextInt(15)+61;
                String temp = Integer.toString(Num);
                Total = 'O' + temp;
                return Total;
            }
            default:
                Total = "Error";
                break;
        }
        return Total;
    }
public ArrayList<String> GetValuesCalled()
{
   ArrayList<String> TempList= CalledValues;
   return TempList;
}
public void displayCaller()
{
        JFrame GenericFrame = new JFrame();
        String CalledValue=CallValue();
        JPanel GenericPanel = new JPanel();
        GenericPanel.setLayout(new BoxLayout(GenericPanel, BoxLayout.X_AXIS));

        JButton NextCall = new JButton("Next");
        GenericFrame.setSize(200,150);
        GenericFrame.setTitle(CalledValue);
           
        
        JLabel BingoVal = new JLabel(CalledValue);
        
        BingoVal.setSize(75,175);
        BingoVal.setFont(new Font("Serif", 1 ,30));
        GenericPanel.add(BingoVal);
        GenericFrame.add(GenericPanel);
        GenericFrame.setVisible(true);
        GenericFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
