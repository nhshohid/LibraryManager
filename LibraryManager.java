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
    add(new LibraryBook(hobbitCover, "The Hobbit", "J.R.R. Tolkien", false, "Hardcover"));
    add(new LibraryBook(frankensteinCover, "Frankenstein", "Mary Shelley", true, "Paperback"));
    add(new LibraryBook(duneCover, "Dune", "Frank Herbert", true, "Hardcover"));
    add(new LibraryBook(fahrenheitCover, "Fahrenheit 451", "Ray Bradbury", false, "Paperback"));
    add(new LibraryBook(mobyDickCover, "Moby Dick", "Herman Melville", true, "Paperback"));
    add(new LibraryBook(hungerGamesCover, "The Hunger Games", "Suzanne Collins", true, "Hardcover"));
    }};


   
    ArrayList<LibraryMovie> movies = new ArrayList<LibraryMovie>() {{
    add(new LibraryMovie(avengersCover, "Avengers: Endgame", "Anthony and Joe Russo", true, "1080p"));
    add(new LibraryMovie(inceptionCover, "Inception", "Christopher Nolan", true, "1080p"));
    add(new LibraryMovie(matrixCover, "The Matrix", "Lana and Lilly Wachowski", false, "4K"));
    add(new LibraryMovie(interstellarCover, "Interstellar", "Christopher Nolan", true, "4K"));
    add(new LibraryMovie(madMaxCover, "Mad Max: Fury Road", "George Miller", true, "4K"));
    add(new LibraryMovie(parasiteCover, "Parasite", "Bong Joon-ho", true, "1080p"));
    }};

   
    ArrayList<LibraryBook> availableBooks = new ArrayList<>();
    ArrayList<LibraryBook> paperbackBooks = new ArrayList<>();
    ArrayList<LibraryBook> paperbackAvailableBooks = new ArrayList<>();
    ArrayList<LibraryBook> hardcoverBooks = new ArrayList<>();
    ArrayList<LibraryBook> hardcoverAvailableBooks = new ArrayList<>();

   
    ArrayList<LibraryMovie> availableMovies = new ArrayList<>();
    ArrayList<LibraryMovie> movies1080p = new ArrayList<>();
    ArrayList<LibraryMovie> movies1080pAvailable = new ArrayList<>();
    ArrayList<LibraryMovie> movies4k = new ArrayList<>();
    ArrayList<LibraryMovie> movies4kAvailable = new ArrayList<>();

    ArrayList<LibraryItem> listItems = new ArrayList<>();
    int listCount;



}
