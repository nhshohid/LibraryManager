import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;



public class LibraryGUI extends JFrame implements ActionListener { 

    JPanel homePagePanel, homePageHeaderPanel, filterPanel;

    JLabel libraryTitleLabel, libraryIconLabel, filterSortLabel, availabilityLabel,
    coverTypeLabel, genreLabel;

    JCheckBox availabilityCheckBox, paperbackCheckBox, hardcoverCheckBox, horrorCheckBox,
    mysteryCheckBox, fantasyCheckBox;

    JButton goToListButton;
    ImageIcon libraryIcon, goToListIcon;


    LibraryGUI(){ 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setLayout(new BorderLayout());

        // -------------- HOME PAGE --------------- // 
        
        libraryIcon = new ImageIcon("LibraryIcon.png");
        libraryIconLabel = new JLabel();
        libraryIconLabel.setIcon(libraryIcon);

        libraryTitleLabel = new JLabel("Library", SwingConstants.CENTER);
        libraryTitleLabel.setFont(new Font("Wayfinding Sans Rg BoldItalic", Font.ITALIC, 75));

        goToListIcon = new ImageIcon("goToListIcon.png");
        goToListButton = new JButton("Go To List", goToListIcon);
        goToListButton.setFocusable(false);
        goToListButton.setBackground(Color.lightGray);
        goToListButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        goToListButton.setPreferredSize(new Dimension(100,0));
        goToListButton.setHorizontalTextPosition(JButton.CENTER);
        goToListButton.setVerticalTextPosition(JButton.BOTTOM);
        
        homePageHeaderPanel = new JPanel(new BorderLayout());
        homePageHeaderPanel.setBackground(Color.lightGray);
        homePageHeaderPanel.setPreferredSize(new Dimension(1080,150));
        homePageHeaderPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        homePageHeaderPanel.add(libraryIconLabel, BorderLayout.WEST);
        homePageHeaderPanel.add(libraryTitleLabel);
        homePageHeaderPanel.add(goToListButton, BorderLayout.EAST);

        filterSortLabel = new JLabel("Sort By: ");
        filterSortLabel.setFont(new Font("MV Boli", Font.PLAIN, 25));
        filterSortLabel.setBounds(15, 15, 200, 30);

        availabilityLabel = new JLabel("Availability: ");
        availabilityLabel.setFont(new Font("MV Boli", Font.PLAIN, 18));
        availabilityLabel.setBounds(15,70,200,20);
        
        availabilityCheckBox = new JCheckBox("In Stock");
        availabilityCheckBox.setFocusable(false);
        availabilityCheckBox.setBackground(Color.lightGray);
        availabilityCheckBox.setBounds(15, 95, 150, 30);

        coverTypeLabel = new JLabel("Cover Type: ");
        coverTypeLabel.setFont(new Font("MV Boli", Font.PLAIN, 18));
        coverTypeLabel.setBounds(15,145,200,20);

        paperbackCheckBox = new JCheckBox("Paperback");
        paperbackCheckBox.setFocusable(false);
        paperbackCheckBox.setBackground(Color.lightGray);
        paperbackCheckBox.setBounds(15, 170, 150, 30); 

        hardcoverCheckBox = new JCheckBox("Hardcover");
        hardcoverCheckBox.setFocusable(false);
        hardcoverCheckBox.setBackground(Color.lightGray);
        hardcoverCheckBox.setBounds(15, 200, 150, 30); 

        genreLabel = new JLabel("Genre: ");
        genreLabel.setFont(new Font("MV Boli", Font.PLAIN, 20));
        genreLabel.setBounds(15,250,200,20);

        horrorCheckBox = new JCheckBox("Horror");
        horrorCheckBox.setFocusable(false);
        horrorCheckBox.setBackground(Color.lightGray);
        horrorCheckBox.setBounds(15, 275, 150, 30); 

        mysteryCheckBox = new JCheckBox("Mystery");
        mysteryCheckBox.setFocusable(false);
        mysteryCheckBox.setBackground(Color.lightGray);
        mysteryCheckBox.setBounds(15, 305, 150, 30); 

        fantasyCheckBox = new JCheckBox("Fantasy");
        fantasyCheckBox.setFocusable(false);
        fantasyCheckBox.setBackground(Color.lightGray);
        fantasyCheckBox.setBounds(15, 335, 150, 30); 

        
        filterPanel = new JPanel(null);
        filterPanel.setBackground(Color.lightGray);
        filterPanel.setPreferredSize(new Dimension(200,1080));
        filterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        filterPanel.add(filterSortLabel);
        filterPanel.add(availabilityLabel);
        filterPanel.add(availabilityCheckBox);
        filterPanel.add(coverTypeLabel);
        filterPanel.add(paperbackCheckBox);
        filterPanel.add(hardcoverCheckBox);
        filterPanel.add(genreLabel);
        filterPanel.add(horrorCheckBox);
        filterPanel.add(mysteryCheckBox);
        filterPanel.add(fantasyCheckBox);





        homePagePanel = new JPanel(new BorderLayout(0, 100));
        homePagePanel.add(homePageHeaderPanel, BorderLayout.NORTH);
        homePagePanel.add(filterPanel, BorderLayout.WEST);


        


        this.add(homePagePanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    
    public static void main(String[] args) {
        new LibraryGUI();
    }
    


}
