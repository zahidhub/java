import java.util.Scanner;

public class PrintMovies {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String[] movies;
        int movieNum;

        System.out.println("How many movie you want to store?: ");
        movieNum = userInput.nextInt();
        userInput.nextLine();

        movies = new String[movieNum];

        for(int i = 0; i < movieNum; i++){
            System.out.println("Enter the name of movie number" + (i+1) + ": ");
            movies[i] = userInput.nextLine();
        }

        System.out.println("\nYour favourite movies are: ");
        for(String favMovies : movies){
            System.out.println(favMovies);
        }

        userInput.close();

    }
    
}
