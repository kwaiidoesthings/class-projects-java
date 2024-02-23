//Jason Sacerio COP2800
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//class header
public class uppercaseFile {
    public static void main(String[] args) {
    // try block that asks user for file directory of file to read and name of the output file and turns input into capitalized letters
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file directory: ");
            String inputFileName = input.nextLine();
    
            System.out.print("Enter desired name for output: ");
    // concatenates output file with .txt to make it a .txt file 
            String outputName = input.nextLine() + ".txt";

            File inputFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputName);

        // while loop that receives input from .txt file, converts it to a string and then converts the string to upper case letters. then sends the output to the .txt file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                writer.println(line.toUpperCase()); 
            }
        // avoids memory leaks
            input.close();
            fileScanner.close();
            writer.close();
        }
    // catch block checks for error
         catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.print("Done!");
    }
}