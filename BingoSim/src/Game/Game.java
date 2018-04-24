

/**
 *
 * @author mckinney
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.*;
import javax.swing.*;
import Menu.Player;




/**
 *
 * @author Coner McKinney
 * The Game class represents the primary manager of the game itself that
 * will spawn the BingoCaller, the Boards, Players, and Facts as well as check
 * the validity of any Bingo Called
 */
public class Game
{
    
    private Player PlayerOne;
    private Player PlayerTwo;
    

    private Boolean BingoVictory;
    private BingoFact TheFacts;
    private BingoCaller TheCaller;
    private Board BoardOne;
    private Board BoardTwo;
    private String[][] CardOne;
    private String[][] CardTwo;
    private Board GameBoardOne;
    private Board GameBoardTwo;
 
    /**
     * Constructor that creates a Game. 
     *
     * The constructor instantiates several of the objects needed for a game
     * icluding Bingo Fact, The Boards, The players, and the Bingo Caller
     * @param PlayerOne
     * @param PlayerTwo
     */
    public Game(Player PlayerOne, Player PlayerTwo)
    {
        
        this.BoardTwo = initBoard(true);
        this.BoardOne = new Board(true);
       
        this.PlayerOne = PlayerOne;
        this.PlayerTwo = PlayerTwo;
        this.BingoVictory = false ;
        this.TheFacts = initBingoFact();
        this.TheCaller = new BingoCaller();
        this.CardOne = new String[5][5];
        this.CardTwo = new String[5][5];
        this.GameBoardOne = BoardOne;
        this.GameBoardTwo = BoardTwo;
        
        Boolean StartGame=initGame();
        
        
        }

    public Board initBoard(Boolean Theme)
    {
        return new Board(Theme);
                
    }
    
    
    public Player GetPlayerOne()
    {
        Player TempPlayer = PlayerOne;
        return TempPlayer;
    }
    public Player GetPlayerTwo()
    {
        Player TempPlayer = PlayerTwo;
        return TempPlayer;
    }
    public Board GetBoardOne()
    {
        Board TempBoard = BoardOne;
        return TempBoard;
    }
    public Board GetBoardTwo()
    {
        Board TempBoard = BoardTwo;
        return TempBoard;
    }
    /**
     * Returns 
     * 
     * @param None
     * @return 
     */
    public Boolean initGame()
    {
      initGui();
     
     for (int i = 0; i<5; i++)
     {
         for(int j=0;j<5;j++)
         {
            CardOne[i][j]= GameBoardOne.getTile(i,j);
            CardTwo[i][j]= GameBoardTwo.getTile(i,j);
         }
     }
     
    
    
     BoardOne.PlayGame();
     BoardTwo.PlayGame();
     
     
     while (BingoVictory!=true)
     {
         try{
         BoardOne.PlayGame();
         BoardTwo.PlayGame();
         Thread.sleep(10000);
         
         String CalledValue = TheCaller.CallValue();
         
        for (int i = 0; i<5; i++)
         {
         for(int j=0;j<5;j++)
         {
            if (CardOne[i][j]== CalledValue)
            {
                GameBoardOne.SetTileObject(i, j);
            }
            if (CardTwo [i][j]== CalledValue)
            {
                GameBoardOne.SetTileObject(i,j);
            }
         }
         }
         
         
         
         
         if (PlayerOne.GetPlayerType()== false)
         {
             PlayerOne.PassValue(CalledValue);
         }
         if (PlayerTwo.GetPlayerType()== false)
         {
            PlayerTwo.PassValue(CalledValue);
         }
         
         
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
         }
     
     
     TheFacts.DisplayFact();
     
     return true;
    }
    /**
     * This Function is the primary controller of the game and sets the user 
     * displays as well as calls a bingo value every 10 seconds
     * @param TheCard
     * @return void
     */
    public void CheckBingo(Board TheCard)
    {
        ArrayList <String> CalledValues = TheCaller.GetValuesCalled();
        ArrayList <String> PlayerCalledValues = TheCard.GetMarked();
        
        Collection<String> GameValues = CalledValues;
        Collection<String> PlayerValues = PlayerCalledValues;
        
        List<String> TempTrueList = new ArrayList<String>(GameValues);
        List<String> TempPlayerList = new ArrayList<String>(PlayerValues);
        List<String> TempPlayerListCheck = new ArrayList<String>(PlayerValues);
        
        TempTrueList.removeAll(PlayerValues);
        
        TempPlayerList.removeAll(GameValues);
        
        if ( TempPlayerList.isEmpty())
        {
            int Tracker;
            int TrackerTwo;
        for (int k=0; k<5;k++)
        {
            Tracker=0;
           for (int i = 0; i<5; i++)
          {
            
            
         
            if(TheCard.GetTileStatus(k,i)==true)
            {
                Tracker++;
            }
            
            }
           if (Tracker==5)
           {
               BingoVictory= true;
           }
           
        }
        int k=0;
        int i=0;
        TrackerTwo=0;
        while (k<5)
        {
           if(TheCard.GetTileStatus(k,i)==true)
           {
               TrackerTwo++;
           }
           k++;
           i++;
        }
        if (TrackerTwo==5)
        {
            BingoVictory = true;
            
        }
        
        
    }
    }
   
    
   
    /**
     * Function used to Initialize the Bingo Caller
     * @return a BingoCaller object
     */
    public BingoFact initBingoFact()
    {
        return new BingoFact();
    }
    /**
     * Function used to initialize the BingoFact.
     * 
     * @return a BingoFact object 
     */
    public Game getInstance()
    {
        Game TempGame = this;
        return TempGame;
    }
    public void initGui()
    {
     JPanel BoardGuiOne = BoardOne.displayBoard();
     JPanel BoardGuiTwo = BoardTwo.displayBoard();
     
     JFrame f = new JFrame("Bingo Board");
     
     f.setSize(1500,500);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JPanel container = new JPanel();
     container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
     container.add(BoardGuiOne);
     container.add(BoardGuiTwo);
     f.add(container); 
    }
}
    

