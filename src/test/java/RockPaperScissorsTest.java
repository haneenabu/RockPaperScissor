import game.RockPaperScissors;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissorsTest {
    @Test
    public void findWinner_returnWinner_RockTie() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testGame.findWinner("rock", "rock"));
    }
    @Test
    public void findWinner_returnWinner_PaperTie() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testGame.findWinner("paper", "paper"));
    }
    @Test
    public void findWinner_returnWinner_ScissorTie() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testGame.findWinner("scissor", "scissor"));
    }
    @Test
    public void findWinner_returnWinner_PaperWins() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "paper wins";
        assertEquals(expected, testGame.findWinner("paper", "rock"));
    }
    @Test
    public void findWinner_returnWinner_RockWins() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "rock wins";
        assertEquals(expected, testGame.findWinner("scissor", "rock"));
    }
    @Test
    public void findWinner_returnWinner_ScissorWins() throws Exception{
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "scissor wins";
        assertEquals(expected, testGame.findWinner("scissor", "paper"));
    }
}