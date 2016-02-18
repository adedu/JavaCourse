package hmw2;
import java.util.Scanner;

public class Circle extends Graphic {
	
	private Point p; // composition
	private int r;
	
	
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}


//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		System.out.print("Draw a circle with radius: " + this.r + " and center: ");
//		this.p.draw();
//	}

}
