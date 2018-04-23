/*
 * This is the Player class which keeps track of the boards for a player playing Bingo.
 */
package Menu;

/**
 * Author: Sara Lively
 * A-Number: A25227626
 * This is a class for keeping track of the behavior of each player in a Bingo game.
 */
public class Player 
{
    
    private boolean Player;
    private Board MyBoard;
    
    /**
     * Constructs a Player object that can play a game of Bingo
     *  @param NumberOfPlayers
     */
    
    public Player(int NumberOfPlayers)
    {
        if( NumberOfPlayers >=1 )      // Do we have 1 or more players?
        {
            Player = true;                      // This means that the player is a human.
        }
        else                                         // We have less than one player...computer player.
        {
            Player = false;                     // This means that the player is a computer player.
        }
        
    }

    /**
     * Give the type of Player that this player is, human or computer.
     * 
     * @return Player
     */

    public boolean GetPlayerType()
    {
        return Player;
    }

    /**
     * Gets the type of board a player selected, dark or light, and the number of human players.
     */

    public void SetBoard(Board PlayerBoard)
    {
        MyBoard = PlayerBoard;
    }
    
    /**
     * If player is a computer it will set values on its card if they are there and it will call bingo if the
     * chance presents itself.
     * @param Value 
     */
    
    public void PassValue(String Value)
    {
        if( Player = false )
        {
            MyBoard.CheckCPU(Value);
            MyBoard.UpdateCPUBoard();
        }
        else
        {
            GetPlayerType();
        }
    }
}
