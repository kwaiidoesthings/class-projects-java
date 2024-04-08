// COP2800 JASON SACERIO
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class eightBallGame {

    /*
     * calls loadResponsesFromFile method to put files in arrayList, then asks user to say a question, after getting a random response, user
     * is asked whether to play again, if not, system prints goodbye and ends.
     */
    public static void main(String[] args) {
        eightBallGame game = new eightBallGame();
        ArrayList<String> responses = game.loadResponsesFromFile("8_ball_responses.txt");

        Scanner input = new Scanner(System.in);
        String playAgain = "yes";
        boolean checkIfError = true;
        while(checkIfError = true){
            if (playAgain.equalsIgnoreCase("yes")) {
                System.out.print("Ask a question: ");
                String question = input.nextLine();
    
                game.questionResponse(responses);
    
                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = input.nextLine();
                checkIfError = false;
            }
            else if (playAgain.equalsIgnoreCase("no")){
            input.close();
            System.out.print("Goodbye!");
            checkIfError = false;
            }
            else{
                System.out.print("Error! Repeat");
            }
        }
    }
    
/*
 * This method takes the arraylist from loadResponsesFromFile to generate a random response
 * @param responses - takes arraylist responses
 * @return print - prints out a random answer to the question
 */
    public void questionResponse(ArrayList<String> responses) {
        Random rand = new Random();
        int randomAnswerIndex = rand.nextInt(responses.size());
        String randomAnswer = responses.get(randomAnswerIndex);
        System.out.println("Magic 8-Ball says: " + randomAnswer);
    }
/*
 * This method takes the file and puts all possible responses in the array
 * @return responses - an arraylist of the responses
 * @param fileName - takes in file name from main to read the file
 */
    public ArrayList<String> loadResponsesFromFile(String fileName) {
        ArrayList<String> responses = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String response = sc.nextLine();
                responses.add(response);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return responses;
    }
}
