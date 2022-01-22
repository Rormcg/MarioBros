

<<<<<<< HEAD
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionListener;

public class Main extends JComponent{
   private JFrame frame;
   private Container content;
   private int screenWidth = 600, screenHeight = 600;
   
=======
public class Main {
>>>>>>> 1dd60cc1fbb27bc932c50e6907aee4379a1ac984
   Main() {
      frame = new JFrame("Super Mario Bros.");
      content = frame.getContentPane();
      content.add(this);
      content.setBackground(new Color(113, 255, 255));
      setUp();
      
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
}

class RunMain{
   public static void main(String[] args) {
      Main main = new Main();
   }
}