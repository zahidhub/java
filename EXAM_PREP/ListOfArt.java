package EXAM_PREP;

import java.util.Scanner;

public class ListOfArt {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        String fName1;
        String lName1;
        String fName2;
        String lName2;
        String fName3;
        String lName3;


        System.out.println("Enter your 1st artist First Name: ");
        fName1 = userInput.nextLine();
        System.out.println("Enter your 1st artist Last Name: ");
        lName1 = userInput.nextLine();

        System.out.println("Enter your 2nd artist First Name: ");
        fName2 = userInput.nextLine();
        System.out.println("Enter your 2nd artist Last Name: ");
        lName2 = userInput.nextLine();

        System.out.println("Enter your 3rd artist First Name: ");
        fName3 = userInput.nextLine();
        System.out.println("Enter your 3rd artist Last Name: ");
        lName3 = userInput.nextLine();

        System.err.printf("%0.8S, %s %n", lName1, fName1);


        userInput.close();
    }
}
