import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ListPageGUI extends JPanel implements ActionListener {

    LibraryManager manager;
    JPanel listPagePanel, listPageHeaderPanel, listPageItemsPanel, leftPanel, rightPanel;
    JLabel listPageTitleLabel, libraryIconLabel;
    ImageIcon libraryIcon, goToHomeIcon;
    JButton goToHomeButton, borrowBooksButton;
   

    private final LibraryHomePageGUI parentFrame; // keep reference to main frame

    ListPageGUI(LibraryHomePageGUI parentFrame){
        this.parentFrame = parentFrame;
        manager = parentFrame.getManager();
        


        setLayout(new BorderLayout());

         // ------------------- HOME PAGE HEADER --------------- // 
                libraryIcon = new ImageIcon("LibraryIcon.png");
                libraryIconLabel = new JLabel();
                libraryIconLabel.setIcon(libraryIcon);

                listPageTitleLabel = new JLabel("My List", SwingConstants.CENTER);
                listPageTitleLabel.setFont(new Font("Wayfinding Sans Rg BoldItalic", Font.PLAIN, 75));

                goToHomeIcon = new ImageIcon("goToHomeIcon.png");
                goToHomeButton = new JButton("Go To Home", goToHomeIcon);
                goToHomeButton.setFocusable(false);
                goToHomeButton.setBackground(Color.lightGray);
                
                goToHomeButton.addActionListener(e -> openHomePage());
                goToHomeButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
                goToHomeButton.setPreferredSize(new Dimension(100,0));
                goToHomeButton.setHorizontalTextPosition(JButton.CENTER);
                goToHomeButton.setVerticalTextPosition(JButton.BOTTOM);
                
                listPageHeaderPanel = new JPanel(new BorderLayout());
                listPageHeaderPanel.setBackground(Color.lightGray);
                listPageHeaderPanel.setPreferredSize(new Dimension(1080,150));
                listPageHeaderPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                listPageHeaderPanel.add(libraryIconLabel, BorderLayout.WEST);
                listPageHeaderPanel.add(listPageTitleLabel);
                listPageHeaderPanel.add(goToHomeButton, BorderLayout.EAST);

                listPageItemsPanel = new JPanel(new GridLayout(3,1,0,20));
                for (LibraryItem item : manager.listItems) {
                if (item instanceof LibraryBook) {
                    listPageItemsPanel.add(createBookLabel((LibraryBook) item));
                } 
                else if (item instanceof LibraryMovie) {
                    listPageItemsPanel.add(createMovieLabel((LibraryMovie) item));
                }
            }

            
                leftPanel = new JPanel();
                leftPanel.setPreferredSize(new Dimension(20,20));
                rightPanel = new JPanel();
                rightPanel.setPreferredSize(new Dimension(400,20));
               
               

                borrowBooksButton = new JButton("Borrow Items");
                borrowBooksButton.setBackground(Color.blue);
                borrowBooksButton.setFocusable(false);
                borrowBooksButton.setPreferredSize(new Dimension(100,100));
                borrowBooksButton.setFont(new Font("Calibri", Font.PLAIN, 20));
                borrowBooksButton.addActionListener(e -> {
                    if(manager.listItems.isEmpty()){
                        JOptionPane.showMessageDialog(
                        null, 
                        "No Items in List",
                        "No Items", 
                        JOptionPane.PLAIN_MESSAGE
                    );
                    
                    }
                    else{Iterator<LibraryItem> iterator = manager.listItems.iterator();
                    while (iterator.hasNext()) {
                        LibraryItem item = iterator.next();
                        if (item instanceof LibraryBook) {
                            ((LibraryBook) item).borrowBook();
                            iterator.remove();
                            
                            
                        } else if (item instanceof LibraryMovie) {
                            ((LibraryMovie) item).borrowMovie();
                            iterator.remove();
                            
                            
                        }
                    }
                    JOptionPane.showMessageDialog(
                        null, 
                        "Borrowed Items!",
                        "Confirmation", 
                        JOptionPane.PLAIN_MESSAGE
                    );
                
                    manager.filterBooks();
                    manager.filterMovies();
                    parentFrame.updateDisplay();
                    openHomePage();
                    
                }
                });
                // -------------------- HOME PAGE HEADER ----------------------- // 

                listPagePanel = new JPanel(new BorderLayout(0,10));
                listPagePanel.add(listPageHeaderPanel, BorderLayout.NORTH);
                listPagePanel.add(listPageItemsPanel, BorderLayout.CENTER);
                listPagePanel.add(leftPanel, BorderLayout.WEST);
                listPagePanel.add(rightPanel, BorderLayout.EAST);
                listPagePanel.add(borrowBooksButton,BorderLayout.SOUTH);

                this.add(listPagePanel, BorderLayout.CENTER);

            
                
                }


                private JPanel createBookLabel(LibraryBook book) {

                JPanel panel = new JPanel(new BorderLayout());
                panel.setPreferredSize(new Dimension(150, 250));
                panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));

                JLabel bookLabel = new JLabel();
                bookLabel.setIcon(book.getCoverImage());
                bookLabel.setText("<html>" + book.displayItemInfo().replaceAll("\n", "<br>") + "</html>");
                bookLabel.setFont(new Font("Arial", Font.PLAIN, 18));

                bookLabel.setVerticalTextPosition(JLabel.CENTER);
                bookLabel.setHorizontalTextPosition(JLabel.RIGHT);
                bookLabel.setIconTextGap(30);

                JButton removeButton = new JButton("Remove");
                removeButton.setFocusable(false);
                removeButton.setPreferredSize(new Dimension(100, 100));


                removeButton.setBackground(Color.red);
                removeButton.addActionListener(e -> {
                    manager.listItems.remove(book);
                    manager.listCount--;
                    listPageItemsPanel.remove(panel);
                    listPagePanel.revalidate();
                    listPagePanel.repaint();
                    });
                

                panel.add(bookLabel, BorderLayout.CENTER);
                panel.add(removeButton, BorderLayout.EAST);

                return panel;
            }




            private JPanel createMovieLabel(LibraryMovie movie) {

                JPanel panel = new JPanel(new BorderLayout());
                panel.setPreferredSize(new Dimension(150, 250));
                panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));


                JLabel movieLabel = new JLabel();
                movieLabel.setIcon(movie.getCoverImage());
                movieLabel.setText("<html>" + movie.displayItemInfo().replaceAll("\n", "<br>") + "</html>");
                movieLabel.setFont(new Font("Arial", Font.PLAIN, 18));

                movieLabel.setVerticalTextPosition(JLabel.CENTER);
                movieLabel.setHorizontalTextPosition(JLabel.RIGHT);
                movieLabel.setIconTextGap(20);

                JButton removeButton = new JButton("Remove");
                removeButton.setFocusable(false);
                removeButton.setPreferredSize(new Dimension(100, 100));

                
                removeButton.setBackground(Color.red);
                removeButton.addActionListener(e -> {
                    manager.listItems.remove(movie);
                    manager.listCount--;
                    listPageItemsPanel.remove(panel);
                    listPagePanel.revalidate();
                    listPagePanel.repaint();
                    });
                

                panel.add(movieLabel, BorderLayout.CENTER);
                panel.add(removeButton, BorderLayout.EAST);

                return panel;
            }

    
                

            private void openHomePage() {
                parentFrame.getContentPane().removeAll();
                parentFrame.add(parentFrame.homePagePanel, BorderLayout.CENTER); // reuse existing panel
                parentFrame.revalidate();
                parentFrame.repaint();
            }



    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


    
}

