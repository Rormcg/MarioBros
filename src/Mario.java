import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Mario implements KeyListener {
   private int walkSpeed = 2;
   private int runSpeed = 4;
   private Point2D.Double pos;
   private boolean leftPressed = false, rightPressed = false, jumping = false, running = false;
   private Point2D.Double size = new Point2D.Double(36, 48);
   private String facing = "right";
   private int timer = 0;
   
   Mario(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public void update(boolean up, boolean down, boolean left, boolean right) {
      timer ++;
      if(rightPressed && right) {
         if(running) {
            pos.x += runSpeed;
         } else {
            pos.x += walkSpeed;
         }
      } else if(leftPressed && left) {
         if(running) {
            pos.x -= runSpeed;
         } else {
            pos.x -= walkSpeed;
         }
      }
   }
   
   public void draw(Graphics g) {
      if(!rightPressed && !leftPressed) {
         Utility.drawImage(pos.x, pos.y, 3, "mario", g);
      } else {
         if(running) {
            if((timer / 5) % 3 == 0) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving1", g);
            } else if((timer / 5) % 3 == 1) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving2", g);
            } else {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving3", g);
            }
         } else {
            if((timer / 10) % 3 == 0) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving1", g);
            } else if((timer / 10) % 3 == 1) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving2", g);
            } else {
               Utility.drawImage(pos.x, pos.y, 3, "mario-moving3", g);
            }
         }
      }
   }
   
   public Point2D.Double getPos() {
      return pos;
   }
   
   public void setPos(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public Point2D.Double getSize() {
      return size;
   }
   
   public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == 37) {
         //left
         leftPressed = true;
         facing = "left";
      } else if(e.getKeyCode() == 38) {
         //up
         jumping = true;
      } else if(e.getKeyCode() == 39) {
         //right
         rightPressed = true;
         facing = "right";
      } else if(e.getKeyCode() == 40) {
         //down
         running = true;
      }
   }
   public void keyReleased(KeyEvent e) {
      if(e.getKeyCode() == 37) {
         //left
         leftPressed = false;
      } else if(e.getKeyCode() == 38) {
         //up
      } else if(e.getKeyCode() == 39) {
         //right
         rightPressed = false;
      } else if(e.getKeyCode() == 40) {
         //down
         running = false;
      }
   }
   public void keyTyped(KeyEvent e){}
}