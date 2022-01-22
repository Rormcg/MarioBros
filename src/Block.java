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
      if(type == "brick") {
         g.setColor(Color.RED);
      } else if(type == "stone") {
         g.setColor(Color.ORANGE);
      } else if(type == "question") {
         g.setColor(Color.ORANGE);
      } else if(type == "ground") {
         g.setColor(Color.BLACK);
      }
      
      g.fillRect((int)pos.x, (int)pos.y, (int)size.x, (int)size.y);
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
   
}