import javax.swing.ImageIcon;

public class LibraryBook extends LibraryItem{
    
    private final String coverType;
    

    public LibraryBook(ImageIcon coverImage, String title, String author, boolean isInStock, String coverType){
        super(coverImage, title, author, isInStock);
        this.coverType = coverType;
        
    }

    public String getCoverType(){
        return coverType;
    }


    @Override
    public String displayItemInfo() {
        return  "Title: " + getTitle() + 
                "\nAuthor: " + getAuthor() + 
                "\nCovertype: " + getCoverType() + 
                "\n" + (getIsInStock() ? "In Stock" : "Out of Stock");
    }


    
    
}
