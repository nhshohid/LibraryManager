import javax.swing.ImageIcon;

public abstract class LibraryItem {
    
    private final ImageIcon coverImage;
    private final String title;
    private final String author;
    private boolean isInStock;

    public LibraryItem(ImageIcon coverImage, String title, String author, boolean isInStock){
        this.coverImage = coverImage;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;
    }

    public ImageIcon getCoverImage(){
        return coverImage;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Boolean getIsInStock(){
        return isInStock;
    }

    public String displayItemInfo(){
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor(); 
    }

    public void borrowMovie(){
        isInStock = false;
    }

    public void borrowBook(){
        isInStock = false;
    }
    
}


