import java.awt.Color;
import java.awt.Graphics;

public class Background {
   
   
   public void draw(Graphics g) {
      g.setColor(new Color(69, 153, 222));
      g.fillRect(0, 0, 600, 600);
   }
}