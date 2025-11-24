public class Book {
    private final String title;
    private final String author;
    private final String cover;
    private boolean inStock;


    public Book(String title, String author, String cover, boolean inStock) {
        this.title = title;
        this.author = author;
        this.cover = cover;
        this.inStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCover() {
        return cover;
    }

    public boolean getinStock() {
        return inStock;
    }
    public boolean getoutStock() {
        return inStock=false;
    }


    public void displayBookInfo() {
        System.out.println("- Book Details -");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Cover: " + cover);
        System.out.println("Status: " + (inStock ? "In Stock" : "Out of Stock"));
    }
    public static void main(String[] args) {
        Book book = new Book("Moby Dick ", "Herman Melville", "Hardcover", true);
        book.getoutStock();
        book.displayBookInfo();
    }
}


