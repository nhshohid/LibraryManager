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

    JPanel topPanel, leftPanel;
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
        
        
        topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.lightGray);
        topPanel.setPreferredSize(new Dimension(1080,150));
        topPanel.add(libraryTitle, BorderLayout.WEST);


        leftPanel = new JPanel();
        leftPanel.setBackground(Color.lightGray);
        leftPanel.setPreferredSize(new Dimension(200,1080));
        this.add(leftPanel, BorderLayout.WEST);
        this.add(topPanel, BorderLayout.NORTH);






        
        this.setVisible(true);
    }

    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    
    public static void main(String[] args) {
        new LibraryGUI();
    }
    


}
