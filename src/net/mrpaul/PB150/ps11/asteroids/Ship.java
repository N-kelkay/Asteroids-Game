package net.mrpaul.PB150.ps11.asteroids;


import java.awt.*;

public class Ship extends Polygon{

	public Ship(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	/**
	 * draws the Ship instance
	 * @param brush
	 */
	public void paint (Graphics brush){
		Point[] shape = super.getPoints();
		int[] x = new int[shape.length];
		int[] y = new int[shape.length];
		Point pos;

		for(int i = 0; i <shape.length; i++){
			x[i] = pos.getX();
			y[i] = pos.getY();
		}
	}
}
