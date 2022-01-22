

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JComponent implements ActionListener {
   private JFrame frame;
   private Container content;
   private int screenWidth = 600, screenHeight = 600;
   private Timer t;
   
   Main() {
      frame = new JFrame("Super Mario Bros.");
      content = frame.getContentPane();
      content.add(this);
      content.setBackground(new Color(113, 255, 255));
      setUp();
      t = new Timer(1, this);
      
   }
   
   private void setUp() {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(screenWidth + 17, screenHeight + 40);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   
   public void paintComponent(Graphics g) {
      g.setColor(Color.BLUE);
   }
   
   public void actionPerformed(ActionEvent e) {
   
   }
}

class RunMain{
   public static void main(String[] args) {
      Main main = new Main();
   }
}