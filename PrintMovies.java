import java.util.Scanner; // importing scanner

public class PrintMovies {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in); // creating scanner object

        String[] movies; // declaring string array
        int movieNum; // decalring varibale to store movie number

        System.out.println("How many movie you want to store?: "); // print line for user
        movieNum = userInput.nextInt(); // reads the int and stores in the variable
        userInput.nextLine(); // clears the buffer

        movies = new String[movieNum]; // initializing the movie string array

        for(int i = 0; i < movieNum; i++){ // itirating through the movie array
            System.out.println("Enter the name of movie number" + (i+1) + ": "); // print line for the user
            movies[i] = userInput.nextLine(); // storing the movie name in the array
        }

        System.out.println("\nYour favourite movies are: "); // print line for user
        for(String favMovies : movies){ // itirating through the movies array
            System.out.println(favMovies); // printing out the movies
        }

        userInput.close(); // closing the scanner

    }
    
}
