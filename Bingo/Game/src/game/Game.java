

/**
 *
 * @author mckinney
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.*;




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
    private Boolean BoardTheme;

    private Boolean BingoVictory;
    private BingoFact TheFacts;
    private BingoCaller TheCaller;
    private Board BoardOne;
    private Board BoardTwo;
 
    /**
     * Constructor that creates a Game. 
     *
     * The constructor instantiates several of the objects needed for a game
     * icluding Bingo Fact, The Boards, The players, and the Bingo Caller
     * @param Theme 
     * @param NumberOfHumanPlayers
     */
    public Game(Boolean Theme, Player PlayerOne, Player PlayerTwo)
    {
        this.BoardTheme = Theme;
        this.BoardTwo = initBoard(Theme);
        this.BoardOne = initBoard(Theme);
       
        this.PlayerOne = PlayerOne;
        this.PlayerTwo = PlayerTwo;
        this.BingoVictory = false ;
        this.TheFacts = initBingoFact();
        this.TheCaller = initBingoCaller();
        
        initGame();
        
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
    public void initGame()
    {
        
    Timer TheTimer = new Timer();
    
    
     BoardOne.PlayGame();
     BoardTwo.PlayGame();
     TheCaller.CallValue();
     
     while (BingoVictory!=true)
     {
         TheTimer.schedule(TheCaller.CallValue(),10000);
     }
     
     TheFacts.DisplayBingoFact();
     
     
    }
    public Boolean CheckBingo(Board TheCard)
    {
        ArrayList <String> CalledValues = TheCaller.GetValuesCalled();
        ArrayList <String> PlayerCalledValues = TheCard.GetMarked();
        
        Collection<String> GameValues = CalledValues;
        Collection<String> PlayerValues = PlayerCalledValues;
        
        List<String> TempTrueList = new ArrayList<String>(GameValues);
        List<String> TempPlayerList = new ArrayList<String>(PlayerValues);
        
        TempTrueList.removeAll(PlayerValues);
        TempPlayerList.removeAll(GameValues);
        
        if ( TempPlayerList.isEmpty())
        {
            BingoVictory = true;
            return true;
        }
        else
        {
            return false;
        }
        
    }
    /**
     * Function used to determine the result of a Bingo Call
     * Bool.
     * @return Boolean with validity of call
     */
    public BingoCaller initBingoCaller()
    {
        
        return new BingoCaller();
        
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
}
    

