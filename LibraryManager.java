import java.util.ArrayList;

public class LibraryManager {

    ArrayList<LibraryBook> books = new ArrayList<LibraryBook>() {{
        add(new LibraryBook());
        add(new LibraryBook());
        add(new LibraryBook());
        add(new LibraryBook());
        }};

    ArrayList<LibraryMovie> movies = new ArrayList<LibraryMovie>() {{
        add(new LibraryMovie());
        add(new LibraryMovie());
        add(new LibraryMovie());
        add(new LibraryMovie());
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




}
