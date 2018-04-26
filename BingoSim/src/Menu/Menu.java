
/**
 * @author Venika Gaur
 * @since 4/16/18
 *This is the menu class in Menu package that creates the menu gui for the selection 
 *of the players and the theme and then passes that data to the Game class in Game package
 */

package Menu;
import Game.*;
import java.awt.*;


public class Menu extends javax.swing.JFrame {

   // private Board Myboard;
    int NumberOfPlayers;
    Boolean Theme=true;
    
   
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        this.getContentPane().setBackground(Color.pink);
    }

/**
*Declaring labels and buttons to display on screen
*@param menulb for the word Menu displayed on the top of the screen
*@param themelb for the word Theme displayed on the screen
*@param Darkthm for the dark theme radio button
*@param Lightthm for the light theme radio button
*@param playerlb for the word Theme displayed on the screen
*@param Oneplay for the one player radio button
*@param Twoplay for the two player radio button      
*@param begingame for starting the game and passing all the data selected to the game package
*@param exitbtn for exiting the game
*/
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        menulb = new javax.swing.JLabel();
        themelb = new javax.swing.JLabel();
        Darkthm = new javax.swing.JRadioButton();
        Lightthm = new javax.swing.JRadioButton();
        playerlb = new javax.swing.JLabel();
        Oneplay = new javax.swing.JRadioButton();
        Twoplay = new javax.swing.JRadioButton();
        begingame = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menulb.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        menulb.setForeground(new java.awt.Color(255, 255, 255));
        menulb.setText("Menu");

        themelb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        themelb.setForeground(new java.awt.Color(255, 255, 255));
        themelb.setText("THEME");

        Darkthm.setText("DARK THEME");
        
        Darkthm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkthmActionPerformed(evt);
            }
        });

        Lightthm.setText("LIGHT THEME");
        Lightthm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LightthmActionPerformed(evt);
            }
        });

        playerlb.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        playerlb.setForeground(new java.awt.Color(255, 255, 255));
        playerlb.setText("PLAYER");

        Oneplay.setText("ONE PLAYER");
        Oneplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneplayActionPerformed(evt);
            }
        });

        Twoplay.setText("TWO PLAYER");
        Twoplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoplayActionPerformed(evt);
            }
        });

        begingame.setText("BEGIN");
        begingame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                begingameActionPerformed(evt);
            }
        });

        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Darkthm)
                        .addGap(58, 58, 58)
                        .addComponent(Lightthm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(begingame)
                            .addComponent(Oneplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Twoplay)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(menulb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(themelb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(playerlb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menulb)
                .addGap(18, 18, 18)
                .addComponent(themelb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lightthm)
                    .addComponent(Darkthm))
                .addGap(18, 18, 18)
                .addComponent(playerlb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Twoplay)
                    .addComponent(Oneplay))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(begingame)
                    .addComponent(exitbtn))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
                                    

    //This is for setting a one player game
    private void OneplayActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (Oneplay.isSelected())
            Twoplay.setSelected(false);
            
    }                                       

    // This is for setting a two player game
    private void TwoplayActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
         if (Twoplay.isSelected())
            Oneplay.setSelected(false);
    }                                       

    // This is for exiting the game
    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
    }                                       

    //This is for selecting Dark Theme
    private void DarkthmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (Darkthm.isSelected()){
            Lightthm.setSelected(false);
        }
    }  
  
        //This is for selecting Light Theme
    private void LightthmActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (Lightthm.isSelected())
            Darkthm.setSelected(false);
    }                                        

    /**
    *This button will send in all the selected information to other classes
    *@return playerOne if One player game is selected
    *@return playerTwo if Two player game is selected
    *@return Theme
    */
    private void begingameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
      if (Lightthm.isSelected()){
          Theme=false;
      }
          
          
      else if (Darkthm.isSelected()){
          Theme=true;
      }
      
      if (Oneplay.isSelected()){
          NumberOfPlayers=1;
           Player playerOne= new Player(1);
           Player playerTwo = new Player(0);
          Game play= new Game(playerOne,playerTwo,Theme);
          this.setVisible(false);
      }
       
      else if (Twoplay.isSelected()){
          NumberOfPlayers=2;
          Player playerOne= new Player(2);
          Player playerTwo = new Player(1);
          Game play= new Game(playerOne,playerTwo,Theme);
          this.setVisible(false);
         
      }
        
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JRadioButton Darkthm;
    private javax.swing.JRadioButton Lightthm;
    private javax.swing.JRadioButton Oneplay;
    private javax.swing.JRadioButton Twoplay;
    private javax.swing.JButton begingame;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel menulb;
    private javax.swing.JLabel playerlb;
    private javax.swing.JLabel themelb;
    // End of variables declaration                   
}
