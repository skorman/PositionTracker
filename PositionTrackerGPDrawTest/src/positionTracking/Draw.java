package positionTracking;

import java.util.Scanner;

import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class Draw {

	SketchPad paper;
	static DrawingTool pen;
	double xPos;
	double yPos;
	double distance;
	Scanner in;
	public static PositionTracker position = new PositionTracker();
	GoToPosition find = new GoToPosition();
	
	public Draw(){

		paper = new SketchPad(1000, 1000);
		pen = new DrawingTool(paper);
		in = new Scanner(System.in);
		xPos = 0;
		yPos = 0;
	}
	
	public void draw(){
		/*
		double distance = 0;
		double angle = 10;  
		pen.move(0, 0);
		pen.setDirection(90);
		pen.setDirection(-(angle + 270));
		pen.forward(0);
		distance += 0;
		position.setPosistions(angle, distance);
		*/
		//System.out.println(position.getLeftXPos() == pen.getXPos() && position.getLeftYPos() == pen.getYPos());
		//System.out.println("Pos " + position.getLeftXPos() + " " + position.getLeftYPos());
		//System.out.println("Expected " + pen.getXPos() + " " + pen.getYPos());
		
		/*
		for(int i = -90; i <= 90; i += 20){
			angle = i;
			distance = 0;
			
			pen.move(200, -30);;
			pen.setDirection(-(angle + 270));
			pen.forward(360);
			distance += 360;
			position.setPosistions(angle, 360);
			
			System.out.println("Pos " + position.getLeftXPos() + " " + position.getLeftYPos());
			System.out.println("Expected " + pen.getXPos() + " " + pen.getYPos());
			System.out.println();
		}
		for(int i = -90; i <= 90; i += 20){
			angle = i;
			distance = 0;
			
			pen.move(200, -30);;
			pen.setDirection(-(angle + 270));
			pen.forward(-360);
			distance += -360;
			position.setPosistions(angle, -360);
			
			System.out.println("Pos " + position.getLeftXPos() + " " + position.getLeftYPos());
			System.out.println("Expected " + pen.getXPos() + " " + pen.getYPos());
			System.out.println();
		}
		*/
		while(true){
			doSomething();
		}
	}
	private void doSomething(){
		xPos = in.nextDouble();
		yPos = in.nextDouble();
		System.out.println("Input " + xPos + ", " + yPos);
		
		find.findValues(xPos, yPos);
		
		distance += find.getDistance();
		position.setPosistions(find.getAngle(), distance);

		
		pen.setDirection(-(find.getAngle() + 270));
		pen.forward(find.getDistance());
		
		System.out.println("Expected " + pen.getXPos() + ", " + Math.round(pen.getYPos()));
		System.out.println("Position " + position.getLeftXPos() + ", " + position.getLeftYPos());
	}
	
	

	
	
	
	
	
	
	
	
	
	/*
	double distance = 0;
	
	pen.move(0, 0);
	pen.setDirection(0);

	pen.turnLeft(45);
	pen.forward(60);
	distance += 60;
	PositionTracker.setPosistions(45, distance);
	
	System.out.println(PositionTracker.getLeftXPos() == pen.getXPos() && PositionTracker.getLeftYPos() == pen.getYPos());

	
	pen.setDirection(0);
	pen.turnLeft();
	pen.forward(43);
	distance += 43;
	PositionTracker.setPosistions(90, distance);
	
	System.out.println(PositionTracker.getLeftXPos() == pen.getXPos() && PositionTracker.getLeftYPos() == pen.getYPos());
	
	pen.setDirection(0);
	pen.turnLeft(54);
	pen.forward(23);
	distance += 23;
	PositionTracker.setPosistions(54, distance);
	
	System.out.println(PositionTracker.getLeftXPos() == pen.getXPos() && PositionTracker.getLeftYPos() == pen.getYPos());

	pen.setDirection(0);
	pen.turnRight(104);
	pen.forward(23);
	distance += 23;
	PositionTracker.setPosistions(-104, distance);
	
	System.out.println(PositionTracker.getLeftXPos() == pen.getXPos() && PositionTracker.getLeftYPos() == pen.getYPos());

	pen.setDirection(0);
	pen.turnRight(104);
	pen.forward(103);
	distance += 103;
	PositionTracker.setPosistions(-104, distance);
	
	System.out.println(PositionTracker.getLeftXPos() == pen.getXPos() && PositionTracker.getLeftYPos() == pen.getYPos());
	*/
}
