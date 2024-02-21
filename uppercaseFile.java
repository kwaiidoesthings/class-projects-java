import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class uppercaseFile {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the file directory: ");
            Scanner scanner = new Scanner(System.in);
            String inputFileName = scanner.nextLine();
           

            File inputFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(inputFile);

            PrintWriter writer = new PrintWriter("output.txt");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line); 
                writer.println(line.toUpperCase()); 
            }
            scanner.close();
            fileScanner.close();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}