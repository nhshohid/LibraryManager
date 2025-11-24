import java.util.ArrayList;

import javax.swing.ImageIcon;

public class LibraryManager {

    // Book cover images
    ImageIcon hobbitCover = new ImageIcon("hobbitCover.jpg"); 
    ImageIcon frankensteinCover = new ImageIcon("frankensteinCover.png");
    ImageIcon duneCover = new ImageIcon("duneCover.png");
    ImageIcon fahrenheitCover = new ImageIcon("fahrenheitCover.png");
    ImageIcon mobyDickCover  = new ImageIcon("mobyDickCover.png");
    ImageIcon hungerGamesCover = new ImageIcon("hungerGamesCover.png");

    // Movie cover images
    ImageIcon avengersCover = new ImageIcon("avengersCover.png");
    ImageIcon inceptionCover = new ImageIcon("inceptionCover.png");
    ImageIcon matrixCover = new ImageIcon("matrixCover.png");
    ImageIcon interstellarCover = new ImageIcon("interstellarCover.png");
    ImageIcon madMaxCover = new ImageIcon("madMaxCover.png");
    ImageIcon parasiteCover = new ImageIcon("parasiteCover.png");
    

   
    ArrayList<LibraryBook> books = new ArrayList<LibraryBook>() {{
        add(new LibraryBook(hobbitCover, "The Hobbit", "J.R.R. Tolkien", "Hardcover", 0)); 
        add(new LibraryBook(frankensteinCover, "Frankenstein",  "Mary Shelley", "Paperback", 5)); 
        add(new LibraryBook(duneCover, "Dune", "Frank Herbert", "Hardcover", 2)); 
        add(new LibraryBook(fahrenheitCover, "Fahrenheit 451", "Ray Bradbury", "Paperback", 0));
        add(new LibraryBook(mobyDickCover, "Moby Dick", "Herman Melville", "Paperback", 1)); 
        add(new LibraryBook(hungerGamesCover, "The Hunger Games", "Suzanne Collins", "Hardcover", 4)); 
    }};

   
    ArrayList<LibraryMovie> movies = new ArrayList<LibraryMovie>() {{
        add(new LibraryMovie(avengersCover, "Avengers: Endgame", "Anthony and Joe Russo", "1080p", true)); 
        add(new LibraryMovie(inceptionCover, "Inception", "Christopher Nolan", "1080p", true));
        add(new LibraryMovie(matrixCover, "The Matrix", "Lana and Lilly Wachowski", "4K", false));
        add(new LibraryMovie(interstellarCover, "Interstellar", "Christopher Nolan", "4K", true));
        add(new LibraryMovie(madMaxCover, "Mad Max: Fury Road", "George Miller", "4K", true)); 
        add(new LibraryMovie(parasiteCover, "Parasite", "Bong Joon-ho", "1080p", true)); 
    }};

    // Available Books
    ArrayList<LibraryBook> availableBooks = new ArrayList<>();
    ArrayList<LibraryBook> paperbackBooks = new ArrayList<>();
    ArrayList<LibraryBook> paperbackAvailableBooks = new ArrayList<>();
    ArrayList<LibraryBook> hardcoverBooks = new ArrayList<>();
    ArrayList<LibraryBook> hardcoverAvailableBooks = new ArrayList<>();

    // Available Movies
    ArrayList<LibraryMovie> availableMovies = new ArrayList<>();
    ArrayList<LibraryMovie> movies1080p = new ArrayList<>();
    ArrayList<LibraryMovie> movies1080pAvailable = new ArrayList<>();
    ArrayList<LibraryMovie> movies4k = new ArrayList<>();
    ArrayList<LibraryMovie> movies4kAvailable = new ArrayList<>();

    ArrayList<LibraryItem> listItems = new ArrayList<>();
    int listCount;



}
