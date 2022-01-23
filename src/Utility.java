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
      u = cream
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
      String[] marioDies = {
         "------rrrr------",
         "---p-rrrrrr-p---",
         "-ppprplpplprppp-",
         "-pprrrlpplrrrpp-",
         "-pprrlpppplrrpp-",
         "---rrllppllrr---",
         "----rpllllpr----",
         "----rppppppr----",
         "---bbbppppbbb---",
         "--rrbbrrrrbbrr--",
         "--rrrbbrrbbrrr--",
         "--rrrbyrrybrrr--",
         "---rrbbbbbbrr---"};
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
         "llllllllllllllll"};
         
      String[] questionA = {
         "-tttttttttttttt-",
         "tyyyyyyyyyyyyyyl",
         "tybyyyyyyyyyybyl",
         "tyyyytttttyyyyyl",
         "tyyyttlllttyyyyl",
         "tyyyttlyyttlyyyl",
         "tyyyttlyyttlyyyl",
         "tyyyyllytttlyyyl",
         "tyyyyyyttlllyyyl",
         "tyyyyyyttlyyyyyl",
         "tyyyyyyyllyyyyyl",
         "tyyyyyyttyyyyyyl",
         "tyyyyyyttlyyyyyl",
         "tybyyyyyllyyybyl",
         "tyyyyyyyyyyyyyyl",
         "-llllllllllllll-"};
         
      String[] questionB = {
         "-llllllllllllll-",
         "looooooooooooool",
         "loloooooooooolol",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "looooooooooooool",
         "loloooooooooolol",
         "looooooooooooool",
         "-llllllllllllll-"};
         
      String[] ground = {
         "ouuuuuuuulouuuuo",
         "oooooooooouoooou",
         "oooooooooouoooou",
         "oooooooooouoooou",
         "ooooooooooulooou",
         "ooooooooooollllo",
         "oooooooooouooool",
         "oooooooooouooool",
         "oooooooooouooool",
         "oooooooooouooool",
         "llooooooouoooool",
         "uullooooouoooool",
         "uouulllluooooool",
         "uooouuuuluoooool",
         "uooooooluoooooll",
         "olllllollllllllo"};
      
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
         "lllllllllllllllo"};
         
      String[] goomba1 = {
         "------oooo------",
         "-----oooooo-----",
         "----oooooooo----",
         "---oooooooooo---",
         "--olloooooollo--",
         "-oooulooooluooo-",
         "-oooulllllluooo-",
         "oooouluoouluoooo",
         "oooouuuoouuuoooo",
         "oooooooooooooooo",
         "-oooouuuuuuoooo-",
         "----uuuuuuuu----",
         "----uuuuuuuull--",
         "---lluuuuulllll-",
         "---llluuullllll-",
         "----lllu-lllll--"};
         
      String[] goomba2 = {
         "------oooo------",
         "-----oooooo-----",
         "----oooooooo----",
         "---oooooooooo---",
         "--olloooooollo--",
         "-oooulooooluooo-",
         "-oooulllllluooo-",
         "oooouluoouluoooo",
         "oooouuuoouuuoooo",
         "oooooooooooooooo",
         "-oooouuuuuuoooo-",
         "----uuuuuuuu----",
         "--lluuuuuuuull--",
         "-llllluuuulllll-",
         "-lllllluullllll-",
         "--llllluulllll--"};
         
      String[] goomba3 = {
         "------oooo------",
         "-----oooooo-----",
         "----oooooooo----",
         "---oooooooooo---",
         "--olloooooollo--",
         "-oooulooooluooo-",
         "-oooulllllluooo-",
         "oooouluoouluoooo",
         "oooouuuoouuuoooo",
         "oooooooooooooooo",
         "-oooouuuuuuoooo-",
         "----uuuuuuuu----",
         "--lluuuuuuuu----",
         "-llllluuuuuull--",
         "-lllllluuullll--",
         "--llllluullll---"};
         
      
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
      } else if(type == "block") {
         image = block;
      } else if(type == "brick") {
         image = brick;
      } else if(type == "questionA") {
         image = questionA;
      } else if(type == "questionB") {
         image = questionB;
      } else if(type == "ground") {
         image = ground;
      } else if(type == "goomba1") {
         image = goomba1;
      } else if(type == "goomba2") {
         image = goomba2;
      } else if(type == "goomba3") {
         image = goomba3;
      } else if(type == "marioDies") {
         image = marioDies;
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
               case 't':
                  g.setColor(new Color(255, 139, 23));
                  break;
               case 'u':
                  g.setColor(new Color(235, 204, 99));
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