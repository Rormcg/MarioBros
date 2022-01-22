import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Mario implements KeyListener {
   private int walkSpeed = 2;
   private int runSpeed = 4;
   private Point2D.Double pos;
   private boolean leftPressed = false, rightPressed = false, upPressed = false, downPressed = false;
   private Point2D.Double size = new Point2D.Double(30, 48);
   
   
   Mario(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public void update() {
      if(rightPressed) {
         if(downPressed) {
            pos.x += runSpeed;
         } else {
            pos.x += walkSpeed;
         }
      } else if(leftPressed) {
         if(downPressed) {
            pos.x -= runSpeed;
         } else {
            pos.x -= walkSpeed;
         }
      }
   }
   
   public void draw(Graphics g) {
      Utility.drawImage(pos.x, pos.y, 3, "mario", g);
   }
   
   public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == 37) {
         //left
         leftPressed = true;
      } else if(e.getKeyCode() == 38) {
         //up
         upPressed = true;
      } else if(e.getKeyCode() == 39) {
         //right
         rightPressed = true;
      } else if(e.getKeyCode() == 40) {
         //down
         downPressed = true;
      }
   }
   public void keyReleased(KeyEvent e) {
      if(e.getKeyCode() == 37) {
         //left
         leftPressed = false;
      } else if(e.getKeyCode() == 38) {
         //up
         upPressed = false;
      } else if(e.getKeyCode() == 39) {
         //right
         rightPressed = false;
      } else if(e.getKeyCode() == 40) {
         //down
         downPressed = false;
      }
   }
   public void keyTyped(KeyEvent e){}
}