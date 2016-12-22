package positionTracking;

public class GoToPosition {

	public static double distance = 0;
	public static double angle = 0;
	private PositionTracker position = Draw.position;
	
	public void findValues(double xPos, double yPos){
		double currentXPos = position.getRightXPos();
		double currentYPos = position.getRightYPos();
		System.out.println("Pos Tracker " + currentXPos + ", " + currentYPos);
		
		double xDistance = xPos - currentXPos;
		double yDistance = yPos - currentYPos;
		
		double hypot = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
		distance = hypot;
		
		angle = Math.toDegrees(Math.atan(xDistance / yDistance));

		if(xDistance < 0.05 && xDistance > -0.05){
			if (yDistance > 0){
				angle = 0;
			}
			else angle = 180;
		}
		else if(yDistance < 0.05 && yDistance > -0.05){
			if (xDistance > 0){
				angle = 90;
			}
			else angle = -90;
		}
		else if (xDistance < 0 && yDistance < 0){
			distance *= -1;
		}
		else if (xDistance > 0 && yDistance < 0){
			distance *= -1;
		}
		System.out.println("Quadrant " + xDistance + ", " + yDistance);
		System.out.println("Distance " + distance);
		System.out.println("Angle " + angle);
	}
	
	public double getDistance(){
		return distance;
	}
	
	public double getAngle(){
		return angle;
	}
}
