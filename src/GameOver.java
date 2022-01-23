import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;


public class GameOver {
   private int timer = 200;
   
   public void draw(Graphics g) {
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, 650, 650);
      Utility.drawImage(275, 275 - timer, 3, "marioDies", g);
      g.setColor(Color.ORANGE);
      g.setFont(new Font("Sans-serif", Font.BOLD, 34));
      g.drawString("Game        Over", 170, 300);
   }
   
   public void update() {
      if(timer > 0) {
         timer -= 4;
      }
   }
}