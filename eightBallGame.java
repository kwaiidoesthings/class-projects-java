import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class eightBallGame {
    public void questionResponse(ArrayList<String> responses) {
        Random rand = new Random();
        int randomAnswerIndex = rand.nextInt(responses.size());
        String randomAnswer = responses.get(randomAnswerIndex);
        System.out.println("Magic 8-Ball says: " + randomAnswer);
    }

    public static void main(String[] args) {
        eightBallGame game = new eightBallGame();
        ArrayList<String> responses = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        // Load responses from file
        try {
            File file = new File("8_ball_responses.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String response = sc.nextLine();
                responses.add(response);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: 8_ball_responses.txt");
            return; // Exit the program if file not found
        }

        // Prompt the user for a question
        System.out.print("Ask a question: ");
        String question = input.nextLine();

        // Provide a random response
        game.questionResponse(responses);
    }
}
