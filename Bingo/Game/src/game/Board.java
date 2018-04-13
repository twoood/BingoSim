/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.*;

import javax.swing.*;

/**
 *
 * @author Tom Wood
 * Board Class the represents the data structure of a Bingo Board. The Board 
 * class consists of a 2-D array of Tile objects. The Board also has a String
 * for the theme, and has a GUI. 
 */
public class Board {
    
    private final Tile[][] BoardTile = new Tile[5][5];
    private final Boolean ThemeBoard;
    private final BoardGui TheGui;
 
    /**
     * Constructor that creates a new Board with the given theme. It 
     * instantiates all the Tile objects in the array with the proper values.It 
     * also instantiates its own GUI.
     * @param Theme 
     */
    public Board(Boolean Theme)
    {
        this.ThemeBoard = Theme;
      
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
            if ((i == 2) && (j == 2))
            {
                this.BoardTile[i][j] = new Tile("Free");
            }
            else   
            this.BoardTile[i][j] = new Tile(i); 
            }
        }

    TheGui = new BoardGui(this);
                
    }
    /**
     * Returns the Bingo Value of a specific tile which can be indentified by 
     * array incides. 
     * @param i column
     * @param j row
     * @return 
     */
    public String getTile(int i, int j)
    {
        return this.BoardTile[i][j].getVal();
    }
    /**
     * Function used to get the Theme of the board. It returns a clone of the 
     * string.
     * @return clone of the the board's theme
     */
    public Boolean getTheme()
    {
        Boolean theme = this.ThemeBoard;
        return theme;
        
    }
    /**
     * Function used to set the Tile's IsSelected status to true.
     * @param i column
     * @param j row
     */
    public void SetTileObject(int i, int j)
    {
        this.BoardTile[i][j].SetSelected(Boolean.TRUE);
    }
    /**
     * Function used to get the Tile's IsSelected status. It will return true or
     * false depending on hwo the Tile is set on the board.
     * @param i column
     * @param j row
     * @return 
     */
    public Boolean GetTileStatus(int i, int j)
    {

        return this.BoardTile[i][j].getStatus();
    }
    /**
     * Function used to get the GUI of the board.
     * @return theGui
     */
    public JPanel displayBoard()
    {
        return TheGui.GetGui();
        
    }
    /**
     * Function used to Play the Game. It calls the GUI's BoardInteraction 
     * function.
     */
    public void PlayGame()
    {
        TheGui.BoardInteraction();
    }
    public ArrayList<String> GetMarked()
    {
        ArrayList<String> CalledValues = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
            if(this.GetTileStatus(i, j).equals(true))
                CalledValues.add(this.getTile(i, j));
            }
        }
        return CalledValues;
    }
}
