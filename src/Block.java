import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Color;

public class Block {
   private Point2D.Double pos;
   private Point2D.Double size = new Point2D.Double(48, 48);
   private String type;
  
   
   Block(double x, double y, String type) {
      pos = new Point2D.Double(x, y);
      this.type = type;
   }
   
   public void draw(Graphics g) {
      g.setColor(Color.RED);
      g.fillRect((int)pos.x, (int)pos.y, (int)size.x, (int)size.y);
   }
   
   public Point2D.Double getPos() {
      return pos;
   }
   
   public Point2D.Double getSize() {
      return size;
   }
   
}