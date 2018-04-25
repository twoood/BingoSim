/*
 * Called when a BINGO is successfully called, rewards winner with a BINGO Fact!
 */
package Game;
import java.util.Random;
import java.util.Vector;
/**
 * Author: Sara Lively
 * A-Number: A25227626
 * This is a class is for when a player successfully calls BINGO. they are rewarded with a BINGO Fact!
 */
public class BingoFact 
{

    private Vector<String> BingoFacts = new Vector<String>(10, 2);
    private String Fact;
    private final String FactOne = "Bingo cards were first used by the Germans in 1800s as an educational tool designed to help the students learn multiplication tables easily.";
    private final String FactTwo = "Bingo cards in UK are also called 'Housie'.";
    private final String FactThree = "US bingo cards have 5x5 squares while UK bingo cards have 3 rows and 9 columns.";
    private final String FactFour = "In a standard bingo card, a player can come up with 1,474,200 different winning combinations.";
    private final String FactFive = "Bingo was introduced way back in the 1930's and back then they played around 10,000 games of bingo every day throughouth the Us, UK, and rest of the world.";
    private final String FactSix = "How long does the average bingo game last for? Usually, bingo games last for about 3-6 minutes. That means you have a shot of hitting the jackpot every 5 minutes roughly.";
    
    /**
     * This creates an instance of BingoFact which can display a fact to the user after
     * winning a game of BINGO.
     */

    public BingoFact()
    {
        BingoFacts.add(FactOne);
        BingoFacts.add(FactTwo);
        BingoFacts.add(FactThree);
        BingoFacts.add(FactFour);
        BingoFacts.add(FactFive);
        BingoFacts.add(FactSix);
    }

    /**
     *This will display the BINGO Fact. 
     */

    public void DisplayFact()
    {
        int rnd = new Random().nextInt(BingoFacts.size());
        Fact = BingoFacts.get(rnd);
        BingoFactGUI Gui = new BingoFactGUI(Fact);
    }
    
}
