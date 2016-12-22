package positionTracking;

import java.util.Scanner;

public class PositionTrackingMain {
	
	private static Scanner in;
	private static boolean isPressed = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			whileHeld();
		}
		/*
		Draw draw = new Draw();
		
		draw.draw();
		*/
	}
	
	public static void whenPressed(){
		System.out.println(isPressed);
		in = new Scanner(System.in);
		int x = in.nextInt();
		if(!isPressed){
			if (x == 0){
				isPressed = true;
				System.out.println("scheduling");
			}
		}
		if(isPressed && x != 0){
			isPressed = false;
		}
	}
	
	public static void whileHeld(){
		System.out.println(isPressed);
		in = new Scanner(System.in);
		int x = in.nextInt();
		if(isPressed){
			if(x != 0){
				isPressed = false;
				System.out.println("ending");
			}
		}
		else {
			if(x == 0) {
				isPressed = true;
				System.out.println("scheduling");
			}
		}
	}
}
