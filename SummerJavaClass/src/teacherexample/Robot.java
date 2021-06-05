package teacherexample;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;

class Robot {

  private int x;
  private int y;
  private Color robotColor;

  private int thrustx;
  private int velocityx;
  private int oldError;

  public Robot(){
    robotColor = Color.red;
    x = 0;
    y = 0;
  }

  public Robot(Color inc){
    robotColor = inc;
    x = 0;
    y = 0;
  }

  public void setThrustx(int newThrust){
    thrustx = newThrust;
  }

  public void setVelocityx(int x){
    velocityx = x;
  }

  public void setOldError(int x){
    oldError = x;
  }


  public int getXcoord(){
    return x;
  }
  
  // this *changes* the position
  public void move(int dx, int dy){
    x = x+dx;
    y = y+dy;
  }

  public void move(int dx) {
    move(dx, 0);
  }

  


// we need to make sure to set the robot color to the robotcolor!
 // we need to make sure to set the robot color to the robotcolor!
  public void draw(Graphics g){
        g.setColor(robotColor);
        int quarterOver = 50/4; // 50 will become a parameter
        int halfBodyWidth = 50/2; // again 50 will generalize
        g.setColor(Color.blue);
        g.fillRect(x+quarterOver, 250 - halfBodyWidth, halfBodyWidth,halfBodyWidth); // draw head
        g.setColor(robotColor);
        g.fillRect(x,250,50,150);
        
  }

  public void erase(Graphics g){
        g.setColor(Color.white);
        int quarterOver = 50/4; // 50 will become a parameter
        int halfBodyWidth = 50/2; // again 50 will generalize
        g.fillRect(x+quarterOver, 250 - halfBodyWidth, halfBodyWidth,halfBodyWidth); // draw head
        g.fillRect(x,250,50,150);

  }
}