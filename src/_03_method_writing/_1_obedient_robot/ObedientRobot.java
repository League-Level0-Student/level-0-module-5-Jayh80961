package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String bob = JOptionPane.showInputDialog("What do you want to draw? (square,circle,triangle)");
		if(bob.equalsIgnoreCase("square")) {
		drawsquare();
		}
		if(bob.equalsIgnoreCase("triangle")) {
		drawtriangle();
		}
		if(bob.equalsIgnoreCase("circle")) {
		drawcircle();
		}




	
	
	
	
	}
	static void drawsquare() {
		Robot robot = new Robot();
		robot.setX(240);
		robot.setY(400);
		robot.setSpeed(20);
		robot.penDown();
		for(int i=0;i< 4;i++){
		robot.move(100);
		robot.turn(90);
		}
	}
	static void drawtriangle() {
		Robot robot = new Robot();
		robot.setX(400);
		robot.setY(200);
		robot.setSpeed(20);
		robot.penDown();
		for(int i=0;i< 3;i++){
		robot.move(100);
		robot.turn(120);
		}
	}
	static void drawcircle() {
		Robot robot = new Robot();
		robot.setX(500);
		robot.setY(300);
		robot.setSpeed(1000);
		robot.penDown();
		for(int i=0;i< 360;i++){
		robot.move(1);
		robot.turn(1);
		}
	}
	
}
