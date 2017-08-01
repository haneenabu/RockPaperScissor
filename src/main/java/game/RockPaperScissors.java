package game;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissors {
    public String findWinner (String one, String two){
        String result = null;
        if((one.equals("rock")&&two.equals("rock")) || (one.equals("paper")&&two.equals("paper")) || (one.equals("scissor")&&two.equals("scissor"))){
            result = "tie";
        }else if (one.equals("paper")&&two.equals("rock") || two.equals("paper")&&one.equals("rock")){
            result = "paper wins";
        }else if (one.equals("rock")&&two.equals("scissor") || two.equals("rock")&&one.equals("scissor")){
            result = "rock wins";
        }else if (one.equals("scissor")&&two.equals("paper") || two.equals("scissor")&&one.equals("paper")){
            result = "scissor wins";
        }

        return result;
    }
}
