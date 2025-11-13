public class LibraryBook {

    class Book {

        private String title;
        private String author;
        private String isbn;
        private double price;
        private boolean inStock;

        // Constructor method
        // Initializes a new Book object with required core details.
        public Book(String title, String author, String isbn) {
            // 'this' refers to the current object's instance variables.
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            // Default initial values for price and stock status.
            this.price = 0.0;
            this.inStock = false;
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        public double getPrice() {
            return price;
        }

        public boolean isInStock() {
            return inStock;
        }


        public void setPrice(double price) {

            this.price = price;
        }

        public void setInStock(boolean inStock) {
            this.inStock = inStock;
        }


        public void displayBookInfo() {
            System.out.println("--- Book Details ---");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Price: $" + String.format("%.2f", price)); // Formats price to 2 decimal places
            // Ternary operator for a clean stock status message
            System.out.println("Status: " + (inStock ? "In Stock" : "Out of Stock"));
            System.out.println("--------------------");
        }
    }

    /**
     * Organizing classes: This class contains the main method to run the program
     * and test the functionality of the Book class.
     */
    public class LibraryBook {
        public static void main(String[] args) {
            // 1. Create a new Book object using the constructor method.
            System.out.println("Creating a new book object...");
            Book book1 = new Book("The Java Programming Guide", "A. Coder", "978-0134685991");
            // Initial state check (price will be 0.0, inStock will be false)
            book1.displayBookInfo();

            // 2. Use a SET METHOD to update the book's price.
            System.out.println("\nSetting price to $49.99...");
            book1.setPrice(49.99);

            // 3. Use a SET METHOD to mark the book as in stock.
            System.out.println("Marking book as in stock...");
            book1.setInStock(true);

            // 4. Use the WORK METHOD to show the current details.
            System.out.println("\nDisplaying updated book details:");
            book1.displayBookInfo();

            // 5. Use GET METHODS to retrieve and print specific fields separately.
            System.out.println("\nRetrieving data using GET METHODS:");
            String currentTitle = book1.getTitle();
            double currentPrice = book1.getPrice();

            System.out.println("Retrieved Title: " + currentTitle);
            System.out.println("Retrieved Price: $" + String.format("%.2f", currentPrice));
        }
    }






}
