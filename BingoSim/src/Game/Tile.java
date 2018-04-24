/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;
import java.util.*;

/**
 *
 * @author Tom Wood
 * Class used to implement each Bingo Square on the Bingo Board. Each Tile has
 * a String Value (BingoVal), and a Boolean to know whether it's selected or 
 * not.
 */
public class Tile {
    private final String BingoVal;
    //private static Random Rand = new Random();
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
       this.BingoVal = "Broke";//this.GenerateVal(i);
       /*this.SetSelected(false);
       //System.out.print(this.getVal());
       //System.out.println(this.getStatus());*/
    }
    /**
     * Constructor used for the Free Space. This constructor is unique to the 
     * Free Space in the center of the Bingo Card.
     * @param Free 
     */
    public Tile(String Free)
    {
        if (Free.equals("Free"))
        {
            this.BingoVal = "Free";
        }
        else 
        {
        this.BingoVal = Free;
        }
        this.SetSelected(false);
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
        //System.out.print(this.getVal() + " which is initialized");
        if (selected == true)
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
