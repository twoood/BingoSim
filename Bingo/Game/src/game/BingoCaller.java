/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.*;

/**
 *This Class is designed to represent the BingoCaller that is responsible for
 * calling and displaying the bingo values each game
 * @author mckinney
 */
public class BingoCaller {
private static Random Rand = new Random();
private ArrayList<String> CalledValues;
private final CallerGui GUI;


public BingoCaller()
{
    
}
public void CallValue()
{
    int Input = Rand.nextInt(5);
    String BingoValue = GenerateVal(Input);
    
    CalledValues.add(BingoValue);
    
    DispalyValue(BingoValue);
    
    
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
}
