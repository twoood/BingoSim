

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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




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
    private String CalledValue;
 
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
        this.BoardOne = initBoard(true);
       
        this.PlayerOne = PlayerOne;
        this.PlayerTwo = PlayerTwo;
        this.BingoVictory = false ;
        this.TheFacts = initBingoFact();
        this.TheCaller = new BingoCaller();
        this.CardOne = new String[5][5];
        this.CardTwo = new String[5][5];
        this.GameBoardOne = BoardOne;
        this.GameBoardTwo = BoardTwo;
        
        this.CalledValue= new String();
        Boolean StartGame=initGame();
        
        
        }

    public Board initBoard(Boolean Theme)
    {   Board TheBoard = new Board(Theme);
        TheBoard.setGame(getInstance());
        return TheBoard;
                
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
    displayGui();
     
     /*for (int i = 0; i<5; i++)
     {
         for(int j=0;j<5;j++)
         {
            CardOne[i][j]= GameBoardOne.getTile(i,j);
            CardTwo[i][j]= GameBoardTwo.getTile(i,j);
         }
     }*/
     
    
    
    
     BoardOne.PlayGame();
     BoardTwo.PlayGame();
     
     //while(BingoVictory!=true){
     //displayCaller();
     
     /*while (BingoVictory!=true)
     {
        try{
         BoardOne.PlayGame();
         BoardTwo.PlayGame();
         Thread.sleep(15000);
         //displayCaller();
         //Thread.sleep(5000);*/
         
         
         
        /*for (int i = 0; i<5; i++)
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
         }*/
         
         
         
         
         /*if (PlayerOne.GetPlayerType()== false)
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
         }*/
         
     
     
     //TheFacts.DisplayFact();
     
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
        
        java.util.List<String> TempTrueList = new ArrayList<String>(GameValues);
        java.util.List<String> TempPlayerList = new ArrayList<String>(PlayerValues);
        java.util.List<String> TempPlayerListCheck = new ArrayList<String>(PlayerValues);
        
        TempTrueList.removeAll(PlayerValues);
        
        TempPlayerList.removeAll(GameValues);
        
        if ( TempPlayerList.isEmpty())
        {
            
        if(TheCard.GetTileStatus(0, 0)==true && TheCard.GetTileStatus(0, 1)==true && TheCard.GetTileStatus(0, 2)==true && TheCard.GetTileStatus(0,3)==true
                && TheCard.GetTileStatus(0, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(1, 0)==true && TheCard.GetTileStatus(1, 1)==true && TheCard.GetTileStatus(1, 2)==true && TheCard.GetTileStatus(1,3)==true
                && TheCard.GetTileStatus(1, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(2, 0)==true && TheCard.GetTileStatus(2, 1)==true && TheCard.GetTileStatus(2, 2)==true && TheCard.GetTileStatus(2,3)==true
                && TheCard.GetTileStatus(2, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(3, 0)==true && TheCard.GetTileStatus(3, 1)==true && TheCard.GetTileStatus(3, 2)==true && TheCard.GetTileStatus(3,3)==true
                && TheCard.GetTileStatus(3, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(4, 0)==true && TheCard.GetTileStatus(4, 1)==true && TheCard.GetTileStatus(4, 2)==true && TheCard.GetTileStatus(4,3)==true
                && TheCard.GetTileStatus(4, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 0)==true && TheCard.GetTileStatus(1, 1)==true && TheCard.GetTileStatus(2, 2)==true && TheCard.GetTileStatus(3,3)==true
                && TheCard.GetTileStatus(4, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 0)==true && TheCard.GetTileStatus(1, 0)==true && TheCard.GetTileStatus(2, 0)==true && TheCard.GetTileStatus(3,0)==true
                && TheCard.GetTileStatus(4, 0)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 1)==true && TheCard.GetTileStatus(1, 1)==true && TheCard.GetTileStatus(2, 1)==true && TheCard.GetTileStatus(3,1)==true
                && TheCard.GetTileStatus(4, 1)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 2)==true && TheCard.GetTileStatus(1, 2)==true && TheCard.GetTileStatus(2, 2)==true && TheCard.GetTileStatus(3,2)==true
                && TheCard.GetTileStatus(4, 2)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 3)==true && TheCard.GetTileStatus(1, 3)==true && TheCard.GetTileStatus(2, 3)==true && TheCard.GetTileStatus(3,3)==true
                && TheCard.GetTileStatus(4, 3)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        if(TheCard.GetTileStatus(0, 4)==true && TheCard.GetTileStatus(1, 4)==true && TheCard.GetTileStatus(2, 4)==true && TheCard.GetTileStatus(3,4)==true
                && TheCard.GetTileStatus(4, 4)==true)
        {
            BingoVictory=true;
            TheFacts.DisplayFact();
        }
        displayVictory();
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
    public void displayGui()
    {
     
    JFrame f = new JFrame("Bingo Board");

   Board myboard = BoardOne;
   
   Board testboard = BoardTwo;
   //JPanel VictoryCheck = displayVictory();
   System.out.println("Begin");
   
   /*JPanel use4 = myboard.displayBoard();
   System.out.println("Begin");
   javax.swing.GroupLayout layout = new javax.swing.GroupLayout(use4);
        use4.setLayout(layout);
        // layout settings goes here
        f.setSize(1500, 500);
        f.add(use4);
        f.setVisible(true);
   
  JButton b1 = new JButton(myboard.getTile(0, 0));
   
   b1.setBounds(50, 50, 5, 5);
   
   f.setSize(640, 480);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.add(b1);*/
  
   f.setSize(1500, 500);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   JPanel container = new JPanel();
   container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
   JPanel use1 = myboard.displayBoard();
   JPanel use2 = testboard.displayBoard();
   container.add(use1);
   container.add(use2);
   //container.add(VictoryCheck);
   f.add(container);
   
   f.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
      
    }
    }
    
    public void windowActivated(WindowEvent we) {
        myboard.PlayGame();
        testboard.PlayGame();
        //while (BingoVictory!=true)
        //{
         
         
         
         displayCaller();
         
         if (PlayerTwo.GetPlayerType()==false)
         {
             BoardTwo.CheckCPU(CalledValue);
         }
         
         
         
         
        /*for (int i = 0; i<5; i++)
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
         }*/
         
         
         
         
         /*if (PlayerOne.GetPlayerType()== false)
         {
             PlayerOne.PassValue(CalledValue);
         }
         if (PlayerTwo.GetPlayerType()== false)
         {
            PlayerTwo.PassValue(CalledValue);
         }
         
         
    
         }*/
         //TheFacts.DisplayFact();
    }
         
        
        
        //}
    
   });
     
     
    /* f.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
      
    }
    }
    
    public void windowActivated(WindowEvent e) {
        BoardOne.PlayGame();
        BoardTwo.PlayGame();}

     });*/
    }
             
    public void displayCaller()
    {
        JFrame GenericFrame = new JFrame();
        CalledValue=TheCaller.CallValue();
        JPanel GenericPanel = new JPanel();
        GenericPanel.setLayout(new BoxLayout(GenericPanel, BoxLayout.X_AXIS));

        JButton Call = new JButton("Bingo?");
        GenericFrame.setSize(200,150);
        GenericFrame.setTitle(CalledValue);
           
        
        JLabel BingoVal = new JLabel(CalledValue);
        
        BingoVal.setSize(75,175);
        BingoVal.setFont(new Font("Serif", 1 ,30));
        GenericPanel.add(BingoVal);
        GenericPanel.add(Call);
        GenericFrame.add(GenericPanel);
        GenericFrame.setVisible(true);
        GenericFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener Clicks = (new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == Call)
        {
            CheckBingo(BoardOne);
            CheckBingo(BoardTwo);
        }}});
        Call.addActionListener(Clicks);
        
        
        
    }
    public void displayVictory()
    {
        JFrame GenericFrame = new JFrame();
        String Condition;
        JPanel VictoryPanel = new JPanel();
        VictoryPanel.setLayout(new BoxLayout(VictoryPanel, BoxLayout.X_AXIS));
        
        if (BingoVictory==false)
        {
            Condition = "Keep Playing";
        }
        else 
        {
            Condition = "Victory Reached Click X to Exit";
        }
        
        JLabel VictoryCondition = new JLabel (Condition);
        
        VictoryCondition.setSize(75,175);
        VictoryCondition.setFont(new Font("Serif",1,30));
        VictoryPanel.add(VictoryCondition);
        GenericFrame.add(VictoryPanel);
        GenericFrame.setSize(200,150);
        GenericFrame.setVisible(true);
        GenericFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //return VictoryPanel;
    }
    
        
        
         
        
        
    }
        
        
        
    


    

