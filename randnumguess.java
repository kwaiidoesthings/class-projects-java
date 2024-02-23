//Jason Sacerio COP2800
import java.util.Random;
import java.util.Scanner;

// class header
public class randnumguess {

public static void main(String[] args) {
// creates a random number and saves it to randomNum
    Random rand = new Random();
    int randomNum = rand.nextInt((100 - 1) + 1);

    Scanner input = new Scanner(System.in);

// while loop to repeat guessing until the user wins
    while(true){
        System.out.printf("Guess a Number: ", "\n");
        int num = input.nextInt();

// if else statement determining if its too high, too low, or if the user won the game
    if(num > randomNum){
            System.out.printf("Too high, try again. %n", "\n");
    }
    else if(num < randomNum){
            System.out.printf("Too low, try again. %n", "\n");
    }
    else{
            System.out.printf("You won!", "\n");
            break;
    }
    
    }
    input.close();
}}
