/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import java.util.Random;

/**
 *
 * @author dale
 */
public class Tile {
    private String BingoVal;
    private static Random rand = new Random();
    
    public Tile(int i)
    {
       this.BingoVal = this.getPosition(i);
    }
    public String getPosition(int i)
    {
        int Num;
        String Total;
        if (i == 0)
        {
            Num = rand.nextInt(15)+1;
            String temp = Integer.toString(Num);
            Total = 'B' + temp;
            return Total;
        }
        else if (i == 1)
        {
            Num = rand.nextInt(15)+16;
            String temp = Integer.toString(Num);
            Total = 'I' + temp;
            return Total;
        }
        else if (i == 2)
        {
            Num = rand.nextInt(15)+31;
            String temp = Integer.toString(Num);
            Total = 'N' + temp;
            return Total;
        }
        else if (i == 3)
        {
            Num = rand.nextInt(15)+46;
            String temp = Integer.toString(Num);
            Total = 'G' + temp;
            return Total;
        }
        else if (i == 4)
        {
            Num = rand.nextInt(15)+61;
            String temp = Integer.toString(Num);
            Total = 'O' + temp;
            return Total;
        }        
        else
            Total = "Error";
        return Total;
    }
    public String getVal()
    {
        return this.BingoVal;
    }
}
