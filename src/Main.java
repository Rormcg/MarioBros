

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
   
   private Mario mario = new Mario(80, 80);
   private Background background = new Background();
   
   Main() {
      setUp();
      
      
   }
   
   private void setUp() {
      frame = new JFrame("Super Mario Bros.");
      content = frame.getContentPane();
      content.add(this);
      content.setBackground(new Color(113, 255, 255));
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(screenWidth + 17, screenHeight + 40);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      t = new Timer(1, this);
      t.start();
      frame.addKeyListener(mario);
   }
   
   
   public void paintComponent(Graphics g) {
      background.draw(g);
      mario.draw(g);
   }
   
   public void actionPerformed(ActionEvent e) {
      mario.update();
      
      repaint();
   }
}

class RunMain{
   public static void main(String[] args) {
      Main main = new Main();
   }
}