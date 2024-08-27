import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is Fred
    Robot fred = new Robot(5,1,East,9);
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

		fred.move();
		fred.putBeeper();
		fred.move();
		fred.putBeeper();
		fred.move();
		fred.turnLeft();
    fred.move();
    fred.putBeeper();
    turnRight(fred);

  }
    public static void turnRight(Robot placeHolder){
      for(int i =0; i<3;i++){
        placeHolder.turnLeft();
      }
    }
  
}