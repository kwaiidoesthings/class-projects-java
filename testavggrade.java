import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class testavggrade {

static int calcAverage(int[] score){
    int sum = 0;
for (int i = 0; i < 5; i++){
     sum += score[i];
}
int average = sum / 5;
return average;
}

public static char[] determineGrade(int[] score){
    char[] grade = new char[score.length];
for (int i = 0; i < score.length; i++){
if (score[i] < 60){
    grade[i] = 'F';}
else if (score[i] < 70){
    grade[i] = 'D';}
else if (score[i] < 80){    
    grade[i] = 'C';}
else if (score[i] < 90){
    grade[i] = 'B';}
else if (score[i] < 101){    
    grade[i] = 'A';}
}

return grade;
}
public static void main(String[] args) {
    int[] score = new int[6];
    Scanner input = new Scanner(System.in);

for (int i = 0; i < 5; i++){
    System.out.print("Enter Score " + (i + 1) + ": ");
    score[i] = input.nextInt();
}
int average = calcAverage(Arrays.copyOf(score, 5));
score[5] = average;
char[] grade = determineGrade(score);
char[] gradeofScore = Arrays.copyOfRange(grade, 0, 5);


for (int i = 0; i < gradeofScore.length; i++){
System.out.println("Grade " + (i + 1) + ": " + score[i] + " " + gradeofScore[i]);
}
System.out.println("Average Grade: " + calcAverage(score) + " " + grade[5]);

input.close();
}}

/*problem: formatting average */