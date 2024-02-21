//Jason Sacerio COP2800
import java.util.Random;
import java.util.Scanner;

// class header
public class randnumguess {

public static void main(String[] args) {
    
    Random rand = new Random();
    int randomNum = rand.nextInt((100 - 1) + 1);

    Scanner input = new Scanner(System.in);
    while(true){
        System.out.printf(" Guess a Number: ", "\n");
        int num = input.nextInt();
      
    if(num > randomNum){
            System.out.printf("Too high, try again.", "\n");
    }
    else if(num < randomNum){
            System.out.printf("Too low, try again. ", "\n");
    }
    else{
            System.out.printf("You won!", "\n");
            break;
    }
    
    }
    input.close();
}}
