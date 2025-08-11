import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(9,5,West,9);
		
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
	r.putBeeper();

  }
}