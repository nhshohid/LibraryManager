import javax.swing.ImageIcon;

public class LibraryBook extends LibraryItem{
    
    private final String coverType;
    private int stock;

    public LibraryBook(ImageIcon coverImage, String title, String author, String coverType, int stock){
        super(coverImage, title, author);
        this.coverType = coverType;
        this.stock = stock;
    }

    public String getCoverType(){
        return coverType;
    }

    public int getStock(){
        return stock;
    }

    @Override
    public String displayItemInfo() {
        return "   Title: " + getTitle() + "\n   Author: " + getAuthor() + "\n   Cover Type: " + getCoverType() + "\n   " + getStock() + "/5 Available";
    }


    public void borrowBook(){
        stock -= 1;
    }
    
}


