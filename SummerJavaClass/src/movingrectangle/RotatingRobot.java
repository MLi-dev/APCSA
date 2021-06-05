package movingrectangle;

public class RotatingRobot extends Robot {

	  private int wheelangle;

	   // what if our robot primarily *rotates*?
	   // this method overrides the x movement method of the
	   // parent class
	   public void rotate(int angle){
	     wheelangle = angle;
	     
	   }


	   public String toString(){
	     return "This is a rotating robot with wheelangle:" + wheelangle;
	   }


	}