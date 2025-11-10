import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;



public class LibraryGUI extends JFrame implements ActionListener { 

    JPanel homePageHeaderPanel, filterPanel;
    JLabel libraryTitle;
    ImageIcon libraryIcon;


    LibraryGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080,720);
        this.setLayout(new BorderLayout(0,100));

        libraryIcon = new ImageIcon("LibraryIcon.png");

        libraryTitle = new JLabel("Library");
        libraryTitle.setIcon(libraryIcon);
        libraryTitle.setHorizontalTextPosition(JLabel.RIGHT);
        libraryTitle.setIconTextGap(300);
        
       
        
        libraryTitle.setFont(new Font("MV Boli", Font.PLAIN, 75));
        
        
        homePageHeaderPanel = new JPanel(new BorderLayout());
        homePageHeaderPanel.setBackground(Color.lightGray);
        homePageHeaderPanel.setPreferredSize(new Dimension(1080,150));
        homePageHeaderPanel.add(libraryTitle, BorderLayout.WEST);


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
