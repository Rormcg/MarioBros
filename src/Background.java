import java.awt.Color;
import java.awt.Graphics;

public class Background {
   
   
   public void draw(Graphics g) {
      g.setColor(new Color(113, 255, 255));
      g.fillRect(0, 0, 600, 600);
   }
}