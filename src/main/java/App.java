/**
 * Created by Guest on 8/1/17.
 */
import game.RockPaperScissors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Player 1: Enter your first move");
        try {
            String userOneInput = bufferedReader.readLine();
            System.out.println("Player 2: Enter your first move");
            String userTwoInput = bufferedReader.readLine();
            RockPaperScissors gameOne = new RockPaperScissors();
            String result = gameOne.findWinner(userOneInput,userTwoInput);
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
