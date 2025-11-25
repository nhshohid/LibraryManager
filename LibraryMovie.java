import javax.swing.ImageIcon;

public class LibraryMovie extends LibraryItem{
    
    private final String quality;
    

    public LibraryMovie(ImageIcon coverImage, String title, String author, boolean isInStock, String quality){
        super(coverImage, title, author, isInStock);
        this.quality = quality;
        
    }

    public String getQuality(){
        return quality;
    }
    

    @Override
    public String displayItemInfo() {
        return  "Title: " + getTitle() + 
                "\nDirector: " + getAuthor() + 
                "\nQuality: " + getQuality() + 
                "\n" + (getIsInStock() ? "In Stock" : "Out of Stock");
    }


    
    
}