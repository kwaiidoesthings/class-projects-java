import java.util.Scanner;

public class testavggrade {

/* uses a for loop to calculate the total sum of array score and then declares average that calculates and returns average */
public static int calcAverage(int[] score){
int sum = 0;
for (int i = 0; i < 5; i++){
     sum += score[i];
}
int average = sum / 5;
    return average;
}

/* determines letter grade for each number in array score and appends it to array grade. */
public static char[] determineGrade(int[] score){
char[] grade = new char[score.length];
for (int i = 0; i < score.length; i++){
    if (score[i] < 60){
        grade[i] = 'F';
    }
    else if (score[i] < 70){
        grade[i] = 'D';
    }
    else if (score[i] < 80){    
        grade[i] = 'C';
    }
    else if (score[i] < 90){
        grade[i] = 'B';
    }
    else if (score[i] < 101){    
        grade[i] = 'A';
    }
}

return grade;
}

/* creates an array that can hold 6 numbers, has a for loop that asks the user for 5 numbers, 
then runs calcAverage to find the average of the 5 numbers, appending average to array score. 
calls determineGrade to determine the letter grade of each score, including average
for loop to print out the grade score and corresponding letter, then print average and the letter grade */
public static void main(String[] args) {
int[] score = new int[6];

Scanner input = new Scanner(System.in);
for (int i = 0; i < 5; i++){
    System.out.print("Enter Score " + (i + 1) + ": ");
        score[i] = input.nextInt();
}

int average = calcAverage(score);
    score[5] = average;
char[] grade = determineGrade(score);

for (int i = 0; i < 5; i++){
    System.out.println("Grade " + (i + 1) + ": " + score[i] + " " + grade[i]);
}

System.out.println("Average Grade: " + average + " " + grade[5]);

input.close();
}}


