package hmw2;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(10, 15); // composition
		Graphic g = new Circle(p, 34);//polymorphism
		Point p1 = new Point(11,25);
		Point p2 = new Point(100,150);
		Graphic g1 = new Line(p1,p2);
		
		g1.draw();
	}

}
