import java.awt.Graphics;
import java.awt.Color;

public class Utility {
   
   
   public static void drawImage(double x, double y, int pixelSize, String type, Graphics g) {
      /*
      r = red
      o = brown
      p = peach
      l = black
      b = blue
      y = yellow
      */
      String[] marioStill = {
         "---rrrrr----",
         "--rrrrrrrrr-",
         "--ooopplp---",
         "-opoppplppp-",
         "-opooppplppp",
         "-ooppppllll-",
         "---ppppppp--",
         "---rbrrr----",
         "-rrrbrrbrrr-",
         "rrrrbbbbrrrr",
         "wwrbybbybrww",
         "wwwbbbbbbwww",
         "wwbbbbbbbbww",
         "--bbb--bbb--",
         "-ooo----ooo-",
         "oooo----oooo"
      };
      String[] marioMoving1 = {
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "--bbbbbrrbb-----",
         "ppbbbbbrrrbbbppp",
         "ppp-bbbryrrrbbpp",
         "pp--rrrrrrrrr--b",
         "---rrrrrrrrrrrbb",
         "---rrrrrrrrrrrbb",
         "--bbrrrr---rrrbb",
         "--bbb-----------",
         "---bbb----------"
      };
      String[] marioMoving2 = {
         "----------------",
         "----------------",
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "-----bbbbrb-p---",
         "----pbbbbbbppp--",
         "---pprbbbbbpp---",
         "---bbrrrrrrr----",
         "---brrrrrrrr----",
         "--bbrrrr-rr-----",
         "--b----bbb------",
         "-------bbbb-----"
      };
      String[] marioMoving3 = {
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "-----bbrbbb-----",
         "----bbbrrrbb----",
         "----bbrrryrrp---",
         "----bbbrrrrrr---",
         "----rbbppprrr---",
         "-----rbpprrr----",
         "------rrrbbb----",
         "------bbbbbbb---",
         "------bbbb------",
         "----------------"
               };
      String[] image = marioStill;
      if(type == "mario-still") {
         image = marioStill;
      } else if(type == "mario-moving1") {
         image = marioMoving1;
      } else if(type == "mario-moving2") {
         image = marioMoving2;
      }
      
      for(int r = 0; r < image.length; r ++) {
         for(int c = 0; c < image[r].length(); c++) {
            boolean drawPixel = true;
            switch(image[r].charAt(c)) {
               case 'r':
                  g.setColor(Color.RED);
                  break;
               case 'b':
                  g.setColor(Color.BLUE);
                  break;
               case 'w':
                  g.setColor(Color.WHITE);
                  break;
               case 'o':
                  g.setColor(new Color(128, 64, 0));
                  break;
               case 'l':
                  g.setColor(Color.BLACK);
                  break;
               case 'p':
                  g.setColor(new Color(251, 128, 121));
                  break;
               case 'y':
                  g.setColor(Color.YELLOW);
                  break;
               default:
                  drawPixel = false;
                  break;
            }
            if(drawPixel) {
               g.fillRect((int)(x - (pixelSize * image[r].length()) + (c * pixelSize)), (int)(y - (pixelSize * image.length) + (r * pixelSize)), pixelSize, pixelSize);
            }
         }
      }
      
   }
   
}