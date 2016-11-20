package positionTracking;

public class PositionTracker {
	
	private double xLeftPos = 0;
	private double yLeftPos = 0;
	private double xRightPos = 0;
	private double yRightPos = 0;
	private double lastLeftDistance = 0;
	private double lastRightDistance = 0;


	public PositionTracker(){
	}
	
	public void setPosistions(double newAngle, double distance){
		System.out.println("Input Distance " + distance);
		System.out.println("LastLeftDistance " + lastLeftDistance);
		double angle = newAngle;
		double leftDistance = distance - lastLeftDistance;
		System.out.println("LeftDistance " + leftDistance);
		System.out.println("xPos, yPos " + xLeftPos + ", " + yLeftPos);
		lastLeftDistance = distance;
		if(distance < 0 && angle > 0){
			xLeftPos += Math.sin(Math.toRadians(angle)) * leftDistance;
			yLeftPos += Math.cos(Math.toRadians(angle)) * leftDistance;
			System.out.println("Neg Distance, Pos Angle");
		}
		else if(distance < 0 && angle < 0){
			xLeftPos += Math.sin(Math.toRadians(angle)) * leftDistance;
			yLeftPos += Math.cos(Math.toRadians(angle)) * leftDistance;
			System.out.println("Neg Distance, Neg Angle");
		}
		else if(distance > 0 && angle < 0){
			xLeftPos += Math.sin(Math.toRadians(angle)) * leftDistance;
			yLeftPos += Math.cos(Math.toRadians(angle)) * leftDistance;			
			System.out.println("Pos Distance, Neg Angle");
		}
		else{
			xLeftPos += Math.sin(Math.toRadians(angle)) * leftDistance;
			yLeftPos += Math.cos(Math.toRadians(angle)) * leftDistance;
			System.out.println("Pos Distance, Pos Angle");
		}
		
		System.out.println("xPos, yPos after calc " + xLeftPos + ", " + yLeftPos);

		
		double rightDistance = distance - lastRightDistance;
		lastRightDistance = distance;
		
		
		
		xRightPos = Math.cos(angle) * rightDistance;
		yRightPos = Math.sin(angle) * rightDistance;
	}
	
	public double getLeftXPos(){
		return xLeftPos;
	}
	
	public double getRightXPos(){
		return xRightPos;
	}
	
	public double getLeftYPos(){
		return yLeftPos;
	}
	
	public double getRightYPos(){
		return yRightPos;
	}
}
