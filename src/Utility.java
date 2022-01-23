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
      String[] marioStillA = {
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
      String[] marioMoving1A = {
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "--rrrrrbbrr-----",
         "wwrrrrrbbbrrrwww",
         "www-rrrbybbbrrww",
         "ww--bbbbbbbbb--o",
         "---bbbbbbbbbbboo",
         "---bbbbbbbbbbboo",
         "--oobbbb---bbboo",
         "--ooo-----------",
         "---ooo----------"
      };
      String[] marioMoving2A = {
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "-----rrrrbr-w---",
         "----wrrrrrrwww--",
         "---wwbrrrrrww---",
         "---oobbbbbbb----",
         "---obbbbbbbb----",
         "--oobbbb-bb-----",
         "--o----ooo------",
         "-------oooo-----"
      };
      String[] marioMoving3A = {
         "------rrrr------",
         "-----rrrrrrrrr--",
         "-----ooopplp----",
         "----opoppplppp--",
         "----opooppplppp-",
         "----ooppppllll--",
         "------ppppppp---",
         "-----rrbrrr-----",
         "----rrrbbbrr----",
         "----rrbbbybbw---",
         "----rrrbbbbbb---",
         "----brrwwwbbb---",
         "-----brwwbbb----",
         "------bbbooo----",
         "------ooooooo---",
         "------oooo------"
               };
      String[] marioStillB = {
         "----rrrrr---",
         "-rrrrrrrrr--",       
         "---plppooo--",        
         "-ppplpppopo-",       
         "ppplpppoopo-",       
         "-llllppppoo-",       
         "--ppppppp---",        
         "----rrrbr---",        
         "-rrrbrrbrrr-",         
         "rrrrbbbbrrrr",         
         "wwrbybbybrww",         
         "wwwbbbbbbwww",         
         "wwbbbbbbbbww",         
         "--bbb--bbb--",         
         "-ooo----ooo-",         
         "oooo----oooo",         
      };
      String[] marioMoving1B = {
         "------rrrr------", 
         "--rrrrrrrrr-----",        
         "----plppooo-----",         
         "--ppplpppopo----",         
         "-ppplpppoopo----",         
         "--llllppppoo----",         
         "---ppppppp------",         
         "-----rrbbrrrrr--",         
         "wwwrrrbbbrrrrrww",         
         "wwrrbbbybrrr-www",         
         "o--bbbbbbbbb--ww",         
         "oobbbbbbbbbbb---",         
         "oobbbbbbbbbbb---",         
         "oobbb---bbbboo--",         
         "-----------ooo--",         
         "----------ooo---"    
      };
      String[] marioMoving2B = {
         "------rrrr------", 
         "--rrrrrrrrr-----",         
         "----plppooo-----",         
         "--ppplpppopo----",         
         "-ppplpppoopo----",         
         "--llllppppoo----",         
         "---ppppppp------",         
         "---w-rbrrrr-----",         
         "--wwwrrrrrrw----",         
         "---wwrrrrrbww---",         
         "----bbbbbbboo---",         
         "----bbbbbbbbo---",         
         "-----bb-bbbboo--",         
         "------ooo----o--",         
         "-----oooo-------" 
      };
      String[] marioMoving3B = {
         "------rrrr------",
         "--rrrrrrrrr-----",         
         "----plppooo-----",         
         "--ppplpppopo----",         
         "-ppplpppoopo----",         
         "--llllppppoo----",         
         "---ppppppp------",         
         "-----rrrbrr-----",         
         "----rrbbbrrr----",         
         "---wbbybbbrr----",         
         "---bbbbbbrrr----",         
         "---bbbwwwrrb----",         
         "----bbbwwrb-----",         
         "----ooobbb------",         
         "---ooooooo------",         
         "------oooo------"   
      };
      
      String[] image = marioStillA;
      if(type == "mario-stillA") {
         image = marioStillA;
      } else if(type == "mario-moving1A") {
         image = marioMoving1A;
      } else if(type == "mario-moving2A") {
         image = marioMoving2A;
      } else if(type == "mario-moving3A") {
         image = marioMoving3A;
      } else if(type == "mario-stillB") {
         image = marioStillB;
      } else if(type == "mario-moving1B") {
         image = marioMoving1B;
      } else if(type == "mario-moving2B") {
         image = marioMoving2B;
      } else if(type == "mario-moving3B") {
         image = marioMoving3B;
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
               g.fillRect((int)(x + (c * pixelSize)), (int)(y + (r * pixelSize)), pixelSize, pixelSize);
            }
         }
      }
      
   }
   
}