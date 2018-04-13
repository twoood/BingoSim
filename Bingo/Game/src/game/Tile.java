/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import java.util.Random;

/**
 *
 * @author Tom Wood
 * Class used to implement each Bingo Square on the Bingo Board. Each Tile has
 * a String Value (BingoVal), and a Boolean to know whether it's selected or 
 * not.
 */
public class Tile {
    private final String BingoVal;
    private static Random Rand = new Random();
    private Boolean IsSelected;
    
    /**
     * Constructor used to instantiate a Tile Object. The constructor gets the
     * tile position, and depending on the position, it generates a random legal
     * Bingo value using the GenerateVal fucntion. It also sets the Tile to 
     * false by default because it isn't selected.
     * @param i 
     */
    public Tile(int i)
    {
       this.BingoVal = this.GenerateVal(i);
       this.SetSelected(false);
       System.out.print(this.getVal());
       System.out.println(this.getStatus());
    }
    /**
     * Constructor used for the Free Space. This constructor is unique to the 
     * Free Space in the center of the Bingo Card.
     * @param Free 
     */
    public Tile(String Free)
    {
        this.BingoVal = Free;
        this.SetSelected(false);
    }
    /**
     * Function used to Generate Legal Bingo values. Bingo values vary depending
     * on the column they're used. This function makes sure to return the 
     * correct string for a Bingo Tile.
     * @param i which indicates position in the column of the array
     * @return String Bingo Value
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
     * Function used to get the Bingo Value of the Tile.
     * @return the Bingo Value of the Tile 
     */
    public String getVal()
    {
        return this.BingoVal;
    }
    /**
     * Function used to set the status of the Tile and whether it's selected
     * or not. 
     * @param selected 
     */
    public void SetSelected(Boolean selected)
    {
        IsSelected = selected;
        System.out.print(this.getVal());
        System.out.println("Value change to " + selected);
    }
    /**
     * Function used to get the status of the Tile and whether it's selected or
     * not.
     * @return Boolean status of the Tile 
     */
    public Boolean getStatus()
    {
        return this.IsSelected;
    }
}
