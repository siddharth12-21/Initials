import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);
    World.setDelay(1);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(9,4,West,90);
		
    // examples of commands you can invoke on a Robot
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
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();

    Robot n = new Robot(9,6,South,90);
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.move();
    n.move();
    n.move();
    n.move();
    n.move();
    n.turnLeft();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.turnLeft();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.turnLeft();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.move();
    n.move();
    n.turnLeft();
    n.turnLeft();
    n.turnLeft();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
    n.move();
    n.putBeeper();
	r.putBeeper();

  }
}