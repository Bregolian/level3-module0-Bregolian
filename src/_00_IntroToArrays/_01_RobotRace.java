package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots=new Robot[5];
		Random r=new Random();
		int distanceTraveled0;
		int distanceTraveled1;
		int distanceTraveled2;
		int distanceTraveled3;
		int distanceTraveled4;
		int distance;
		for (int i = 0; i < robots.length; i++) {
			robots[i]=new Robot();
			robots[i].setX(50+(100*i));
			robots[i].setY(550);
			robots[i].show();
			robots[i].setSpeed(30);
		}
		while (robots[0].getX()>0&&robots[1].getX()>0&&robots[2].getX()>0&&robots[3].getX()>0&&robots[4].getX()>0) {
		for (int i = 0; i < robots.length; i++) {
			robots[i].move(r.nextInt(50));
			if (robots[i].getX()<500&&robots[i].getY()<0) {
				robots[i].turn(90);
			}
			if (robots[i].getX()>10000&&robots[i].getY()<0) {
				robots[i].turn(90);
			}
			if (robots[i].getX()>10000&&robots[i].getY()>550) {
				robots[i].turn(90);
			}
		}
		}
		int winner=100;
		for (int i = 0; i < robots.length; i++) {
			if (robots[i].getY()<winner) {
				winner=i+1;
			}
		}
		System.out.println("Robot "+winner+" Wins!");
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
