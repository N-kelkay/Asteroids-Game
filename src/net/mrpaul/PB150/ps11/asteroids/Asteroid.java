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


		brush.setColor(Color.GRAY);

		for(int i = 0; i <shape.length; i++){
			Point pos = shape[i];

			x[i] = (int)pos.getX();
			y[i] = (int)pos.getY();
		}
		brush.drawPolygon(x,y,6);
	}

	// Moves the Asteroids
	public void move(){

			int randomXY = (int)Math.random() * 5;
			//System.out.println(randomXY);
			int randomXY2 = (int)Math.random() * -5;
			//System.out.print(randomXY2);
			//Move the Asteroids:

			double changeX = super.position.getX() + 3;
		    changeX += Math.cos(Math.toRadians(rotation));
			super.position.setX(changeX);

			double changeY = super.position.getY() + 3;
			changeY -= 3*Math.sin(Math.toRadians(rotation));
			super.position.setY(changeY);


		//x boundaries
		if(super.position.getX() > 800){
			super.position.setX(0);
		}
		if(super.position.getX() < 0){
			super.position.setX(800);
		}

		//y boundaries
		if(super.position.getY() < 0){
			super.position.setY(600);
		}
		if(super.position.getY() > 600){
			super.position.setY(0);
		}
	}
}
