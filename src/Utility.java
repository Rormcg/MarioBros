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
      String[] brick = {
         "oooooooloooooool",
         "oooooooloooooool",
         "oooooooloooooool",
         "llllllllllllllll",
         "oooloooooooloooo",
         "oooloooooooloooo",
         "oooloooooooloooo",
         "llllllllllllllll",
         "oooooooloooooool",
         "oooooooloooooool",
         "oooooooloooooool",
         "llllllllllllllll",
         "oooloooooooloooo",
         "oooloooooooloooo",
         "oooloooooooloooo",
         "llllllllllllllll"}
         
      String[] question = {
         "lppppppppppppppl",
         "pyyyyyyyyyyyyyyl",
         "pybyyyyyyyyyyybl",
         "pyyyyppppppyyyyl",
         "pyyyppllllppyyyl",
         "pyyypplyyypplyyl",
         "pyyypplyyypplyyl",
         "pyyyyllyyppplyyl",
         "pyyyyyyypplllyyl",
         "pyyyyyyypplyyyyl",
         "pyyyyyyyyllyyyyl",
         "pyyyyyyyppyyyyyl",
         "pyyyyyyypplyyyyl",
         "pybyyyyyyllyybyl",
         "pyyyyyyyyyyyyyyl",
         "llllllllllllllll"}
         
      String[] ground = {
         "oyyyyyyyyloyyyyo",
         "ooooooooooyooooy",
         "ooooooooooyooooy",
         "ooooooooooyooooy",
         "ooooooooooyloooy",
         "ooooooooooollllo",
         "ooooooooooyooool",
         "ooooooooooyooool",
         "ooooooooooyooool",
         "ooooooooooyooool",
         "lloooooooyoooool",
         "yylloooooyoooool",
         "yoyyllllyooooool",
         "yoooyyyylyoooool",
         "yoooooolyoooooll",
         "olllllollllllllo"}
      
      String[] block = {
         "oppppppppppppppl",
         "poppppppppppppll",
         "ppopppppppppplll",
         "pppoppppppppllll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppppoooooooollll",
         "ppplllllllllolll",
         "ppllllllllllloll",
         "plllllllllllllol",
         "lllllllllllllllo"}
      
      String[] image = marioStill;
      if(type == "mario-still") {
         image = marioStill;
      } else if(type == "mario-moving1") {
         image = marioMoving1;
      } else if(type == "mario-moving2") {
         image = marioMoving2;
      } else if(type == "mario-moving3") {
         image = marioMoving3;
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