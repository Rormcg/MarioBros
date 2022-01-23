import java.awt.Graphics;
import java.awt.Color;

public class GoalFlag {
   private double xPos;
   
   GoalFlag(double x) {
      xPos = x;
   }
   
   public void draw(Graphics g) {
      g.setColor(new Color(108, 227, 52));
      g.fillRect((int)xPos, 130, 10, 600);
      g.setColor(new Color(39, 164, 21));
      g.fillOval((int)(xPos - 10), 115, 30, 30);
   }
   
   public double getXPos() {
      return xPos;
   }
   
   public void setXPos(double a) {
      xPos = a;
   }
}