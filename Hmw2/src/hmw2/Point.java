package hmw2;

import java.util.Scanner;

public class Point extends Graphic{
	
	private int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("draw a point with x: " + this.x + " and y: " + this.y);
	}
	
	
}
