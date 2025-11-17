import javax.swing.ImageIcon;

public abstract class LibraryItem {
    
    private final ImageIcon coverImage;
    private final String title;
    private final String author;

    public LibraryItem(ImageIcon coverImage, String title, String author){
        this.coverImage = coverImage;
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String displayItemInfo(){
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor();
    }


}
