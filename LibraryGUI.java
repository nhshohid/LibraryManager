import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

    JPanel homePageHeaderPanel, filterPanel;
    JLabel libraryTitleLabel, libraryIconLabel;
    JButton goToListButton;
    ImageIcon libraryIcon, goToListIcon;


    LibraryGUI(){ 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setLayout(new BorderLayout(0,100));

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
        homePageHeaderPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        homePageHeaderPanel.add(libraryIconLabel, BorderLayout.WEST);
        homePageHeaderPanel.add(libraryTitleLabel);
        homePageHeaderPanel.add(goToListButton, BorderLayout.EAST);


        filterPanel = new JPanel();
        filterPanel.setBackground(Color.lightGray);
        filterPanel.setPreferredSize(new Dimension(200,1080));


        this.add(filterPanel, BorderLayout.WEST);
        this.add(homePageHeaderPanel, BorderLayout.NORTH);

 
        this.setVisible(true);
    }

    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    
    public static void main(String[] args) {
        new LibraryGUI();
    }
    


}
