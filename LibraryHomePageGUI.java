import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;



public class LibraryHomePageGUI extends JFrame implements ActionListener{ 

    JPanel homePagePanel, homePageHeaderPanel, filterPanel, booksPanel;

    JLabel libraryTitleLabel, libraryIconLabel, filterSortLabel, itemTypeLabel, availabilityLabel,
    qualityLabel, specficFilterLabel;

    JCheckBox availabilityCheckBox, specificFilter1CheckBox, specificFilter2CheckBox;
    JButton goToListButton;
    JRadioButton chooseBookItem, chooseMovieItem;
    ButtonGroup itemButtonGroup;
    ImageIcon libraryIcon, goToListIcon;


    LibraryHomePageGUI(){ 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setLayout(new BorderLayout());

        // ----------------------------------------- HOME PAGE ------------------------------------------ // 

                // ------------------- HOME PAGE HEADER --------------- // 
                libraryIcon = new ImageIcon("LibraryIcon.png");
                libraryIconLabel = new JLabel();
                libraryIconLabel.setIcon(libraryIcon);

                libraryTitleLabel = new JLabel("Library", SwingConstants.CENTER);
                libraryTitleLabel.setFont(new Font("Wayfinding Sans Rg BoldItalic", Font.PLAIN, 75));

                goToListIcon = new ImageIcon("goToListIcon.png");
                goToListButton = new JButton("Go To List", goToListIcon);
                goToListButton.setFocusable(false);
                goToListButton.setBackground(Color.lightGray);
                
                goToListButton.addActionListener(e -> openListPage());
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

                // ------------------- HOME PAGE FILTER --------------- // 
                filterSortLabel = new JLabel("Sort By: ");
                filterSortLabel.setFont(new Font("MV Boli", Font.PLAIN, 25));
                filterSortLabel.setBounds(15, 15, 200, 30);


                itemTypeLabel = new JLabel("Choose an item:");
                itemTypeLabel.setFont(new Font("MV Boli", Font.PLAIN, 18));
                itemTypeLabel.setBounds(15,70,200,20);

                chooseBookItem = new JRadioButton("Book");
                chooseBookItem.setFocusable(false);
                chooseBookItem.setBackground(Color.lightGray);
                chooseBookItem.setBounds(15, 95, 150, 30);
                chooseBookItem.addActionListener(e -> {
                    displayBookFilters();
                    // updateDisplay();
                    } );

                chooseMovieItem = new JRadioButton("Movie");
                chooseMovieItem.setFocusable(false);
                chooseMovieItem.setBackground(Color.lightGray);
                chooseMovieItem.setBounds(15, 125, 150, 30);
                chooseMovieItem.addActionListener(e -> {
                    displayMovieFilters();
                    // updateDisplay();
                });

            

                itemButtonGroup = new ButtonGroup();
                chooseBookItem.setSelected(true);
                itemButtonGroup.add(chooseBookItem);
                itemButtonGroup.add(chooseMovieItem);

                availabilityLabel = new JLabel("Availability: ");
                availabilityLabel.setFont(new Font("MV Boli", Font.PLAIN, 18));
                availabilityLabel.setBounds(15,170,200,20);
                
                availabilityCheckBox = new JCheckBox("In Stock");
                availabilityCheckBox.setFocusable(false);
                availabilityCheckBox.setBackground(Color.lightGray);
                availabilityCheckBox.setBounds(15, 195, 150, 30);

                specficFilterLabel = new JLabel("Cover Type: ");
                specficFilterLabel.setFont(new Font("MV Boli", Font.PLAIN, 18));
                specficFilterLabel.setBounds(15,240,200,20);

                specificFilter1CheckBox = new JCheckBox("Paperback");
                specificFilter1CheckBox.setFocusable(false);
                specificFilter1CheckBox.setBackground(Color.lightGray);
                specificFilter1CheckBox.setBounds(15, 265, 150, 30); 
                specificFilter1CheckBox.addActionListener(e -> {
                    if (specificFilter1CheckBox.isSelected()) {
                        specificFilter2CheckBox.setSelected(false);
                    }
                    // updateDisplay();
                });

                specificFilter2CheckBox = new JCheckBox("Hardcover");
                specificFilter2CheckBox.setFocusable(false);
                specificFilter2CheckBox.setBackground(Color.lightGray);
                specificFilter2CheckBox.setBounds(15, 295, 150, 30); 
                specificFilter2CheckBox.addActionListener(e -> {
                    if (specificFilter2CheckBox.isSelected()) {
                        specificFilter1CheckBox.setSelected(false);
                    }
                    // updateDisplay();
                });


                filterPanel = new JPanel(null);
                filterPanel.setBackground(Color.lightGray);
                filterPanel.setPreferredSize(new Dimension(200,1080));
                filterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                filterPanel.add(filterSortLabel);
                filterPanel.add(itemTypeLabel);
                filterPanel.add(chooseBookItem);
                filterPanel.add(chooseMovieItem);
                filterPanel.add(availabilityLabel);
                filterPanel.add(availabilityCheckBox);
                filterPanel.add(specficFilterLabel);
                filterPanel.add(specificFilter1CheckBox);
                filterPanel.add(specificFilter2CheckBox);
    
        homePagePanel = new JPanel(new BorderLayout(100, 100));
        homePagePanel.add(homePageHeaderPanel, BorderLayout.NORTH);
        homePagePanel.add(filterPanel, BorderLayout.WEST);

        this.add(homePagePanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    private void openListPage() {
        this.getContentPane().removeAll();
        ListPageGUI listPagePanel = new ListPageGUI(this); 
        this.add(listPagePanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    private void displayBookFilters(){
        specificFilter1CheckBox.setSelected(false);
        specificFilter2CheckBox.setSelected(false);
        specficFilterLabel.setText("Covertype: ");
        specificFilter1CheckBox.setText("Paperback");
        specificFilter2CheckBox.setText("Hardcover");
    }

    private void displayMovieFilters(){
        specificFilter1CheckBox.setSelected(false);
        specificFilter2CheckBox.setSelected(false);
        specficFilterLabel.setText("Movie Quality: ");
        specificFilter1CheckBox.setText("1080p");
        specificFilter2CheckBox.setText("4k");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        // new LibraryManager();
        new LibraryHomePageGUI();
    }
}
