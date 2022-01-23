import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Mario implements KeyListener {
   private int walkSpeed = 2;
   private int runSpeed = 4;
   private Point2D.Double pos;
   private boolean leftPressed = false, rightPressed = false, jumping = false, running = false, upPressed = false;
   private Point2D.Double size = new Point2D.Double(48, 48);
   private String facing = "right";
   private int timer = 0;
   private int jumpingTimer = 30;
   private boolean onGround;
   private boolean isDead = false;
   
   Mario(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public void update(boolean up, boolean down, boolean left, boolean right) {
      if(!isDead) {
         timer ++;
         if(!down) {
            onGround = true;
         } else {
            onGround = false;
         }
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
         
         if(jumping || down) {
            if(((jumping && jumpingTimer > 25) || (jumping && jumpingTimer > 0 && upPressed)) && up) {
               jumpingTimer --;
               pos.y -= runSpeed;
            } else if(down){
               pos.y += runSpeed;
               jumping = false;
            } else {
               jumping = false;
            }
         }
      }
   }
   
   public void draw(Graphics g) {
      if(!isDead) {
         if(facing == "right") {
            if(!rightPressed && !leftPressed) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-stillA", g);
            } else {
               if(running) {
                  if((timer / 5) % 3 == 0) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving1A", g);
                  } else if((timer / 5) % 3 == 1) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving2A", g);
                  } else {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving3A", g);
                  }
               } else {
                  if((timer / 10) % 3 == 0) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving1A", g);
                  } else if((timer / 10) % 3 == 1) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving2A", g);
                  } else {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving3A", g);
                  }
               }
            }
         } else {
            if(!rightPressed && !leftPressed) {
               Utility.drawImage(pos.x, pos.y, 3, "mario-stillB", g);
            } else {
               if(running) {
                  if((timer / 5) % 3 == 0) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving1B", g);
                  } else if((timer / 5) % 3 == 1) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving2B", g);
                  } else {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving3B", g);
                  }
               } else {
                  if((timer / 10) % 3 == 0) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving1B", g);
                  } else if((timer / 10) % 3 == 1) {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving2B", g);
                  } else {
                     Utility.drawImage(pos.x, pos.y, 3, "mario-moving3B", g);
                  }
               }
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
   
   public boolean getIsDead() {
      return isDead;
   }
   
   public void setJumping(boolean a) {
      jumping = a;
   }
   
   public void setSize(double x, double y) {
      size = new Point2D.Double(x, y);
   }
   
   public void setJumpingTimer(int a) {
      jumpingTimer = a;
   }
   
   public void setIsDead(boolean a) {
      isDead = a;
   }
   
   public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == 37) {
         //left
         leftPressed = true;
         facing = "left";
      } else if(e.getKeyCode() == 38 && onGround) {
         //up
         jumping = true;
         jumpingTimer = 40;
         upPressed = true;
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
         upPressed = false;
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