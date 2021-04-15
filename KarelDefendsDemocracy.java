
package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		checkRectangle();
		cleanRectangle();
		cleanRectangleAgain();
		checkRectangle();
		cleanRectangleAgain();
		MoveToWall();
		
		
	}
public void pickBeeps() {
	while(beepersPresent()) {
		pickBeeper();
		
	}
}
public void MoveToWall() {
	while(noBeepersPresent()) {
		move();
	}
}
public void cleanRectangleAgain() {
	if(beepersPresent()) {
				pickBeeps();
				turnAround();
				move();
				turnRight();
	} else {
					turnAround();
					move();
					turnRight();
					move();
					move();
					checkRectangle();
					
		}
	}
	

public void checkRectangle() {
	if(beepersPresent()) {
		move();
		move();
	} else {
		cleanRectangle();
	}
}
public void cleanRectangle() {
	if(noBeepersPresent()) {
		turnLeft();
		move();
		if(beepersPresent()) {
			pickBeeps();
			turnAround();
			move();
			move();
		} else {
			turnAround();
			move();
			move();
			cleanRectangleAgain();
		}
		
}
	

	}
}