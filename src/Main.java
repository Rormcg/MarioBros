

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
   private Block blocks[] = {new Block(400, 80, "brick")};
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
      
      for(int i = 0; i < blocks.length; i++) {
         blocks[i].draw(g);
      }
   }
   
   public void actionPerformed(ActionEvent e) {
      mario.update(marioCanMove("up"), marioCanMove("down"), marioCanMove("left"), marioCanMove("right"));
      
      repaint();
   }
   
   public boolean marioCanMove(String dir) {
      boolean canMove = true;
      Mario a = mario;
      for(int i = 0; i < blocks.length; i++) {
         Block b = blocks[i];
         if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x && a.getPos().y <= b.getPos().y + b.getSize().y && a.getPos().y >= b.getPos().y)) {
            canMove = false;
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x && a.getPos().y <= b.getPos().y + b.getSize().y && a.getPos().y >= b.getPos().y)) {
            canMove = false;
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y && a.getPos().x <= b.getPos().x + b.getSize().x && a.getPos().x >= b.getPos().x)) {
            canMove = false;
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y && a.getPos().x <= b.getPos().x + b.getSize().x && a.getPos().x >= b.getPos().x)) {
            canMove = false;
         }
         
         else if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x + 2 && a.getPos().y <= b.getPos().y + b.getSize().y && a.getPos().y >= b.getPos().y)) {
            canMove = false;
            a.setPos(b.getPos().x - a.getSize().x, a.getPos().y);
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x - 2 && a.getPos().y <= b.getPos().y + b.getSize().y && a.getPos().y >= b.getPos().y)) {
            canMove = false;
            a.setPos(b.getPos().x + b.getSize().x, a.getPos().y);
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y - 2 && a.getPos().x <= b.getPos().x + b.getSize().x && a.getPos().x >= b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y + b.getSize().y);
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y + 2 && a.getPos().x <= b.getPos().x + b.getSize().x && a.getPos().x >= b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y - a.getSize().y);
         }
      }
      
      return canMove;
   }
}

class RunMain{
   public static void main(String[] args) {
      Main main = new Main();
   }
}