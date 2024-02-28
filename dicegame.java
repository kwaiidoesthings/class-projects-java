//Jason Sacerio COP2800
import java.util.Random;

// class header
public class dicegame {

/* a simple method that outputs results based on score of game. prints the score for each participant along with amount of ties, 
then uses if statement to determine which participant won the the game entirely or if it was a tie. */ 

static void gameResult(int player_score, int computer_score, int tie_score){
    
System.out.println("Player has a score of " + player_score);
System.out.println("Computer has a score of " + computer_score);
System.out.println("There were " + tie_score + " ties");

if(player_score > computer_score){
    System.out.println("Player Won!");
}
else if(player_score < computer_score){
    System.out.println("Computer Won!");
}
else{
    System.out.println("It was a tie!");
}
}

public static void main(String[] args) {
// calling Random and defining score tracking variables
    Random rand = new Random();
    int player_score = 0, computer_score = 0, tie_score = 0;

/* for loop that runs 10 times, generates random number 1-6 and determines which participant won the round then adds a point to a score variable, 
if its a tie the program will add a point to the tie variable */ 
    for (int i = 0; i < 10; i++){
        int computer_dice = rand.nextInt(6) + 1;
        int player_dice = rand.nextInt(6) + 1;
    
        if(player_dice > computer_dice){
            player_score += 1;
        }
        else if(player_dice < computer_dice){
            computer_score += 1;
        }
        else{ 
            tie_score += 1;
        }
    }
// calls gameresult method to produce results for output
gameResult(player_score, computer_score, tie_score);

}}