import java.awt.geom.Point2D;
import java.awt.Graphics;

public class Goomba {
   private Point2D.Double pos;
   private Point2D.Double size = new Point2D.Double(48, 48);
   
   Goomba(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
   
   public Point2D.Double getPos() {
      return pos;
   }
   
   public Point2D.Double getSize() {
      return size;
   }
   
   public void setPos(double x, double y) {
      pos = new Point2D.Double(x, y);
   }
}