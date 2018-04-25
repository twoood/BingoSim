/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
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
    
    private  Game MyGame;
    private final Tile[][] BoardTile = new Tile[5][5];
    private static final Random Rand = new Random();
    private final Boolean ThemeBoard;
    private final BoardGui TheGui;
    private Vector<String> Case0 = new Vector<>();
    private Vector<String> Case1 = new Vector<>();
    private Vector<String> Case2 = new Vector<>();
    private Vector<String> Case3 = new Vector<>();
    private Vector<String> Case4 = new Vector<>();
 
    /**
     * Constructor that creates a new Board with the given theme. It generates
     * the random values for the board and it instantiates all the Tile objects 
     * in the array with the proper values.It also instantiates its own GUI.
     * @param Theme 
     */
    public Board(Boolean Theme)
    {
        this.ThemeBoard = Theme;
        this.GenerateVals();
      
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {  
            this.BoardTile[i][j] = new Tile(i); 
                for (int z = 0; z < 5; z++)
                {
                    if (this.BoardTile[i][j] == this.BoardTile[i][z])
                    {
                        String Val = this.GetVal(i);
                        this.BoardTile[i][j] = new Tile(Val);
                    }
                }
            }
        }
        
    this.BoardTile[2][2] = new Tile("Free");
    TheGui = new BoardGui(this);
    
                
    }
    
     /**
     * Function takes a column and returns one of the randomly generated Bingo
     * Strings held in the private arrays. 
     * @param i Column
     * @return Bingo Value String that will be contained in the tile.
     */
    private String GetVal(int i)
    {
      String Temp = null;
      switch (i) {
            case 0:
            {
                if (Case0.isEmpty() == false)
                {
                Temp = Case0.remove(0);
                }
                break;

            }
            case 1:
            {
                if (Case1.isEmpty() == false)
                {
                Temp = Case1.remove(0);
                }
                break;
            }
            case 2:
            {   
                if (Case2.isEmpty() == false)
                {
                Temp = Case2.remove(0);
                }
                break;
            }
            case 3:
            {
                if (Case3.isEmpty() == false)
                {
                Temp = Case3.remove(0);
                }
                break;
            }
            case 4:
            {
                if (Case4.isEmpty() == false)
                {
                Temp = Case4.remove(0);
                }
                break;
            }
            default:
                Temp = "Error";
                break;
        }  
      return Temp;
    }
    /**
     * Function used to Generate the Random Values contained on the board.
     */    
    private void GenerateVals()
    {
        
        for (int j = 0; j < 5; j++)
        {
        String Total = null;
        int Num = 0; 
        switch (j) {
            case 0:
            {
                int z = 0; 
                while (z < 15)
                {
                Num = Rand.nextInt(15)+1;
                String temp = Integer.toString(Num);
                Total = 'B' + temp;
                
                    if (Case0.contains(Total) == false)
                    {
                        Case0.addElement(Total);
                        z++;
                    }
                }
            break;
            }
            case 1:
            {
                int z = 0; 
                while (z < 15)
                {
                Num = Rand.nextInt(15)+16;
                String temp = Integer.toString(Num);
                Total = 'I' + temp;
                         
                    if (Case1.contains(Total) == false)
                    {
                        Case1.addElement(Total);
                        z++;
                    }
                }
            break;    
            }
            case 2:
            {   
                int z = 0; 
                while (z < 15)
                {
                Num = Rand.nextInt(15)+31;
                String temp = Integer.toString(Num);
                Total = 'N' + temp;
                                         
                    if (Case2.contains(Total) == false)
                    {
                        Case2.addElement(Total);
                        z++;
                    }
                }
            break;
            }
            case 3:
            {
                int z = 0; 
                while (z < 15)
                {
                Num = Rand.nextInt(15)+46;
                String temp = Integer.toString(Num);
                Total = 'G' + temp;
                                                     
                    if (Case3.contains(Total) == false)
                    {
                        Case3.addElement(Total);
                        z++;
                    }
                }
            break;
            }
            case 4:
            {
                int z = 0; 
                while (z < 15)
                {
                Num = Rand.nextInt(15)+61;
                String temp = Integer.toString(Num);
                Total = 'O' + temp;
                                                     
                    if (Case4.contains(Total) == false)
                    {
                        Case4.addElement(Total);
                        z++;
                    }
                }
            break;
            }
            default:
                Total = "Error";
                break;
        }
        }
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
     /**
     * Function used to get all the marked Tiles on the Board.
     * @return ArrayList of Bingo Values that are marked.
     */
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
     /**
     * Function used to check the Board for given BingoVal, and set it to 
     * true.
     * @param BingoVal
     */
    public void CheckCPU(String BingoVal)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if ((this.getTile(i, j)).equals(BingoVal))
                {
                    this.SetTileObject(i, j);
                    TheGui.MarkTileButton(i, j);
                    System.out.println(BingoVal);
                }
            }
        }
    }
    /**
     * Function used to update the Computer Player's board
     */
    public void UpdateCPUBoard()
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int descend = 0;
        int ascend = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (this.GetTileStatus(i, j) == true)
                {
                    if (i == 0)
                    {
                        zero+=1;
                        if (j == 0)
                        {
                            descend+=1;
                        }
                        else if (j == 4)
                        {
                            ascend+=1;
                        }
                    }
                    else if (i == 1)
                    {
                        one+=1;
                        if (j == 1)
                        {
                            descend+=1;
                        }
                        else if (j == 3)
                        {
                            ascend+=1;
                        }
                    }
                    else if (i == 2)
                    {
                        two+=1;
                        if (j == 2)
                        {
                            ascend+=1;
                            descend+=1;
                        }
                    }
                    else if (i == 3)
                    {
                        three+=1;
                        if (j == 1)
                        {
                            ascend+=1;
                        }
                        else if (j == 3)
                        {
                            descend+=1;
                        }
                    }
                    else if (i == 4)
                    {
                        four+=1;
                        if (j == 0)
                        {
                            ascend+=1;
                        }
                        else if (j == 4)
                        {
                            descend+=1;
                        }
                    }
                    
                }
            }
        }
    }
     /**
     * Sets the Game associated with the Card
     * @param ThisGame 
     */
    public void setGame(Game ThisGame)
    {
        this.MyGame = ThisGame;
    }
}
