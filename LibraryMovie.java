import javax.swing.ImageIcon;

public class LibraryMovie extends LibraryItem{
    
    private final String quality;
    private Boolean availability;

    public LibraryMovie(ImageIcon coverImage, String title, String author, String quality, Boolean availability){
        super(coverImage, title, author);
        this.quality = quality;
        this.availability = availability;
    }

    public String getQuality(){
        return quality;
    }

    public Boolean getAvailability(){
        return availability;
    }

    @Override
    public String displayItemInfo() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nQuality: " + getQuality() + "\nAvailibility: " + getAvailability();
    }
}