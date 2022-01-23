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
         Utility.drawImage(pos.x, pos.y, 3, "brick", g);
      } else if(type == "block") {
         Utility.drawImage(pos.x, pos.y, 3, "block", g);
      } else if(type == "question") {
         Utility.drawImage(pos.x, pos.y, 3, "question", g);
      } else if(type == "ground") {
         Utility.drawImage(pos.x, pos.y, 3, "ground", g);
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
   
}