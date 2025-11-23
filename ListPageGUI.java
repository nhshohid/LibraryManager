import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ListPageGUI extends JPanel implements ActionListener {

    JPanel listPagePanel, listPageHeaderPanel;
    JLabel listPageTitleLabel, libraryIconLabel;
    ImageIcon libraryIcon, goToHomeIcon;
    JButton goToHomeButton, borrowBooksButton;

    private final LibraryHomePageGUI parentFrame; // keep reference to main frame

    ListPageGUI(LibraryHomePageGUI parentFrame){
        this.parentFrame = parentFrame;


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

                borrowBooksButton = new JButton("Borrow Books");
                borrowBooksButton.setBackground(Color.blue);
                borrowBooksButton.setFocusable(false);
                borrowBooksButton.setPreferredSize(new Dimension(100,100));
                borrowBooksButton.setFont(new Font("Calibri", Font.PLAIN, 20));
                borrowBooksButton.addActionListener(e -> Confirmation());
                // -------------------- HOME PAGE HEADER ----------------------- // 

                listPagePanel = new JPanel(new BorderLayout());
                listPagePanel.add(listPageHeaderPanel, BorderLayout.NORTH);

                this.add(listPagePanel, BorderLayout.CENTER);
                this.add(borrowBooksButton, BorderLayout.SOUTH);
                }

                private void Confirmation(){
                    listPageTitleLabel.setText("Confirmation");
                    borrowBooksButton.setText("Go To Home Page");
                    borrowBooksButton.addActionListener(e -> openHomePage());
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
