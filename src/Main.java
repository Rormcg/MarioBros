//Group 112

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JComponent implements ActionListener {
   private JFrame frame;
   private Container content;
   private int screenWidth = 600, screenHeight = 600;
   private Timer t;
   private int level = 1;
   private String scene = "Game";
   
   private Mario mario = new Mario(80, 80);
   private Block blocks[] = new Block[0];
   private Goomba goombas[] = new Goomba[0];
   private Background background = new Background();
   private GameOver gameOver = new GameOver();
   private GoalFlag goalFlag;
   
   
   Main() {
      setUp();
      setUpLevel(level);
      
   }
   
   private void setUp() {
      frame = new JFrame("Super Mario Bros.");
      content = frame.getContentPane();
      content.add(this);
      content.setBackground(new Color(113, 255, 255));
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(screenWidth + 17, screenHeight + 40);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      t = new Timer(1, this);
      t.start();
      frame.addKeyListener(mario);
   }
   
   
   public void paintComponent(Graphics g) {
      if(scene == "Game") {
         background.draw(g);
         mario.draw(g);
         goalFlag.draw(g);
         for(int i = 0; i < blocks.length; i++) {
            blocks[i].draw(g);
         }
         for(int i = 0; i < goombas.length; i ++) {
            goombas[i].draw(g);
         }
      } else if(scene == "GameOver") {
         gameOver.draw(g);
      }
   }
   
   public void actionPerformed(ActionEvent e) {
      if(scene == "Game") {
         mario.update(marioCanMove("up"), marioCanMove("down"), marioCanMove("left"), marioCanMove("right"));
         
         //scroll if mario reaches a certain point
         if(mario.getPos().x >= screenWidth - 250) {
            for(int i = 0; i < blocks.length; i ++) {
               blocks[i].setPos(blocks[i].getPos().x - (-screenWidth + 250 + mario.getPos().x), blocks[i].getPos().y);
            }
            for(int i = 0; i < goombas.length; i ++) {
               goombas[i].setPos(goombas[i].getPos().x - (-screenWidth + 250 + mario.getPos().x), goombas[i].getPos().y);
            }
            goalFlag.setXPos(goalFlag.getXPos() - (-screenWidth + 250 + mario.getPos().x));
            mario.setPos(screenWidth - 250, mario.getPos().y);
         }
         
         for(int i = 0; i < goombas.length; i ++) {
            goombas[i].update(goombaCanMove("down", goombas[i]), goombaCanMove("left", goombas[i]), goombaCanMove("right", goombas[i]));
         }
         
         checkForMarioHit();
         if(mario.getPos().y > screenHeight + 20) {
            mario.setIsDead(true);
         }
         if(mario.getIsDead()) {
            scene = "GameOver";
         }
         
      } else if(scene == "GameOver") {
         gameOver.update();
      }
      
      
      repaint();
   }
   
   public boolean marioCanMove(String dir) {
      boolean canMove = true;
      Mario a = mario;
      for(int i = 0; i < blocks.length; i ++) {
         Block b = blocks[i];
         if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
            if(b.getType() == "questionA") {
               b.setType("questionB");
            }
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
         }
         
         else if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x + 2 && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
            a.setPos(b.getPos().x - a.getSize().x, a.getPos().y);
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x - 2 && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
            a.setPos(b.getPos().x + b.getSize().x, a.getPos().y);
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y - 2 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y + b.getSize().y);
            if(b.getType() == "questionA") {
               b.setType("questionB");
            }
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y + 2 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x >= b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y - a.getSize().y);
         }
         
         else if(a.getPos().x + a.getSize().x > screenWidth) {
            a.setPos(screenWidth - a.getSize().x, a.getPos().y);
            canMove = false;
         } else if(a.getPos().x < 0) {
            a.setPos(0, a.getPos().y);
            canMove = false;
         }
         
      }
      
      return canMove;
   }
   
   public void checkForMarioHit() {
      Mario a = mario;
      for(int i = 0; i < goombas.length; i ++) {
         Goomba b = goombas[i];
         a.setSize(42, a.getSize().y);
         if(!a.getIsDead() && !b.getIsDead()) {
            if(a.getPos().y == b.getPos().y + b.getSize().y && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x) {
               a.setIsDead(true);
            } else if(a.getPos().x + a.getSize().x == b.getPos().x && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y) {
               a.setIsDead(true);
            } else if(a.getPos().x == b.getPos().x + b.getSize().x && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y) {
               a.setIsDead(true);
            } else if(marioCanMove("down") && a.getPos().y + a.getSize().y >= b.getPos().y && a.getPos().y + a.getSize().y <= b.getPos().y + b.getPos().y * 0.1 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x) {
               b.setIsDead(true);
               a.setJumping(true);
               a.setJumpingTimer(40);
            }
            
            else if(a.getPos().y == b.getPos().y + b.getSize().y - 2 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x) {
              a.setIsDead(true);
            } else if(a.getPos().x + a.getSize().x == b.getPos().x + 2 && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y) {
               a.setIsDead(true);
            } else if(a.getPos().x == b.getPos().x + b.getSize().x - 2 && a.getPos().y > b.getPos().y - b.getSize().y && a.getPos().y < b.getPos().y + b.getSize().y) {
               a.setIsDead(true);
            } else if(marioCanMove("down") && a.getPos().y + a.getSize().y >= b.getPos().y && a.getPos().y + a.getSize().y <= b.getPos().y + b.getPos().y * 0.1 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x >= b.getPos().x) {
               b.setIsDead(true);
               a.setJumping(true);
               a.setJumpingTimer(40);
            }
         }
      }
      a.setSize(48, a.getSize().y);
   }
   
   public boolean goombaCanMove(String dir, Goomba a) {
      boolean canMove = true;
      for(int i = 0; i < blocks.length; i ++) {
         Block b = blocks[i];
         if(Math.abs(mario.getPos().x - a.getPos().x) > 500) {
            canMove = false;
         }
         if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x && a.getPos().y + a.getSize().y > b.getPos().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x && a.getPos().y + a.getSize().y > b.getPos().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
         }
         
         else if(dir == "right" && (a.getPos().x + a.getSize().x == b.getPos().x + 2 && a.getPos().y + a.getSize().y > b.getPos().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
            a.setPos(b.getPos().x - a.getSize().x, a.getPos().y);
         } else if(dir == "left" && (a.getPos().x == b.getPos().x + b.getSize().x - 2 && a.getPos().y + a.getSize().y > b.getPos().y && a.getPos().y < b.getPos().y + b.getSize().y)) {
            canMove = false;
            a.setPos(b.getPos().x + b.getSize().x, a.getPos().y);
         } else if(dir == "up" && (a.getPos().y == b.getPos().y + b.getSize().y - 2 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x > b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y + b.getSize().y);
         } else if(dir == "down" && (a.getPos().y + a.getSize().y == b.getPos().y + 2 && a.getPos().x < b.getPos().x + b.getSize().x && a.getPos().x + a.getSize().x >= b.getPos().x)) {
            canMove = false;
            a.setPos(a.getPos().x, b.getPos().y - a.getSize().y);
         }
         
         else if(dir == "right" && mario.getPos().x + mario.getSize().x >= goalFlag.getXPos()) {
            mario.setPos(goalFlag.getXPos() - mario.getSize().x, mario.getPos().y);
            canMove = false;
         }
      }
      
      return canMove;
   }
   
   public void setUpLevel(int level) {
      /*
      g = ground blocks
      b = bricks
      x = stone blocks
      ? = question blocks
      ! = goal flag
      o = goomba
      @ = mario
      */
      
      String levels[][] = {
         {
         "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
         "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
         "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
         "------------------------------------------------------------------------------------------------------------------------------------------------------xx------------------------------------",
         "-----------------------------------------------------------------------------------------------------------------------------------------------------xxx------------------------------------",
         "--------------------?--------------------bbbbbbbb---bbb?--------------?-----------bbb----b??b-------------------------------------------------------xxxx------------------------------------",
         "---------------------------------------------------------------------------------------------------------------------------------------------------xxxxx--------------bbb-------------------",
         "--------------------------------------------------------------------------------------------------x-------------xx--x-----------------------------xxxxxx--------------bbb-------------------",
         "----------------?-b?b?b---------------b?b--------------b-----b?----?--?--?-----b----------bb-----xx--xx--------xxx--xx---------bb?b--------------xxxxxxx-------------bbbbb------------------",
         "------------------------------------------------------------------------------------------------xxx--xxx------xxxx--xxx-------------------------xxxxxxxx---------!---bbbbb------------------",
         "---@-------------o------o--------------o--------------o-----o-o--------------o--------o---o----xxxx--xxxx----xxxxx--xxxx-----------------------xxxxxxxxx---------x---bbbbb------------------",
         "gggggggggggggggggggggggggggggg--ggggggggggggggg---gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg--gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg"
         },
         
         {
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------"
         },
         
         {
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------",
         "-----------------------------------------------------------------------"
         }
      };
      
      blocks = new Block[0];
      for(int r = 0; r < levels[level - 1].length; r++) {
         for(int c = 0; c < levels[level - 1][r].length(); c ++) {
            switch(levels[level - 1][r].charAt(c)) {
               case 'b':
                  addToBlocks(new Block(c * 48, 26 + r * 48, "brick"));
                  break;
               case '!':
                  goalFlag = new GoalFlag((c * 48) + 19);
                  break;
               case 'g':
                  addToBlocks(new Block(c * 48, 26 + r * 48, "ground"));
                  break;
               case 'x':
                  addToBlocks(new Block(c * 48, 26 + r * 48, "block"));
                  break;
               case '?':
                  addToBlocks(new Block(c * 48, 26 + r * 48, "questionA"));
                  break;
               case 'o':
                  addToGoombas(new Goomba(c * 48, 26 + r * 48));
                  break;
               case '@':
                  mario = new Mario(c * 48, 26 + r * 48);
                  frame.addKeyListener(mario);
                  break;
            }
         }
      }
      
   }
   
   public void addToBlocks(Block addElement) {
      Block[] a = new Block[blocks.length + 1];
      for(int i = 0; i < a.length - 1; i ++) {
         a[i] = blocks[i];
      }
      a[a.length - 1] = addElement;
      blocks = a;
   }
   
   public void addToGoombas(Goomba addElement) {
      Goomba[] a = new Goomba[goombas.length + 1];
      for(int i = 0; i < a.length - 1; i ++) {
         a[i] = goombas[i];
      }
      a[a.length - 1] = addElement;
      goombas = a;
   }
}

class RunMain{
   public static void main(String[] args) {
      Main main = new Main();
   }
}