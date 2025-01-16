package _02_code_flow._1_robot_square;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot rob = new Robot();

		// // PEN. Put the robot's pen down so it can draw, Use this command:
		rob.penDown();

		// // SPEED. Make the robot move quickly. Use this command:
		rob.setSpeed(100);

		// // COUNT. Create an int variable that will count how many sides of the square we
		// // have drawn.
		// // The start value will be zero because no sides have yet been drawn. Use this
		// // code:
		int count = 0;
		int move = 100;
		// // DRAW. Draw a line. Use this command:
		// rob.move(10000);

		// // TURN. Turn 90 degrees. Use this command:
		// rob.turn(90);

		// COLOR.   Have the robot set a random pen color:      setRandomPenColor()
		// DRAW.    Move the robot (5*count) pixels
		//          count is the name of the variable you created earlier

		// // INCREASE COUNT. Add one to the number of sides that have now been drawn like
		// // this:
		// count += 1; 

		// Run the program. Did the Robot draw a line and turn?

		// LOOP. Make a while loop and move the DRAW, TURN, and INCREASE COUNT code
		// so it is between the curly braces like the example below.
		// The code in the loop will now repeat 4 times to draw a square.
		int PentagonCrazy = 6;
		int turn = 61;
		rob.hide();
		// while ( count < 100 ) {
		// 	rob.setRandomPenColor();
		// 	rob.move(move);
		// 	rob.turn(45);
		// 	count++;
		// 	move--;
		// }
		count = 0;
		// while (count < 200){
		// 	rob.move(count);
		// 	rob.turn(turn);
		// 	count++;
		// }
		// Run the program again. Did your Robot draw a square?
		int baseSize = 200;
		int flameSize = 130;
		while (count < 25){
			rob.turn(45);
			rob.move(64);
			rob.turn(-40);
			rob.setPenColor(247, 37, 37);
			rob.move(flameSize);
			rob.turn(170);
			rob.move(flameSize);
			rob.turn(64);
			rob.setPenColor(0,0,0);
			rob.move(baseSize);
			count++;
		}
	}
}
