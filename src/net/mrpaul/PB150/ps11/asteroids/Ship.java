package net.mrpaul.PB150.ps11.asteroids;

import java.awt.*;

public class Ship extends Polygon{

	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}
}

/*
int[] xpoint = {1, 2};
	int[] ypoint = {3, 4};
	int npoint = 5;
	Point p1 = new Point(100, 100);
	private Polygon  poly1 = new Polygon(4, 4,4);
	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	public void paint (Graphics brush){
		brush.fillPolygon(p);
	}
 */
