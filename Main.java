import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDirector: " + director + "\nRelease Year: " + releaseYear + "\n";
    }
}

public class Main {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<Movie> registeredMovies = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Movie[] predefinedNolanMovies = {
            new Movie("Inception", "Christopher Nolan", 2010),
            new Movie("Interstellar", "Christopher Nolan", 2014),
            new Movie("The Dark Knight", "Christopher Nolan", 2008),
            new Movie("Dunkirk", "Christopher Nolan", 2017),
            new Movie("Memento", "Christopher Nolan", 2000),
            new Movie("Tenet", "Christopher Nolan", 2020),
            new Movie("Openheimer", "Christopher Nolan", 2023)
        };

        Movie[] predefinedMarvelMovies = {
            new Movie("Iron Man", "Jon Favreau", 2008),
            new Movie("The Avengers", "Joss Whedon", 2012),
            new Movie("Black Panther", "Ryan Coogler", 2018),
            new Movie("Guardians of the Galaxy", "James Gunn", 2014),
            new Movie("Spider-Man: Homecoming", "Jon Watts", 2017)
        };

        for (Movie movie : predefinedNolanMovies) {
            movies.add(movie);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("Movie Registration System");
            System.out.println("1. Add Movie");
            System.out.println("2. List Movies");
            System.out.println("3. Register from Predefined List (Christopher Nolan)");
            System.out.println("4. Register from Predefined List (Marvel)");
            System.out.println("5. View Registered Movies");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    listMovies();
                    break;
                case 3:
                    registerFromPredefined(predefinedNolanMovies);
                    break;
                case 4:
                    registerFromPredefined(predefinedMarvelMovies);
                    break;
                case 5:
                    viewRegisteredMovies();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }

        scanner.close();
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie director: ");
        String director = scanner.nextLine();
        System.out.print("Enter release year: ");
        int releaseYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Movie movie = new Movie(title, director, releaseYear);
        movies.add(movie);
        registeredMovies.add(movie);

        System.out.println("Movie added successfully!\n");
    }

    private static void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies registered.\n");
            return;
        }

        System.out.println("Registered Movies:\n");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).toString());
        }
    }

    private static void registerFromPredefined(Movie[] predefinedMovies) {
        System.out.println("Predefined Movies:");
        for (int i = 0; i < predefinedMovies.length; i++) {
            System.out.println((i + 1) + ". " + predefinedMovies[i].toString());
        }

        System.out.print("Select a movie to register (1-" + predefinedMovies.length + "): ");
        int selection = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (selection >= 1 && selection <= predefinedMovies.length) {
            Movie selectedMovie = predefinedMovies[selection - 1];
            movies.add(selectedMovie);
            registeredMovies.add(selectedMovie);
            System.out.println("Movie registered successfully!\n");
        } else {
            System.out.println("Invalid selection.\n");
        }
    }

    private static void viewRegisteredMovies() {
        if (registeredMovies.isEmpty()) {
            System.out.println("No movies registered.\n");
            return;
        }

        System.out.println("Registered Movies:\n");
        for (int i = 0; i < registeredMovies.size(); i++) {
            System.out.println((i + 1) + ". " + registeredMovies.get(i).toString());
        }
    }
}
