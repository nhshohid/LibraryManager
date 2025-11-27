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
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;



public class LibraryHomePageGUI extends JFrame implements ActionListener{ 

    LibraryManager manager;
    JPanel homePagePanel, homePageHeaderPanel, filterPanel, booksPanel,bottomPanel, rightPanel;

    JLabel libraryTitleLabel, libraryIconLabel, filterSortLabel, itemTypeLabel, availabilityLabel,
    qualityLabel, specficFilterLabel;

    JCheckBox availabilityCheckBox, specificFilter1CheckBox, specificFilter2CheckBox;
    JButton goToListButton;
    JRadioButton chooseBookItem, chooseMovieItem;
    ButtonGroup itemButtonGroup;
    ImageIcon libraryIcon, goToListIcon;


    LibraryHomePageGUI(LibraryManager manager){
        this.manager = manager; 
        

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
                    updateDisplay();
                    } );

                chooseMovieItem = new JRadioButton("Movie");
                chooseMovieItem.setFocusable(false);
                chooseMovieItem.setBackground(Color.lightGray);
                chooseMovieItem.setBounds(15, 125, 150, 30);
                chooseMovieItem.addActionListener(e -> {
                    displayMovieFilters();
                    updateDisplay();
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
                availabilityCheckBox.addActionListener(e -> {
                    updateDisplay();
                });

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
                    updateDisplay();
                });

                specificFilter2CheckBox = new JCheckBox("Hardcover");
                specificFilter2CheckBox.setFocusable(false);
                specificFilter2CheckBox.setBackground(Color.lightGray);
                specificFilter2CheckBox.setBounds(15, 295, 150, 30); 
                specificFilter2CheckBox.addActionListener(e -> {
                    if (specificFilter2CheckBox.isSelected()) {
                        specificFilter1CheckBox.setSelected(false);
                    }
                    updateDisplay();
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


                booksPanel = new JPanel(new GridLayout(2,3, 10, 10));
                


                
                bottomPanel = new JPanel();
                bottomPanel.setPreferredSize(new Dimension(20,20));
                rightPanel = new JPanel();
                rightPanel.setPreferredSize(new Dimension(20,20));
                
                
                
    
        homePagePanel = new JPanel(new BorderLayout(100, 75));
        homePagePanel.add(homePageHeaderPanel, BorderLayout.NORTH);
        homePagePanel.add(filterPanel, BorderLayout.WEST);
        homePagePanel.add(booksPanel, BorderLayout.CENTER);
        homePagePanel.add(bottomPanel, BorderLayout.SOUTH);
        homePagePanel.add(rightPanel, BorderLayout.EAST);

        this.add(homePagePanel, BorderLayout.CENTER);
        this.updateDisplay();
        this.setVisible(true);
    }

        private void openListPage() {
            this.getContentPane().removeAll();
            ListPageGUI listPagePanel = new ListPageGUI(this); 
            this.add(listPagePanel, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
        }

        public LibraryManager getManager() {
            return this.manager;
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


        public void updateDisplay() {
            // Clear previous items (books or movies) in the booksPanel before adding new ones
            booksPanel.removeAll();
            

            if (chooseBookItem.isSelected()) {
                // Handle filtering for books
                if (availabilityCheckBox.isSelected()) {
                    // Filter by availability (in stock) and cover type for books
                    if (specificFilter1CheckBox.isSelected()) {
                        // Add only paperback available books
                        for (LibraryBook book : manager.paperbackAvailableBooks) {
                            booksPanel.add(createBookLabel(book));
                        }
                    } else if (specificFilter2CheckBox.isSelected()) {
                        // Add only hardcover available books
                        for (LibraryBook book : manager.hardcoverAvailableBooks) {
                            booksPanel.add(createBookLabel(book));
                        }
                    } else {
                        // Add all available books (both hardcover and paperback)
                        for (LibraryBook book : manager.availableBooks) {
                            booksPanel.add(createBookLabel(book));
                        }
                    }
                } else {
                    // If "In Stock" filter is not selected, show all books
                    if (specificFilter1CheckBox.isSelected()) {
                        // Add all paperback books regardless of availability
                        for (LibraryBook book : manager.paperbackBooks) {
                            booksPanel.add(createBookLabel(book));
                        }
                    } else if (specificFilter2CheckBox.isSelected()) {
                        // Add all hardcover books regardless of availability
                        for (LibraryBook book : manager.hardcoverBooks) {
                            booksPanel.add(createBookLabel(book));
                        }
                    } else {
                        // Add all books (both paperback and hardcover) regardless of availability
                        for (LibraryBook book : manager.books) {
                            booksPanel.add(createBookLabel(book));
                        }
                    }
                }
            } else if (chooseMovieItem.isSelected()) {
                // Handle filtering for movies
                if (availabilityCheckBox.isSelected()) {
                    // Filter by availability (in stock) and quality for movies
                    if (specificFilter1CheckBox.isSelected()) {
                        // Add only 1080p available movies
                        for (LibraryMovie movie : manager.movies1080pAvailable) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    } else if (specificFilter2CheckBox.isSelected()) {
                        // Add only 4k available movies
                        for (LibraryMovie movie : manager.movies4kAvailable) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    } else {
                        // Add all available movies (both 1080p and 4k)
                        for (LibraryMovie movie : manager.availableMovies) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    }
                } else {
                    // If "In Stock" filter is not selected, show all movies
                    if (specificFilter1CheckBox.isSelected()) {
                        // Add all 1080p movies regardless of availability
                        for (LibraryMovie movie : manager.movies1080p) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    } else if (specificFilter2CheckBox.isSelected()) {
                        // Add all 4k movies regardless of availability
                        for (LibraryMovie movie : manager.movies4k) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    } else {
                        // Add all movies (both 1080p and 4k) regardless of availability
                        for (LibraryMovie movie : manager.movies) {
                            booksPanel.add(createMovieLabel(movie));
                        }
                    }
                }
            }

            // Refresh the display after adding all items (books or movies)
            booksPanel.revalidate();
            booksPanel.repaint();
        }


        

        private JPanel createBookLabel(LibraryBook book) {

            JPanel panel = new JPanel(new BorderLayout());
            panel.setPreferredSize(new Dimension(150, 250));

            JLabel bookLabel = new JLabel();
            bookLabel.setIcon(book.getCoverImage());
            bookLabel.setText("<html>" + book.displayItemInfo().replaceAll("\n", "<br>") + "</html>");
            bookLabel.setFont(new Font("Arial", Font.PLAIN, 18));

            bookLabel.setVerticalTextPosition(JLabel.CENTER);
            bookLabel.setHorizontalTextPosition(JLabel.RIGHT);
            bookLabel.setIconTextGap(30);

            JButton borrowButton = new JButton("Borrow");
            borrowButton.setFocusable(false);
            borrowButton.setPreferredSize(new Dimension(50, 30));


            if (book.getIsInStock() == false) {
                borrowButton.setEnabled(false);
                borrowButton.setBackground(Color.GRAY);
            } else {
                borrowButton.setBackground(Color.GREEN);
                borrowButton.addActionListener(e -> {
                    if (manager.listItems.contains(book)) {
                            javax.swing.JOptionPane.showMessageDialog(
                                null,
                                "This book is already in your list!",
                                "Already Added",
                                javax.swing.JOptionPane.WARNING_MESSAGE
                            );
                            return;
                        }

                    if (manager.listCount >= 3) {
                        javax.swing.JOptionPane.showMessageDialog(
                                null,
                                "Three items have already been added to your list or may have already been checked out!",
                                "Limit Reached",
                                javax.swing.JOptionPane.WARNING_MESSAGE
                        );
                        return;
                    }
                    manager.listCount++;
                    manager.listItems.add(book);
                });
            }

            panel.add(bookLabel, BorderLayout.CENTER);
            panel.add(borrowButton, BorderLayout.SOUTH);

            return panel;
        }




            private JPanel createMovieLabel(LibraryMovie movie) {

                JPanel panel = new JPanel(new BorderLayout());
                panel.setPreferredSize(new Dimension(150, 250));

                JLabel movieLabel = new JLabel();
                movieLabel.setIcon(movie.getCoverImage());
                movieLabel.setText("<html>" + movie.displayItemInfo().replaceAll("\n", "<br>") + "</html>");
                movieLabel.setFont(new Font("Arial", Font.PLAIN, 18));

                movieLabel.setVerticalTextPosition(JLabel.CENTER);
                movieLabel.setHorizontalTextPosition(JLabel.RIGHT);
                movieLabel.setIconTextGap(20);

                JButton borrowButton = new JButton("Borrow");
                borrowButton.setFocusable(false);
                borrowButton.setPreferredSize(new Dimension(100, 30));

                if (movie.getIsInStock() == false) {
                    borrowButton.setEnabled(false);
                    borrowButton.setBackground(Color.GRAY);
                } else {
                    borrowButton.setBackground(Color.GREEN);
                    borrowButton.addActionListener(e -> {
                        if (manager.listItems.contains(movie)) {
                            javax.swing.JOptionPane.showMessageDialog(
                                null,
                                "This movie is already in your list!",
                                "Already Added",
                                javax.swing.JOptionPane.WARNING_MESSAGE
                            );
                            return;
                        }
                        if (manager.listCount >= 3) {
                        javax.swing.JOptionPane.showMessageDialog(
                                null,
                                "Three items have already been added!",
                                "Limit Reached",
                                javax.swing.JOptionPane.WARNING_MESSAGE
                        );
                        return;
                    }
                    manager.listCount++;
                    manager.listItems.add(movie);
                    });
                }

                panel.add(movieLabel, BorderLayout.CENTER);
                panel.add(borrowButton, BorderLayout.SOUTH);

                return panel;
            }



        

        @Override
        public void actionPerformed(ActionEvent e) {}

        public static void main(String[] args) {
            LibraryManager manager = new LibraryManager();
            manager.filterBooks();
            manager.filterMovies();
            
            new LibraryHomePageGUI(manager);
            
        }
}
