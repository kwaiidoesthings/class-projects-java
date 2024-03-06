import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {

/* randomly generates a number 1 to 3 to symbolize the code choosing rock, paper, or scissors. */
public static int pcDetermine() {
Random rand = new Random();
    int computer_RPS = rand.nextInt(3) + 1;
        return computer_RPS;
}

/* Compares users choice to computers choice and determines a winner using a switch, in the case of a tie
 * returns true to replay the game. if for some reason the user enters something that isnt rock paper or scissors, it defaults to sending an error message.
 */
public static String compare(int numVer_User_RPS, int computer_RPS, boolean tieReplay) {

switch (numVer_User_RPS) {
    case 1:
        if (computer_RPS == 2) {
            return "Paper wraps rock. Computer wins!";
        }
        else if (computer_RPS == 3) {
            return "The rock smashes the scissors. User wins!";
        }
        else {
            tieReplay = true;
            return "Tie Replay.";
        }

    case 2:
        if (computer_RPS == 1) {
            return "Paper wraps rock. User Wins!";
        }
        else if (computer_RPS == 3) {
            return "Scissors cuts paper. Computer wins!";
        }
        else {
            tieReplay = true;
            return "Tie! Replay.";
        }

    case 3:
        if (computer_RPS == 1) {
            return "The rock smashes the scissors. Computer Wins!";
        }
        else if (computer_RPS == 2) {
            return "Scissors cuts paper. User Wins!";
        }
        else {
            tieReplay = true;
            return "Tie! Replay.";
        }
    default:
        return "Error! Not a valid input";
    }
}

/* first defines the variable used for comparison, then converts the user input into lowercase, 
after determines which object the user chose and returns the number version of it to send to the compare method*/
public static int userConvert(String user_RPS) {
int numVer_User_RPS = 0;
String user_lowercase = user_RPS.toLowerCase();
    if (user_lowercase.equals("rock")) {
        numVer_User_RPS = 1;
    } 
    else if (user_lowercase.equals("paper")) {
        numVer_User_RPS = 2;
    } 
    else if (user_lowercase.equals("scissors")) {
        numVer_User_RPS = 3;
    }
    return numVer_User_RPS;
}


/*asks for user input and ends to each  */
public static void main(String[] args) {
String user_RPS;

Scanner input = new Scanner(System.in);
    System.out.print("Choose Rock, Paper, or Scissors: ");
        user_RPS = input.nextLine();

        int userChoice = userConvert(user_RPS);
        int computerChoice = pcDetermine();
        boolean tieReplay = true;

/* while tiereplay is true the code chekcs if it as a tie and repeats game if it was. */
while (tieReplay) {
    String result = compare(userChoice, computerChoice, tieReplay);
    System.out.println(result);

    if (result.equals("Tie Replay.")) {
        System.out.print("Choose Rock, Paper, or Scissors: ");
        user_RPS = input.nextLine();
            computerChoice = pcDetermine();
            userChoice = userConvert(user_RPS);
        } 
        else {
            tieReplay = false;
        }
    }

    input.close();
}}
