package net.mrpaul.PB150.ps11.asteroids;

import java.awt.*;

public class Asteroid extends Polygon{

	public Asteroid(Point[] inShape, Point inPosition, double inRotation) {
		super(inShape, inPosition, inRotation);
	}

	// Makes the Asteroids
	public void paint(Graphics brush){
		Point[] shape = super.getPoints();
		int[] x = new int[shape.length];
		int[] y = new int[shape.length];


		brush.setColor(Color.WHITE);

		for(int i = 0; i <shape.length; i++){
			Point pos = shape[i];

			x[i] = (int)pos.getX();
			y[i] = (int)pos.getY();
		}
		brush.drawPolygon(x,y,10);
	}

	// Moves the Asteroids
	public void move(){

	}
}
