package net.mrpaul.PB150.ps11.asteroids;


import java.awt.*;

public class Ship extends Polygon{
	int[] xPoints = {100, 120};
	int[] yPoints = {20, 0};
	int nPoints = 4;

	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	/**
	 * draws the Ship instance
	 * @param brush
	 */
	public void paint (Graphics brush){
		brush.fillPolygon(xPoints, yPoints, nPoints);
	}
}
