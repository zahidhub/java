package EXAM_PREP;

import java.util.Scanner; // importing the scanner

public class ListOfArt {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in); // crating the scanner file

        String fName1; //declaring variable
        String lName1; //declaring variable
        String fName2; //declaring variable
        String lName2; //declaring variable
        String fName3; //declaring variable
        String lName3; //declaring variable

        System.out.println("Enter your 1st artist First Name: ");  // printlne foe the user
        fName1 = userInput.nextLine(); //store the name of the artist
        System.out.println("Enter your 1st artist Last Name: "); // printlne foe the user
        lName1 = userInput.nextLine(); //store the name of the artist

        System.out.println("Enter your 2nd artist First Name: "); // printlne foe the user
        fName2 = userInput.nextLine(); //store the name of the artist
        System.out.println("Enter your 2nd artist Last Name: "); // printlne foe the user
        lName2 = userInput.nextLine(); //store the name of the artist

        System.out.println("Enter your 3rd artist First Name: "); // printlne foe the user
        fName3 = userInput.nextLine(); //store the name of the artist
        System.out.println("Enter your 3rd artist Last Name: "); // printlne foe the user
        lName3 = userInput.nextLine(); //store the name of the artist

        System.err.printf("%8.8S, %s %n", lName1, fName1); // print the artist names in format
        System.err.printf("%8.8S, %s %n", lName2, fName2); // print the artist names in format
        System.err.printf("%8.8S, %s %n", lName3, fName3); // print the artist names in format

        userInput.close(); // close the scanner
    }
}
