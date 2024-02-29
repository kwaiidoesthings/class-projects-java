import java.util.Scanner;

public class testavggrade {

public static void main(String[] args) {
    int[] score = new int[5];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++){
        System.out.print("Enter Score " + (i + 1) + ": ");
        score[i] = input.nextInt();
    }}}