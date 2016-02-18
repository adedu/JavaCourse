package hmw2;

public class Line extends Graphic{
	
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("The two points of the line are: " + p1 + p2 );;
	}
	
	

}
