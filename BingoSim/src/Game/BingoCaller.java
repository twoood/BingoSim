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


/**
 *This Constructor initializes and empty Array List to contain the CalledValues
 * and adds the "Free" space to the list of called values
 * 
 */
public BingoCaller()
{
    this.CalledValues= new ArrayList <>();
    CalledValues.add("Free");
}
/**
 *This Function Calls the given bingo values and then places the called values 
 * on the list of called values in the BingoCaller Class
 * @return String CalledValue
 * 
 */
public String CallValue()
{
    int Input = Rand.nextInt(5);
    String BingoValue = GenerateVal(Input);
    while(CalledValues.contains(BingoValue) == true) // Ensures no Duplicate Values are called when playing
    {
    BingoValue = GenerateVal(Input);
    //DisplayValue(BingoValue);
    }
    
    CalledValues.add(BingoValue);
    
    
    
    return BingoValue;
    
    
}

  /**
 *This Function Generates a valid Bingo Value when called by the Call value 
 * function. It is based exactly on the Bingo Value Generator found in the board
 * class
 * @return String GeneratedVal
 * @param int Seed
 */
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
/**
 *This Function returns the BingoCaller's List of Called Values and is used to 
 * check the validity of any bingo called
 * @return ArrayList<String>
 * 
 */
public ArrayList<String> GetValuesCalled()
{
   ArrayList<String> TempList= CalledValues;
   return TempList;
}
}

