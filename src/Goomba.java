import java.awt.geom.Point2D;
import java.awt.Graphics;

public class Goomba {
   private Point2D.Double pos;
   private Point2D.Double size = new Point2D.Double(48, 48);
   private int timer = 0;
   private int speed = 1;
   private String moving = "left";
   private boolean isDead = false;
   
   Goomba(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public void draw(Graphics g) {
      if(!isDead) {
         if((timer / 20) % 4 == 0) {
            Utility.drawImage(pos.x, pos.y, 3, "goomba1", g);
         } else if((timer / 20) % 4 == 1) {
            Utility.drawImage(pos.x, pos.y, 3, "goomba2", g);
         } else if((timer / 20) % 4 == 2) {
            Utility.drawImage(pos.x, pos.y, 3, "goomba3", g);
         } else {
            Utility.drawImage(pos.x, pos.y, 3, "goomba2", g);
         }
      }
   }
   
   public void update(boolean down, boolean left, boolean right) {
      timer ++;
      if(down) {
         pos.y += 1;
      }
      
      if(moving == "left") {
         if(left) {
            pos.x -= speed;
         } else {
            moving = "right";
         }
      } else {
         if(right) {
            pos.x += speed;
         } else {
            moving = "left";
         }
      }
   }
   
   public Point2D.Double getPos() {
      return pos;
   }
   
   public Point2D.Double getSize() {
      return size;
   }
   
   public boolean getIsDead() {
      return isDead;
   }
   
   public void setPos(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public void setIsDead(boolean a) {
      isDead = a;
   }
   
}