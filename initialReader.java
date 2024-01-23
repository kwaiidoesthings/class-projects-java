// the header and method header
public class initialReader {

    public static void main(String[] args) {

// variables for names
    String firstName, middleName, lastName;

// initiallizing name variables
    firstName = "Jason";
    middleName = "Doe";
    lastName = "Sacerio";
    
// getting initials and storing them into variable positionInitial
char firstInitial = firstName.charAt(0);
char middleInitial = middleName.charAt(0);
char lastInitial = lastName.charAt(0);

// printing out the names and initials using formatting to output
System.out.printf("%s %s %s %n", firstName, middleName, lastName);
System.out.printf("%c %c %c %n", firstInitial, middleInitial, lastInitial);
    }
}

// if you run this in repl change the header to Main (self-note)
