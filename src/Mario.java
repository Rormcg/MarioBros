import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Color;

public class Mario {
   private double speed;
   private Point2D.Double pos;
  
   Mario(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   
   
   public void draw(Graphics g) {
   g.setColor(Color.BLACK);
   g.fillRect(2,2,2,2);
   
   }
}